package Menu;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class MenuBar {

	public static void main(String[] args) {
		System.out.println("Program Starts"); // testing comments
		
		JFrame jFrame=new JFrame("Menu Bar"); // creates JFrame
		JPanel jPanel=new JPanel(); // creates panel 
		JTextField textBox = new JTextField(); // creates text field
		BoxLayout boxLayout=new BoxLayout(jPanel, BoxLayout.Y_AXIS); // creates box layout
		EmptyBorder emptyBorder=new EmptyBorder(20,20,20,20); // creates empty border 
		JLabel simpleLabel=new JLabel("Welcome to the Menu Bar!"); // creates jLabel
		
		jPanel.add(simpleLabel);
		jPanel.setBorder(emptyBorder);
		jPanel.setLayout(boxLayout);
//		jPanel.setBackground(Color.blue);
		
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
				String userText = textBox.getText();

				try(FileWriter writer=new FileWriter("Log.txt"); 
					BufferedWriter bw=new BufferedWriter(writer)) {
					
					bw.write(userText);
				} catch (IOException e1) {
					System.err.format("IOException: %s%n", e1);
				}
				
			}
		});
		
		// ***** Color ***** //
		
		JMenuItem color=new JMenuItem("Change Frame to Green Hue");
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Random Green color selected"); // testing comments
				Random rand = new Random();
				int r = rand.nextInt(60);
				int g = rand.nextInt(220);
				int b = rand.nextInt(60);
				
				Color c=new Color(r,g,b);
				jPanel.setBackground(c);
			}
		});
		
		// ***** Exit ***** //
		
		JMenuItem exit=new JMenuItem("Exit");
		
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
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


//References

// https://mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/
// https://www.youtube.com/watch?v=mhPGxzY8zW0




