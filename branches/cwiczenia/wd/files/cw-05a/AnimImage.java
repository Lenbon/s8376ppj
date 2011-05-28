/**
 * 5.4 Buforowanie, s.59.
 * Zestaw plikow graficznych kolejno wykreslanych w buforze i przenoszonych na ekran.
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AnimImage extends JPanel implements ActionListener
{
    int iw, ih;
    Timer timer;
    int frame = 0;
    Image offScr;
    Image[] images;
    Dimension prefSize;
    Graphics graph, offScrBuf;
            
    AnimImage(Image[] imgSet){
        images = imgSet;
        iw = images[0].getWidth(null);
        ih = images[0].getHeight(null);
        prefSize = new Dimension(iw, ih);
        timer = new Timer(500, this);
    }
    
    public void actionPerformed(ActionEvent ae){
        offScrBuf.setColor(Color.white);
        offScrBuf.fillRect(0, 0, iw, ih);
        offScrBuf.drawImage(images[frame], 0, 0, null);
        graph.drawImage(offScr, 0, 0, null);              
        frame = (frame+1)%images.length;
    }
    
    void startAnimation(){
        offScr = createImage(iw, ih);
        offScrBuf = offScr.getGraphics();
        graph = getGraphics();
        timer.start();
    }
    
    void stopAnimation(){
        timer.stop();
    }
    
    public Dimension getPreferredSize(){
        return prefSize;
    }

    public static void main(String[] args){
        Image[] images = new Image[10];
        for(int i = 0; i < images.length; i++){
            ImageIcon icon = new ImageIcon("images/Duke0" + i + ".gif");
            images[i] = icon.getImage();
        }
        final AnimImage aimage = new AnimImage(images);
        final JToggleButton runBut = new JToggleButton("START");
        runBut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(runBut.isSelected()){
                    runBut.setText("STOP ");
                    aimage.startAnimation();
                }
                else {
                    runBut.setText("START");
                    aimage.stopAnimation();
                }
            }
        });
        JFrame frame = new JFrame("AnimImage");
        Container cp = frame.getContentPane();
        //cp.setLayout();
        cp.add(aimage);
        cp.add(runBut,BorderLayout.SOUTH);
        frame.setLocation(100, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }

}

