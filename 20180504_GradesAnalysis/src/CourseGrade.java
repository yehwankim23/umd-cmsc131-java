import java.util.HashMap;
import java.util.Map;

public class CourseGrade implements Comparable<CourseGrade> {
	private Professor professor;
	private Course course;
	private Map<String, Integer> grades;
	
	public CourseGrade (Professor professor, Course course) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public Professor getProfessor() {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public Course getCourse() {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public Map<String, Integer> getGrades() {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public void updateGrade (String grade, int numStudents) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public float getAverage () {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public int getNumGrade (String grade) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public int getNumStudents() {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	@Override
	public int compareTo(CourseGrade o) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
}