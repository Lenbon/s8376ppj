package skeleton;

import javax.swing.JFrame;

public class Skeleton extends JFrame
{
	public Skeleton() {
		setTitle("Skeleton");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 280);
		setLocationRelativeTo(null);
		setResizable(false);

		add(new Board());

		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Skeleton();
	}
}
