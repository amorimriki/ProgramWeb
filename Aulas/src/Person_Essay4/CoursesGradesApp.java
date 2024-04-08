package Person_Essay4;

public class CoursesGradesApp {
	public static void main(String[] args) {
		Student s1 = new Student("Ricardo Amorim","Rua da Amoreira");
		Student s2 = new Student("Jota Miguel","Rua Espinhosa");
		Student s3 = new Student("Manuel Pereira","Rua Terra Mãe");
		
		
		s1.addCourseGrade("Algoritmos", 10);
		s1.addCourseGrade("Linguagem de Programação", 14);
		s1.addCourseGrade("Eng. Software", 18);
		
		s1.printGrades();
		System.out.println(s1.getAverage());
		
		
		Teacher t1 = new Teacher ("Tiago Rui","Rua do Pinhal");
		t1.addCourse("Algoritmos");
		t1.addCourse("Linguagem de Programação");
		t1.addCourse("Eng. Software");
		t1.printCourses();
		
		t1.removeCourse("Algoritmos");
		t1.printCourses();
	}
}