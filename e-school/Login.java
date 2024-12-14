import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;





public class Login  implements ActionListener{
	String idGiven;
	JButton loginButton;
	JButton resetButton;
	JTextField userIDField;
	JPasswordField userPasswordField;
	JLabel userIDLabel, userPasswordLabel,welcome,message;
	PasswordHashmap hashmapRef;
	JFrame frame = new JFrame();
	private JLabel label;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblAdmnAccount;
	Login() throws IOException{
		
		hashmapRef = new PasswordHashmap();
		int windowWidth=350;
		int windowHeight=400;
		frame = new JFrame("E-School");
		frame.setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width=(int)screenSize.getWidth();
		int height=(int)screenSize.getHeight();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.setBounds((width-windowWidth)/2,(height-windowHeight)/2,600 ,400);
		welcome = new JLabel("WELCOME!");
		resetButton= new JButton("Reset");
		resetButton.setFont(new Font("Sitka Subheading", Font.PLAIN, 17));
		loginButton= new JButton("Login");
		loginButton.setFont(new Font("Sitka Subheading", Font.PLAIN, 17));
		loginButton.setForeground(new Color(51, 51, 51));
		userIDField= new JTextField();
		userIDField.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		userPasswordField= new JPasswordField();
		userPasswordField.setFont(new Font("Sitka Subheading", Font.PLAIN, 14));
		userPasswordLabel = new JLabel("Password:");
		userIDLabel= new JLabel("User ID:");
		message= new JLabel();
	
		ImageIcon icon = new ImageIcon(".//res//icon.png");
		frame.setIconImage(icon.getImage());
		
		frame.getContentPane().setLayout(null);
		
		welcome.setBounds(194, -28, 200,93 );
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		welcome.setFont(new Font("Century Schoolbook",Font.TRUETYPE_FONT,25));
		userIDField.setBounds(129, 115, 120, 25);
		userPasswordField.setBounds(129, 171, 120, 25);
		resetButton.setBounds(150, 232, 100, 50);
		resetButton.setFocusable(false);
		loginButton.setBounds(38, 232, 100, 50);
		loginButton.setFocusable(false);
		userPasswordLabel.setBounds(38, 175, 90, 15);
		userPasswordLabel.setFont(new Font("Century Schoolbook",Font.BOLD,15));
		userIDLabel.setBounds(38, 119, 75, 15);
		userIDLabel.setFont(new Font("Century Schoolbook",Font.BOLD,15));
		message.setBounds(160, 265, 400, 100);
		message.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 25));
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().add(loginButton);
		frame.getContentPane().add(resetButton);
		frame.getContentPane().add(userIDField);
		frame.getContentPane().add(userPasswordField);
		frame.getContentPane().add(userPasswordLabel);
		frame.getContentPane().add(userIDLabel);
		frame.getContentPane().add(welcome);
		frame.getContentPane().add(message);
		
		label = new JLabel("User ID:");
		label.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		label.setBounds(325, 119, 75, 15);
		frame.getContentPane().add(label);
		
		textField = new JTextField("admin");
		textField.setEditable(false);
		textField.setFont(new Font("OCR A Extended", Font.PLAIN, 14));
		textField.setBounds(412, 115, 120, 25);
		frame.getContentPane().add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Sitka Subheading", Font.PLAIN, 14));
		passwordField.setBounds(412, 171, 120, 25);
		frame.getContentPane().add(passwordField);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		label_1.setBounds(325, 175, 90, 15);
		frame.getContentPane().add(label_1);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource().equals(button)){
					if(String.valueOf(passwordField.getPassword()).equalsIgnoreCase("Admin1")){
						frame.dispose();
						AdminPage adm = new AdminPage();
					}
					else{
						message.setForeground(Color.RED);
						message.setText("ACCESS DENIED...");
					}
				}
			}
		});
		button.setFont(new Font("Sitka Subheading", Font.PLAIN, 17));
		button.setFocusable(false);
		button.setBounds(325, 232, 100, 50);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource().equals(button_1))
				{
					passwordField.setText("");
					//hjk
				}
			}
		});
		button_1.setFont(new Font("Sitka Subheading", Font.PLAIN, 17));
		button_1.setFocusable(false);
		button_1.setBounds(437, 232, 100, 50);
		frame.getContentPane().add(button_1);
		
		JLabel lblStudent = new JLabel("STUDENT ACCOUNT");
		lblStudent.setIcon(new ImageIcon(Login.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		lblStudent.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblStudent.setBounds(38, 59, 244, 32);
		frame.getContentPane().add(lblStudent);
		
		lblAdmnAccount = new JLabel("ADMIN ACCOUNT");
		lblAdmnAccount.setIcon(new ImageIcon(Login.class.getResource("/javax/swing/plaf/metal/icons/Warn.gif")));
		lblAdmnAccount.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		lblAdmnAccount.setBounds(335, 59, 184, 32);
		frame.getContentPane().add(lblAdmnAccount);
		
		resetButton.addActionListener(this);
		loginButton.addActionListener(this);
		frame.setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(resetButton)){
			userIDField.setText("");
			userPasswordField.setText("");
			System.out.println(userIDField.getText());
	
		}
		if(e.getSource().equals(loginButton)){
			
			idGiven=userIDField.getText();
			System.out.println(idGiven);
			String passGiven=String.valueOf(userPasswordField.getPassword());
			System.out.println("login button pressed");
			try {
				
					if(hashmapRef.userInfos().containsKey(idGiven)){
						if(hashmapRef.userInfos().get(idGiven).equals(passGiven)){
							frame.dispose();
							frame = null;
							Thread.sleep(100);
							Mainmenu menu = new Mainmenu(idGiven);	 
						}
						else{
							message.setForeground(Color.RED);
							message.setText("ACCESS DENIED...");
						}
					}
					else{
						message.setForeground(Color.YELLOW);
						message.setText("USER ID NOT FOUND...");
					}
				
			} catch (IOException | InterruptedException   e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
}
