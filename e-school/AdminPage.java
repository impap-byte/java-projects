import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Point;


public class AdminPage implements ActionListener {
	JFrame adminframe;
	JButton saveInfoButton,savePassButton,exitButton;
	JRadioButton student1,student2,student3;
	JLabel maths,english, science, history, geography,absenceText,passText;
	ButtonGroup group ;
	JTextField mathst,englisht, sciencet, historyt, geographyt,absence,pass;
	JLabel welcome,setGrades;
	JFrame frame_1;
	public AdminPage(){
		 adminframe = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width=(int)screenSize.getWidth();
		int height=(int)screenSize.getHeight();
		adminframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_1 = new JFrame("Admin's Screen");
		frame_1.setBounds((width-400)/2,(height-400)/2,700 ,500);
		frame_1.getContentPane().setLayout(null);
		frame_1.getContentPane().setBackground(Color.BLACK);
		frame_1.setResizable(false);
		saveInfoButton = new JButton("SAVE");
		saveInfoButton.setBackground(Color.BLACK);
		saveInfoButton.setFocusable(false);
		saveInfoButton.setBounds(10, 380, 250, 50);
		saveInfoButton.setForeground(Color.LIGHT_GRAY);
		savePassButton = new JButton("SAVE");
		savePassButton.setBackground(Color.BLACK);
		savePassButton.setBounds(295, 153, 149, 33);
		savePassButton.setForeground(Color.LIGHT_GRAY);
		savePassButton.setFocusable(false);
		passText = new JLabel("Change the Password of ...");
		passText.setFont(new Font("Bahnschrift",Font.BOLD,20));
		passText.setBounds(295,80,350,25);
		passText.setForeground(Color.lightGray);
		pass = new JTextField();
		pass.setBounds(295, 110, 149, 30);
		setGrades = new JLabel();
		absenceText= new JLabel("Absence:");
		absence= new JTextField();
		maths =  new JLabel("Maths:");
		science =  new JLabel("Science:");
		english =  new JLabel("English:");
		history=  new JLabel("History:");
		geography =  new JLabel("Geography:");
		student1 = new JRadioButton("Student 1");
		student2 = new JRadioButton("Student 2");
		student3 = new JRadioButton("Student 3");
		
		
		mathst = new JTextField();
		sciencet = new JTextField();
		historyt = new JTextField();
		englisht = new JTextField();
		geographyt = new JTextField();
		
		mathst.setBounds(135,84,130,20);
	
		
		sciencet.setBounds(135,134,130,20);
		englisht.setBounds(135,184,130,20);
		historyt.setBounds(135,234,130,20);
		geographyt.setBounds(135,284,130,20);
		absenceText.setBounds(10, 330, 120, 25);
		absence.setBounds(135,330, 130, 20);
		absenceText.setForeground(Color.LIGHT_GRAY);
		absenceText.setFont(new Font("Bahnschrift",Font.BOLD,20));
		student1.setForeground(Color.LIGHT_GRAY);
		student1.setFont(new Font("Bahnschrift",Font.BOLD,15));
		student1.setFocusable(false);
		student2.setForeground(Color.LIGHT_GRAY);
		student2.setFont(new Font("Bahnschrift",Font.BOLD,15));
		student2.setFocusable(false);
		student3.setForeground(Color.LIGHT_GRAY);
		student3.setFont(new Font("Bahnschrift",Font.BOLD,15));
		student3.setFocusable(false);
		group = new ButtonGroup();
		group.add(student1);
		group.add(student2);
		group.add(student3);
		welcome = new JLabel("WELCOME, ADMIN...");
		welcome.setForeground(Color.lightGray);
		welcome.setFont(new Font("Bahnschrift",Font.BOLD,30));
		welcome.setBounds(10, 14, 300, 30);
		student1.setBounds(330,14,100,30);
		student1.setBackground(Color.BLACK);
		student2.setBounds(440,14,100,30);
		student2.setBackground(Color.BLACK);
		student3.setBounds(550,14,100,30);
		student3.setBackground(Color.BLACK);
		setGrades.setBounds(10, 50, 450, 25);
		setGrades.setForeground(Color.lightGray);
		maths =  new JLabel("Maths:");
		setGrades.setFont(new Font("Bahnschrift",Font.BOLD,20));
		maths.setBounds(10,80,120,25);
		maths.setForeground(Color.lightGray);
		maths.setFont(new Font("Bahnschrift",Font.BOLD,20));
		science.setFont(new Font("Bahnschrift",Font.BOLD,20));
		science.setBounds(10,130,120,25);
		science.setForeground(Color.lightGray);
		
		english.setFont(new Font("Bahnschrift",Font.BOLD,20));
		english.setBounds(10,180,120,25);
		english.setForeground(Color.lightGray);
		
		history.setFont(new Font("Bahnschrift",Font.BOLD,20));
		history.setBounds(10,230,120,25);
		history.setForeground(Color.lightGray);
		
		geography.setFont(new Font("Bahnschrift",Font.BOLD,20));
		geography.setBounds(10,280,120,25);
		geography.setForeground(Color.lightGray);
		
		
		ImageIcon icon = new ImageIcon(".//res//folder.png");
		frame_1.setIconImage(icon.getImage());
		
		frame_1.getContentPane().add(welcome);
		frame_1.getContentPane().add(student1);
		frame_1.getContentPane().add(student2);
		frame_1.getContentPane().add(student3);
		frame_1.getContentPane().add(setGrades);
		frame_1.getContentPane().add(maths);
		frame_1.getContentPane().add(science);
		frame_1.getContentPane().add(english);
		frame_1.getContentPane().add(history);
		frame_1.getContentPane().add(geography);
		frame_1.getContentPane().add(mathst);
		frame_1.getContentPane().add(sciencet);
		frame_1.getContentPane().add(englisht);
		frame_1.getContentPane().add(historyt);
		frame_1.getContentPane().add(geographyt);
		frame_1.getContentPane().add(absenceText);
		frame_1.getContentPane().add(absence);
		frame_1.getContentPane().add(passText);
		frame_1.getContentPane().add(pass);
		frame_1.getContentPane().add(saveInfoButton);
		frame_1.getContentPane().add(savePassButton);
		
		exitButton = new JButton("LOG OUT");
		exitButton.addActionListener(this);
		exitButton.setBounds(498, 380, 130, 50);
		exitButton.setForeground(Color.LIGHT_GRAY);
		exitButton.setFocusable(false);
		exitButton.setBackground(Color.BLACK);
		exitButton.setFont(new Font("Bahnschrift",Font.PLAIN,20));
		saveInfoButton.setFont(new Font("Bahnschrift",Font.PLAIN,20));
		savePassButton.setFont(new Font("Bahnschrift",Font.PLAIN,20));
		frame_1.getContentPane().add(exitButton);
		savePassButton.addActionListener(this);
		saveInfoButton.addActionListener(this);
		student1.addActionListener(this);
		student2.addActionListener(this);
		student3.addActionListener(this);
		
		frame_1.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
		
			if(e.getSource().equals(exitButton)){
				
				int answer =JOptionPane.showConfirmDialog(frame_1,"Are you sure you want to log out?","Logging out...",JOptionPane.YES_NO_OPTION);
				if(answer==0){
					Login log = new Login();
					frame_1.dispose();
				}
			}
			if(e.getSource().equals(savePassButton)){
				System.out.println("start");
				if(pass.getText().equals("")){
					System.err.println("NO PASSWORD CHANGES");
				}
				else{
				if(student1.isSelected()){
					new PasswordHashmap().ChangePassword("Student1", pass.getText());
					System.out.println("hey");
				}
				if(student2.isSelected()){
					new PasswordHashmap().ChangePassword("Student2", pass.getText());
				}
				if(student3.isSelected()){
					new PasswordHashmap().ChangePassword("Student3", pass.getText());
				}
			}
			}
			
			if(e.getSource().equals(saveInfoButton)){
				
				if(student1.isSelected()){
				
					double[] sendGrades = new double[6]; 
					sendGrades[0]=Double.valueOf(mathst.getText());
					sendGrades[1]=Double.valueOf(englisht.getText());
					sendGrades[2]=Double.valueOf(sciencet.getText());
					sendGrades[3]=Double.valueOf(historyt.getText());
					sendGrades[4]=Double.valueOf(geographyt.getText());
					sendGrades[5]=Double.valueOf(absence.getText());
					new Grades("Student1").changeGrades(sendGrades);
				
				}
				if(student2.isSelected()){
					double[] sendGrades = new double[6]; 
					sendGrades[0]=Double.valueOf(mathst.getText());
					sendGrades[1]=Double.valueOf(englisht.getText());
					sendGrades[2]=Double.valueOf(sciencet.getText());
					sendGrades[3]=Double.valueOf(historyt.getText());
					sendGrades[4]=Double.valueOf(geographyt.getText());
					sendGrades[5]=Double.valueOf(absence.getText());
					new Grades("Student2").changeGrades(sendGrades);
				}
				if(student3.isSelected()){
					double[] sendGrades = new double[6]; 
					sendGrades[0]=Double.valueOf(mathst.getText());
					System.out.println(sendGrades[0]);
					sendGrades[1]=Double.valueOf(englisht.getText());
					System.out.println(sendGrades[1]);
					sendGrades[2]=Double.valueOf(sciencet.getText());
					System.out.println(sendGrades[2]);
					sendGrades[3]=Double.valueOf(historyt.getText());
					sendGrades[4]=Double.valueOf(geographyt.getText());
					sendGrades[5]=Double.valueOf(absence.getText());
					new Grades("Student3").changeGrades(sendGrades);
				}
			
			}
		
			if(e.getSource().equals(student1)){
			//setGrades.setText("Setting Grades and Absence of Student1...");
			
					mathst.setText(Double.toString(new Grades("Student1").getGradeArray()[0]));
					englisht.setText(Double.toString(new Grades("Student1").getGradeArray()[1]));
					sciencet.setText(Double.toString(new Grades("Student1").getGradeArray()[2]));
					historyt.setText(Double.toString(new Grades("Student1").getGradeArray()[3]));
					geographyt.setText(Double.toString(new Grades("Student1").getGradeArray()[4]));
					absence.setText(Double.toString(new Grades("Student1").getGradeArray()[5]));
					pass.setText((String) new PasswordHashmap().userInfos().get("Student1"));
					passText.setText("Change the Password of Student1:");
				
			}
			if(e.getSource().equals(student2)){
			//	setGrades.setText("Setting Grades and Absence of Student2...");
				mathst.setText(Double.toString(new Grades("Student2").getGradeArray()[0]));
				englisht.setText(Double.toString(new Grades("Student2").getGradeArray()[1]));
				sciencet.setText(Double.toString(new Grades("Student2").getGradeArray()[2]));
				historyt.setText(Double.toString(new Grades("Student2").getGradeArray()[3]));
				geographyt.setText(Double.toString(new Grades("Student2").getGradeArray()[4]));
				absence.setText(Double.toString(new Grades("Student2").getGradeArray()[5]));
				pass.setText((String) new PasswordHashmap().userInfos().get("Student2"));
				passText.setText("Change the Password of Student2:");
			}
			if(e.getSource().equals(student3)){
			//	setGrades.setText("Setting Grades and Absence of Student3...");
				mathst.setText(Double.toString(new Grades("Student3").getGradeArray()[0]));
				englisht.setText(Double.toString(new Grades("Student3").getGradeArray()[1]));
				sciencet.setText(Double.toString(new Grades("Student3").getGradeArray()[2]));
				historyt.setText(Double.toString(new Grades("Student3").getGradeArray()[3]));
				geographyt.setText(Double.toString(new Grades("Student3").getGradeArray()[4]));
				absence.setText(Double.toString(new Grades("Student3").getGradeArray()[5]));
				pass.setText((String) new PasswordHashmap().userInfos().get("Student3"));
				passText.setText("Change the Password of Student3:");
			}
			
		}
		
	catch(IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	}
}