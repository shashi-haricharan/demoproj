
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Classroom {

	ArrayList<Student> students;
	
	public double getClassAverage(String line,fileReader fr)  {
		double temp=0;Student st=new Student();
		int count=0;
		double sum=st.getSum(line, fr);
		double result=0;
		double average=st.average(line, fr);
		Application app=new Application();
		String file=fr.getFile();
		BufferedReader buf=fr.getBufferedReader(file);
			
		try {
				while((line=buf.readLine())!=null){
					count++;
				result=result+average;
				}
				sum=result;
				temp=result/count;
				System.out.println("Class average is:"+temp);
			} 
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return temp;
	}
	
	public int count(String FILE){
		Student st;String line="";
		int count=0;
		
		Application app=new Application();
		try(BufferedReader br=new BufferedReader(new FileReader(FILE)))
		{
			while((line=br.readLine())!=null){
				st=new Student();count++;
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
		return count;
		}
	
}

