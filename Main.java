package homeWork2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java Spring & React", 29.99);
		Course course2 = new Course(2, "C# & Angular", 39.99);
		
		Course courses[] = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.toString());
		}
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", 19);
		Instructor instructor2 = new Instructor(2, "Fatih", "Kurt", 41);
		
		Instructor instructors[] = {instructor1,instructor2};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.toString());
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.buyCourse(course2);

	}

}
