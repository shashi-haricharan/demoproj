public class Application {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "";
		Student st=new Student();
		Classroom classroom=new Classroom();
		fileReader fr=new fileReader();
		fr.readFile(fr.getFile());
		st.setFields(line, fr);
		st.average(line,fr);
		classroom.getClassAverage(line, fr);
		}
	
}


