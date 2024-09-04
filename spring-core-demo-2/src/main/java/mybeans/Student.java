package mybeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	@Value("Raja")
	private String studentName;
	
	@Value("80")
	private int studentMark;
	
	@Autowired // field injection
	private Address studentAddress;
	
	public Student() {}

	public Student(String studentName, int studentMark, Address studentAddress) {
		super();
		this.studentName = studentName;
		this.studentMark = studentMark;
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMark() {
		return studentMark;
	}

	public void setStudentMark(int studentMark) {
		this.studentMark = studentMark;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	//@Autowired // - setter injection
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentMark=" + studentMark + ", studentAddress="
				+ studentAddress + "]";
	}
}
