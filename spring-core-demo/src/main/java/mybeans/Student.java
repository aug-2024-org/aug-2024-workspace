package mybeans;

public class Student {
	private String studentName;
	private int studentMark;
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

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentMark=" + studentMark + ", studentAddress="
				+ studentAddress + "]";
	}
}
