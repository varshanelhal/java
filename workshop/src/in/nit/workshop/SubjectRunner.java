package in.nit.workshop;

public class SubjectRunner {
	public static void main(String args[]) {
		Subject subject1 = new Subject();
		subject1.getSubjectDetails();
		subject1.getSubjectDetails("Math");

		Subject subject = new Subject();
		subject.getSubjectDetails("Math");
		subject.getNumberOfchar("computer");
		
	}
	

}
