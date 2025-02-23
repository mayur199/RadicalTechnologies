package example.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class MyStudentManager {

	private List<MyStudent> listOfStudents;
	
	public MyStudentManager() {
		listOfStudents = new ArrayList<MyStudent>();
	}
	
	public void addStudent(MyStudent st) {
		listOfStudents.add(st);
	}
	
	public void saveAllStudents() throws MyCustomException {
		ConvertStudentListToString convertStudentListToString = new ConvertStudentListToString();
		String convertedString = convertStudentListToString.convert(listOfStudents);
		SaveStudentToFile saveStudentToFile = new SaveStudentToFile();
		saveStudentToFile.saveToFile(convertedString);
	}
	
	public void saveStudent(MyStudent myStudent) throws MyCustomException {
		SaveStudentToFile saveStudentToFile = new SaveStudentToFile();
		saveStudentToFile.saveToFile(myStudent);
	}
}
