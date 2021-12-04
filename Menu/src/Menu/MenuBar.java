package Menu;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MenuBar {

	public static void main(String[] args) {
		System.out.println("Program Starts"); // testing comments
		
		JFrame jFrame=new JFrame("Menu Bar"); // creates JFrame
		JPanel jPanel=new JPanel(); // creates panel 
		JTextField textBox = new JTextField(); // creates text field
		BoxLayout boxLayout=new BoxLayout(jPanel, BoxLayout.Y_AXIS); // creates box layout
		EmptyBorder emptyBorder=new EmptyBorder(20,20,20,20); // creates empty border 
		JLabel simpleLabel=new JLabel("Menu Bar Options"); // creates jLabel
		
		
		jPanel.add(simpleLabel);
		jPanel.setBorder(emptyBorder);
		jPanel.setLayout(boxLayout);
		
		
		// Menu Bar Code
		JMenuBar jMenuBar=new JMenuBar();
		JMenu menu=new JMenu("Menu Options");
		
		
		// Setting into jFrame
		jFrame.setJMenuBar(jMenuBar);
		textBox.setPreferredSize(new Dimension(200, 20));
		textBox.setEditable(true);
		
		
		// ***** DATE TIME ***** // 
		
		JMenuItem dateTime=new JMenuItem("Date & Time");
		dateTime.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("DateTime Selected"); // testing comments
				LocalDateTime currentDateTime = LocalDateTime.now();
				DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy - hh:mm:ss");
				textBox.setText(formatDateTime.format(currentDateTime));
				System.out.println("Time is " + formatDateTime.format(currentDateTime)); // testing comments
			}
		});
		
		// ***** Print Date & Time ***** //
		JMenuItem print=new JMenuItem("Print Date & Time");
		print.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Print Date Time Selected"); // testing comments
				
			}
		});
		
		
		
		JMenuItem color=new JMenuItem("Change Frame to Green Hue");
		JMenuItem exit=new JMenuItem("Exit");
		
		
		// ADDING MENU OPTIONS TO MENU
		
		menu.add(dateTime);
		menu.add(print);
		menu.add(color);
		menu.add(exit);
		
		jMenuBar.add(menu);
		
		// End Code 
		
		jFrame.add(jPanel); // adds panel to jFrame
		jFrame.setSize(300, 300); // sets size of frame 
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

	}

}
