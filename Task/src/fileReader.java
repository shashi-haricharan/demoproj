import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class fileReader {

	
	public static final String FILE="C:/Users/shashi h/Desktop/students.csv";
	
	public static String getFile() {
		return FILE;
	}
	
	public String readFile(String FILE){
		
		Student st = new Student();String line="";
		Application app=new Application();
		fileReader fr=new fileReader();
			try(BufferedReader br=new BufferedReader(new FileReader(FILE)))
			{
				while((line=br.readLine())!=null){
					st.getSum(line, fr);
					}
			} 
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
			catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println(line);
		return line;
		}
	
	
	public BufferedReader getBufferedReader(String FILE){
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(FILE));
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return br;
	}
}
	