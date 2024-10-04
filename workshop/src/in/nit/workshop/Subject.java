package in.nit.workshop;

public class Subject {
	
	//properties of subject
	public String subjectName;
	public String subjectCode;
	
	//constructor
	public Subject() {
		System.out.println("default constructor");
	}
	
	// instance methods
	public void getSubjectDetails() {
		System.out.println("this is getSubjectDetails method");
	}
		
	public void getSubjectDetails(String SubjectName) {
		System.out.println("this is getSubjectDetails method");
		System.out.println("Subject name:" + SubjectName);
		
	}
	// to get the length of the given subject
	public void getNumberOfchar(String subjectName) {
		System.out.println("finding the char count");
		System.out.println("subject char count:"+subjectName.length());
		
	}
	
	}
	



