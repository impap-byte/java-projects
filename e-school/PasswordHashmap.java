import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class PasswordHashmap {
	HashMap<String,String>userInfo= new HashMap<String,String>();
	FileReader fileReader;
	BufferedReader reader;
	File file;
	public PasswordHashmap() throws IOException {
		file = new File("./res/passwords.txt");
	}
	public HashMap userInfos() throws IOException{
		try {
			fileReader = new FileReader(file);
			reader= new BufferedReader(fileReader);
			String line;
			String id;
			String pass;
			while((line = reader.readLine())!=null){
				id=null;
				pass=null;
				id=line;
				pass = reader.readLine();
				userInfo.put(id, pass);
			}
			
			reader.close();
			//for(String i :userInfo.keySet()){
				//System.out.print(i);
				//System.out.println(userInfo.get(i));
			//}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userInfo;
	}
	public void ChangePassword(String studentNo, String newPass) throws IOException{
		userInfos();
		System.out.println("changepass");
		FileWriter fileWriter = new FileWriter(file);
		if(studentNo.equalsIgnoreCase("Student1")){
			userInfo.replace("Student1", newPass);
		}
		if(studentNo.equalsIgnoreCase("Student2")){
			userInfo.replace("Student2", newPass);
		}
		if(studentNo.equalsIgnoreCase("Student3")){
			userInfo.replace("Student3", newPass);
		}
		fileWriter.write("Student1\n");
		fileWriter.flush();
		fileWriter.write(userInfo.get("Student1")+"\n");
		fileWriter.flush();
		fileWriter.write("Student2\n");
		fileWriter.flush();
		fileWriter.write(userInfo.get("Student2")+"\n");
		fileWriter.flush();
		fileWriter.write("Student3\n");
		fileWriter.flush();
		fileWriter.write(userInfo.get("Student3")+"\n");
		fileWriter.flush();
		fileWriter.close();
		
	}
	
	
}
