package Person_Essay4;

public class Teacher extends Person {
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 5;

	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];

	}

	public String toString() {
		return "Teacher: " + super.toString();
	}

	public boolean verifyExistingCourse(String course) {
		// retorna verdadeiro se existir
		// falso se não existir
		for (int i = 0; i < courses.length; i++) {
			if (course == courses[i])
				return true;
		}
		return false;
	}

	public int verifyNumberCourse(String course) {
		// retorna numero index do curso na lista
		int i;
		for (i = 0; i < courses.length; i++) {
			if (course == courses[i])
				break;
		}
		return i;
	}

	public boolean addCourse(String course) {
		if (verifyExistingCourse(course) == false) {
			courses[numCourses] = course;
			numCourses++;
			return true;
		}
		return false;
	}

	public boolean removeCourse(String course) {
		if (verifyExistingCourse(course) == true) {
			for (int i = verifyNumberCourse(course); i < courses.length; i++) {
				// para remover o ultimo curso
				if (i == courses.length - 1) {
					courses[i] = null;
					break;
				}
				// organizar a lista
				courses[i] = courses[i + 1];
			}
			numCourses--;
			return true;
		}
		return false;
	}
	public void printCourses() {
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i] );
		}
		System.out.println();
		System.out.println();
	}
}
