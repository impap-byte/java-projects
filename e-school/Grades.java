import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Grades {
	File s1,s2,s3;
	FileReader fileReader;
	 BufferedReader reader;
	String studentNo;
	FileWriter fileWriter;
	Grades(String studentNo){
		this.studentNo= studentNo;
		s1 = new File("./res/Student1.txt");
		s2 = new File("./res/Student2.txt");
		s3 = new File("./res/Student3.txt");
		
	}
	double gradelist1[]= new double[6];
	double gradelist2[]= new double[6];
	double gradelist3[] = new double[6];
	public double[] getGradeArray() throws IOException{
		if(studentNo.equalsIgnoreCase("Student1")){
			fileReader = new FileReader(s1);
			reader= new BufferedReader(fileReader);
			for(int i = 0;6>i;i++){
			gradelist1[i]=Double.valueOf((reader.readLine()));
			}
			reader.close();
			
			return gradelist1;
		}
		if(studentNo.equalsIgnoreCase("Student2")){
			fileReader = new FileReader(s2);
			reader= new BufferedReader(fileReader);
			for(int i = 0;gradelist2.length>i;i++){
				gradelist2[i]=Double.valueOf(reader.readLine());
			}
			reader.close();
			return gradelist2;
		}
		if(studentNo.equalsIgnoreCase("Student3")){
			fileReader = new FileReader(s3);
			reader= new BufferedReader(fileReader);
			for(int i = 0;gradelist3.length>i;i++){
				gradelist3[i]=Double.valueOf(reader.readLine());
			}
			reader.close();
			return gradelist3;
		}
		else{
			return gradelist3;
		}
	
	}
	public double getPersonalAverage(double[] gradeList){
		
		int length =gradeList.length;
	//	System.err.println(length);
		double sum=0;
		for (int i = 0;i<5;i++) {
		//	System.out.println(sum);
			sum+=gradeList[i];
			
		    }
		
		double average=sum/5;
		return average;
			
		
	}
	public void changeGrades(double[] newGrades) throws IOException{
		if(studentNo.equals("Student1")){
			fileWriter = new FileWriter(s1);
			
			for(double writeThis:newGrades){
				fileWriter.write(String.valueOf(writeThis+"\n"));
				
			}
			fileWriter.close();
		}
		if(studentNo.equals("Student2")){
			fileWriter = new FileWriter(s2);
			
			for(double writeThis:newGrades){
				fileWriter.write(String.valueOf(writeThis+"\n"));
				
			}
			fileWriter.close();
		}
		if(studentNo.equals("Student3")){
			fileWriter = new FileWriter(s3);
			
			for(double writeThis:newGrades){
				fileWriter.write(String.valueOf(writeThis+"\n"));
				
			}
			fileWriter.close();
		}
			
		
		
	
	}
}
