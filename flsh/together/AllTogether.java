package flsh.together;

import flsh.admin.Admin;
import flsh.common.Common;
import flsh.teaching.Teaching;
import flsh.student.Student;
import flsh.teacher.Teacher;

public class AllTogether{
	public static void main(String[] args) {
		int numberStudent = 0;
		Common com = new Common("Malala", "Nomenjanahary", 24, "Ankatso II", "malala@tiana.com", "+234 45 68 435");
		Common std = new Common("Manitra", "Nomena", 18, "Ankatso IIII", "manitra@ankatsoIIII.com", "+235 45 68 435");
		Common tcher = new Common("Dr. Nante", "Nante", 56, "Home Here", "nantenante@home.com", "+34 123 45");
		Admin adm = new Admin("Nitoki", "tokitoki", com);
		Teaching teach = new Teaching("English modern", 3, "12/05/2019", "Grande Salle");
        Teacher teacher = new Teacher("Doctorat", "Teacher of Civilisation", tcher);
	    Student stud = new Student("L1", "P", "ENG00012019", std);
	    numberStudent += 1;

	    // printing
		System.out.println("==========================================");
		System.out.println("Pseudo: " + adm.getPseudo());
		System.out.println("Password: " + adm.getPassword());
		System.out.println("==========================================");
		System.out.println("Name: " + adm.common.getName());
		System.out.println("Last Name: " + adm.common.getLastName());
		System.out.println("Age: " + adm.common.getAge());
		System.out.println("Address: " + adm.common.getAddress());
		System.out.println("Email: " + adm.common.getEmail());
		System.out.println("Contact: " + adm.common.getContact());
		System.out.println("==========================================");
	    System.out.println("Number of Student: " + numberStudent);
		System.out.println("Teaching: " + teach.getTitle());
		System.out.println("Duration: " + teach.getDuration() + "h");
		System.out.println("Teacher: " + teacher.common.getName() + " " + teacher.common.getLastName());
		System.out.println("==========================================");
	}
}