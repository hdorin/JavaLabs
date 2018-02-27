package lab2;

/**
 * This is the main class of the package
 * @author Haloca Dorin
 * @author Mancas Mihai Danut
 *
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("S1", "s1@info.uaic.ro");
		Student s2 = new Student("S2", "s2@info.uaic.ro");
		Student s3 = new Student("S3", "s3@info.uaic.ro");
		Student s4 = new Student("S4", "s4@info.uaic.ro");


		Project p1 = new Project("P1",2);
		Project p2 = new Project("P2",2);
		Project p3 = new Project("P3",2);
		s1.setPreferences(p1,p2,p3);
		s2.setPreferences(p1,p3,p2);
		s3.setPreferences(p1);
		s4.setPreferences(p3,p2,p1);


		Teacher t1 = new Teacher("T1","t1@info.uaic.ro");
		Teacher t2 = new Teacher("T2","t2@info.uaic.ro");
		Teacher t3 = new Teacher("T3","t3@info.uaic.ro");

		t1.setPreferences(s3,s1,s2,s4);
		t2.setPreferences(s1,s2,s3,s4);
		t3.setPreferences(s4,s3,s1,s2);

		System.out.println("here print getPreferences");
		t1.getPreferences();
		System.out.println();

		Problem prob = new Problem();
		prob.setStudents(s1,s2,s3,s4);
		prob.setTeachers(t1,t2,t3);
		System.out.println(prob);
		//System.out.println(s1);
		
	}

}
