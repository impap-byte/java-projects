import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;




public class Mainmenu  {
	JFrame frame;
	JLabel hello,grademenu,classAverage,studentAvText,classAvText;
	Login logindata;
	String userID;
	JLabel maths,science,english,geography,history,mathsg,scienceg,geographyg,englishg,historyg,absenceText,absence,average, averageText,studentAv;
	private JButton btnLogOut;
	Mainmenu(String userID) throws IOException{
		this.userID= userID;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width=(int)screenSize.getWidth();
		int height=(int)screenSize.getHeight();
		Grades gradereader = new Grades(userID);
		logindata = new Login();
		logindata.frame.dispose();
		grademenu = new JLabel("GRADES");
		frame = new JFrame(userID+"'s Screen");
		frame.setBounds((width-400)/2,(height-400)/2,411 ,439);
		JPanel panel = new JPanel();
		System.out.println(userID);
		studentAvText = new JLabel(userID+"'s Average: ");
		studentAvText.setBackground(new Color(0, 0, 255));
		classAvText = new JLabel("Class Average: ");
		studentAv=new JLabel(Double.toString(gradereader.getPersonalAverage(gradereader.getGradeArray())));
		classAverage = new JLabel(Double.toString((new Grades("Student1").getPersonalAverage(new Grades("Student1").getGradeArray())+
				gradereader.getPersonalAverage(new Grades("Student2").getGradeArray())+new Grades("Student3").getPersonalAverage(new Grades("Student3").getGradeArray()))/3));
		System.err.println((Double.toString((new Grades("Student1").getPersonalAverage(new Grades("Student1").getGradeArray())+
				gradereader.getPersonalAverage(new Grades("Student2").getGradeArray())+new Grades("Student3").getPersonalAverage(new Grades("Student3").getGradeArray()))/3)));;
		mathsg = new JLabel(Double.toString((gradereader.getGradeArray()[0]))+"     C. Average:  "+
				(new Grades("Student1").getGradeArray()[0]+new Grades("Student2").getGradeArray()[0]+
						new Grades("Student3").getGradeArray()[0])/3);
		englishg = new JLabel(Double.toString((gradereader.getGradeArray()[1]))+"     C. Average:  "+
				(new Grades("Student1").getGradeArray()[1]+new Grades("Student2").getGradeArray()[1]+
						new Grades("Student3").getGradeArray()[1])/3);
		scienceg = new JLabel(Double.toString((gradereader.getGradeArray()[2]))+"     C. Average:  "+
				(new Grades("Student1").getGradeArray()[2]+new Grades("Student2").getGradeArray()[2]+
						new Grades("Student3").getGradeArray()[2])/3);
		historyg = new JLabel(Double.toString((gradereader.getGradeArray()[3]))+"     C. Average:  "+
				(new Grades("Student1").getGradeArray()[3]+new Grades("Student2").getGradeArray()[3]+
						new Grades("Student3").getGradeArray()[3])/3);
		geographyg = new JLabel(Double.toString((gradereader.getGradeArray()[4]))+"     C. Average:  "+
				(new Grades("Student1").getGradeArray()[4]+new Grades("Student2").getGradeArray()[4]+
						new Grades("Student3").getGradeArray()[4])/3);
		maths = new JLabel("Maths:");
		science = new JLabel("Science:");
		english = new JLabel("English:");
		geography = new JLabel("Geopraphy:");
		averageText = new JLabel("Average:");
		history = new JLabel("History:");
		absenceText = new JLabel("Absence:");
		absence = new JLabel(Double.toString(gradereader.getGradeArray()[5]));
		
		
		hello = new JLabel("WELCOME, "+userID+" !");
		hello.setForeground(Color.blue);
		hello.setFont(new Font("Bahnschrift",Font.ITALIC,30));
		grademenu.setFont(new Font("Bahnschrift",Font.ITALIC,20));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		studentAv.setFont(new Font("Bahnschrift",Font.ITALIC,20));
		classAverage.setFont(new Font("Bahnschrift",Font.ITALIC,20));
		studentAvText.setFont(new Font("Bahnschrift",Font.ITALIC,20));
		classAvText.setFont(new Font("Bahnschrift",Font.ITALIC,20));
		maths.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		mathsg.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		science.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		scienceg.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		geography.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		geographyg.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		english.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		englishg.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		history.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		historyg.setFont(new Font("Bahnschrift",Font.ITALIC,15));
		absence.setFont(new Font("Bahnschrift",Font.ITALIC,20));
		absenceText.setFont(new Font("Bahnschrift",Font.ITALIC,20));
		if(gradereader.getGradeArray()[5]>10){
			absence.setForeground(new Color(189, 133, 43));
		}
		else{
			absence.setForeground(new Color(53, 115, 66));
		}
		if(Double.parseDouble(studentAv.getText())>Double.parseDouble(classAverage.getText())){
			studentAv.setForeground(new Color(53, 115, 66));
			classAverage.setForeground(Color.RED);
		}
		else{
			studentAv.setForeground(Color.RED);
			classAverage.setForeground(new Color(53, 115, 66));
		}
		frame.setBackground(Color.gray);
		panel.setLayout(null);
		panel.setBackground(Color.lightGray);
		panel.setBounds(0, 0, 400, 406);
		panel.setOpaque(true);
		classAverage.setBounds(155, 301, 250, 30);
		studentAv.setBounds(210,265,250,30);
		maths.setBounds(15, 100, 86, 20);
		science.setBounds(15, 125, 86, 20);
		geography.setBounds(15, 150, 100, 20);
		history.setBounds(15, 175, 100, 20);
		english.setBounds(15, 200, 100, 20);
		mathsg.setBounds(105, 100, 265, 20);;
		englishg.setBounds(100, 200, 300, 20);;
		scienceg.setBounds(100, 125, 270, 20);;
		historyg.setBounds(100, 175, 300, 20);;
		geographyg.setBounds(100, 150, 270, 20);;
		grademenu.setBounds(15, 58, 300, 29);
		hello.setBounds(15,15,700,30 );
		absenceText.setBounds(15, 230, 300, 20);
		absence.setBounds(105, 230, 300, 20);
		classAvText.setBounds(12, 266, 146, 100);
		studentAvText.setBounds(12, 230, 231, 100);
		frame.getContentPane().add(panel);
		panel.add(absence);
		panel.add(absenceText);
		panel.add(maths);
		panel.add(hello);
		panel.add(science);
		panel.add(english);
		panel.add(history);
		panel.add(geography);
		panel.add(mathsg);
		panel.add(scienceg);
		panel.add(geographyg);
		panel.add(historyg);
		panel.add(englishg);
		panel.add(grademenu);
		panel.add(studentAv);
		panel.add(classAverage);
		panel.add(studentAvText);
		panel.add(classAvText);
		
		btnLogOut = new JButton("LOG OUT");
		btnLogOut.setForeground(Color.BLACK);
		btnLogOut.setFocusable(false);
		btnLogOut.setBackground(new Color(189, 133, 43));
		btnLogOut.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				int answer =JOptionPane.showConfirmDialog(frame,"Are you sure you want to log out?","Logging out...",JOptionPane.YES_NO_OPTION);
				if(answer==0){
				try {
					frame.dispose();
					Login log = new Login();
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
				
			}
		});
		btnLogOut.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 20));
		btnLogOut.setBounds(242, 334, 146, 49);
		panel.add(btnLogOut);
		frame.setVisible(true);
		}
}
