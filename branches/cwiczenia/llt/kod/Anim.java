import java.awt.*; 	
import javax.swing.*;
import java.awt.event.*;

public class Anim {

    public static void main(String[] args)
    {
    	new Anim();
    }
    
    public Anim()
    {
    	SwingUtilities.invokeLater(new Runnable(){
    		public void run()
    		{
    			createGUI();
    		}
    	});
    }
    protected void createGUI()
    {
    	
    		// utworzenie okna
        final JFrame jf = new JFrame();
      
        	// okreœlenie tytu³u okna
        jf.setTitle("Anim");
      		
      		// obs³uga zamkniêcia okna JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        	// okreœlenie po³o¿enia okna
        jf.setLocation(50,50);
        
        	// uniemo¿liwienie zmiany rozmiarów okna
        jf.setResizable(false);
	       
			// utworzenie obszaru rysowania - pulpitu
		final MojPanel p = new MojPanel();

			// przycisk
		final JButton start = new JButton("Start");
		
	    jf.add(p, BorderLayout.CENTER);
		jf.add(start, BorderLayout.SOUTH);
    
        	// upakowanie okna
		jf.pack();
        	
        	// wyœwietlenie okna
        jf.setVisible(true);   
          
        	// obs³uga zdarzeñ 
        start.addActionListener(new ActionListener()
        {       	
        	MojPanel.Watek w = null;
        	public void actionPerformed(ActionEvent e)
        	{
        		if (start.getText().equals("Start")){
        			start.setText("Stop");
        			
        			w = p.new Watek();        		 	
        			w.start();
        			
        		} else {
        			start.setText("Start");
        			if (w != null)
        				w.interrupt();
        		}	
        	}
        	
        });
    }
}

class MojPanel extends JPanel 
{
	private int x = 20, y = 20;	// wspolrzedne znaku

    	// konstruktor     
    public MojPanel()
    {
          // ustalenie rozmiarów pocz¹tkowych
        setPreferredSize(new Dimension(200,200));     
    }
    
    class Watek extends Thread
    {
    	Watek(){}
    	
    	public void run()
    	{
    			// pobranie aktualnych rozmiarów panelu
    		int width = getWidth();
            int height = getHeight();
    		
    	    boolean goraDol = true;	// kierunek ruchu
    	     
    	    while (true){
    
    	    	if (goraDol){
    	    		x = x + 10;
    	    		y = y + 10;
    	    	} else {
    	    		x = x - 10;
    	    		y = y - 10;
    	    	}
    	    		 
    	    	if (x >= width || y >= height){
    	    		goraDol = false;
    	    	} else if (x <= 0 || y <= 0)
    	    		goraDol = true;
    	    	 
    	    	repaint();
    	    	
    	    	try {
    	    		Thread.sleep(500);
				} catch (InterruptedException e) {
					return;
				}
    	     
    	    }	
    	}    	
    }	// koniec Watek
        
    private int i = 0;
    
    public void paintComponent(Graphics g)
    {
        	// musi byæ jako pierwsza instrukcja
    	super.paintComponent(g);
       
        g.setColor(losujKolor());
        g.setFont(new Font("Dialog", Font.PLAIN, 20));
        
        g.drawString((char)('A'+i) + "", x, y);
        i++;    
    }
 
    private Color losujKolor()
    {
    	int r = (int)(Math.random()*256), g = (int)(Math.random()*256), b = (int)(Math.random()*256);
    	return new Color(r,g,b);
    }
}