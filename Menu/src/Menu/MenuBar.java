package Menu;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuBar {

	public static void main(String[] args) {
		System.out.print("Hello World");
		
		JFrame jFrame=new JFrame("Menu Bar"); // creates JFrame
		
		JPanel jPanel=new JPanel(); // creates panel 
		BoxLayout boxLayout=new BoxLayout(jPanel, BoxLayout.Y_AXIS);
		EmptyBorder emptyBorder=new EmptyBorder(20,20,20,20);
		jPanel.setBorder(emptyBorder);
		jPanel.setLayout(boxLayout);
		JLabel simpleLabel=new JLabel("Menu Bar Options"); 
		jPanel.add(simpleLabel);
		
		
		// Menu Bar Code
		JMenuBar jMenuBar=new JMenuBar();
		
		// Menu Items
		JMenu menu=new JMenu("Menu Options");
		JMenuItem dateTime=new JMenuItem("Date & Time");
		JMenuItem print=new JMenuItem("Print Date & Time");
		JMenuItem color=new JMenuItem("Change Frame to Green Hue");
		JMenuItem exit=new JMenuItem("Exit");
		
		menu.add(dateTime);
		menu.add(print);
		menu.add(color);
		menu.add(exit);
		
		jMenuBar.add(menu);
		
		
		// Setting into jFrame
		jFrame.setJMenuBar(jMenuBar);
		
		// End Code 
		
		jFrame.add(jPanel); // adds panel to jFrame
		jFrame.setSize(300, 300); // sets size of frame 
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

	}

}
