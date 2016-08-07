package helloworld;
import javax.swing.*;
import java.awt.*;

public class HelloWorld {

    public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				HelloWorldFrame frame=new HelloWorldFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
                                frame.setResizable(true);
                                frame.setTitle("Shravan's applet");
                               
			}
		});
	}
}
class HelloWorldFrame extends JFrame
{
	public HelloWorldFrame()
	{
		setTitle("Shravan Kumar");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		HelloWorldPanel panel=new HelloWorldPanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH=300;
	public static final int DEFAULT_HEIGHT=200;
}
class HelloWorldPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.drawString("Hello world iam SHRAVAN",MESSAGE_X,MESSAGE_Y);
	}
	public static final int MESSAGE_X=75;
	public static final int MESSAGE_Y=100;
}
