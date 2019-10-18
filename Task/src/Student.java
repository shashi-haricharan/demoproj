import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Student {
	
	private int id;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	
	
	public Student(){
		
	}

	public Student(int id,String name,int marks1,int marks2,int marks3){
		this.id=id;
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks1() {
		return marks1;
	}


	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}


	public int getMarks2() {
		return marks2;
	}


	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}


	public int getMarks3() {
		return marks3;
	}


	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public double getSum(String line,fileReader fr) {
		String[] word;double sum=0;fr=new fileReader();Application app=new Application();
		String file=fr.getFile();Classroom classroom=new Classroom();
		BufferedReader buf=fr.getBufferedReader(file);
		try {
			while((line=buf.readLine())!=null){
			word=line.split(",");
			for(int i=0;i<=classroom.count(file);i++){
			sum=Integer.parseInt(word[2])+Integer.parseInt(word[3])+Integer.parseInt(word[4]);
			//System.out.println(sum);
			
			}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sum;
	}
	
	public double average(String line,fileReader fr){
		String[] word=null;Classroom classroom=new Classroom();
		double average=0;fr=new fileReader();
		Application app=new Application();
		String file=fr.getFile();Student st ;
		BufferedReader buf=fr.getBufferedReader(file);
			
			for(int i=0;i<=classroom.count(file);i++){
				average=getSum(line, fr)/3;
				System.out.println("Average of each student is:"+average);
			}
		return average;
	} 
	
	
	public void setFields(String line,fileReader fr){
		String[] word;
		fr=new fileReader();
		Application app=new Application();
		String app1=fr.getFile();Student st =null;
		BufferedReader buf=fr.getBufferedReader(app1);
			
			try {
				while((line=buf.readLine())!=null){
					st=new Student(id,name,marks1,marks2,marks3);
					word=line.split(",");
				setId(Integer.parseInt(word[0]));
				setName(word[1]);
				setMarks1(Integer.parseInt(word[2]));
				setMarks2(Integer.parseInt(word[3]));
				setMarks3(Integer.parseInt(word[4]));
				System.out.println(st.toString());
				}
		} 
			catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks1=" + marks1
				+ ", marks2=" + marks2 + ", marks3=" + marks3+ "]";
		
	}
	
	
}

