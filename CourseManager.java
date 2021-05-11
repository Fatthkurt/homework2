package homeWork2;

public class CourseManager {
	
	public void buyCourse(Course course) {
		System.out.println(course.getCourseName() + " kursunu " + course.getCoursePrice() + " TL ile satin aldiniz.");
	}
	
	public void addCourse(Course course) {
		System.out.println(course.getCourseName() + " kursu " + course.getCoursePrice() + " TL ile sisteme eklendi.");
	}
}