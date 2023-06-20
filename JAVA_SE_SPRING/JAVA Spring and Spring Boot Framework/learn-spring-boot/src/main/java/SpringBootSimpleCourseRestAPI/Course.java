package SpringBootSimpleCourseRestAPI;

public class Course {
	private int id;
	private String courseName;
	private String authorName;
	
	public Course(int id, String courseName, String authorName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.authorName = authorName;
	}

	public int getId() {
		return id;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getAuthorName() {
		return authorName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", authorName=" + authorName + "]";
	}
	
}
