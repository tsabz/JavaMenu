package Menu;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuBar {

	public static void main(String[] args) {
		System.out.print("Hello World");
		
		JFrame jFrame=new JFrame("Menu Bar"); // creates JFrame
		
		JPanel jPanel=new JPanel(); // creates panel 
		BoxLayout boxLayout=new BoxLayout(jPanel, BoxLayout.Y_AXIS);
		jPanel.setLayout(boxLayout);
		
		
		jFrame.add(jPanel); // adds panel to jFrame
		jFrame.setSize(300, 300); // sets size of frame 
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

	}

}
