import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analyze {
	private List<CourseGrade> courseGrades;
	
	public Analyze () {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public void readData (String fileName) throws FileNotFoundException {
		Scanner s = new Scanner(new File(fileName));
		s.nextLine();
		
		while (s.hasNextLine()) {
			String line = s.nextLine();
			String[] data = line.split(",");
			
			Professor p = new Professor(data[2]);
			
			String course = data[0];
			
			String department = course.substring(0, 4);
			int courseNumber = Integer.valueOf(course.substring(4, 7));
			char special = '\0';
			
			if (course.length() == 8) {
				special = course.charAt(7);
			}
			
			String section = data[1];

			Course c = new Course (department, courseNumber, special, section);
			
			
			CourseGrade cg = new CourseGrade(p, c);
			
			cg.updateGrade("A+", Integer.valueOf(data[4]));
			cg.updateGrade("A", Integer.valueOf(data[5]));
			cg.updateGrade("A-", Integer.valueOf(data[6]));
			cg.updateGrade("B+", Integer.valueOf(data[7]));
			cg.updateGrade("B", Integer.valueOf(data[8]));
			cg.updateGrade("B-", Integer.valueOf(data[9]));
			cg.updateGrade("C+", Integer.valueOf(data[10]));
			cg.updateGrade("C", Integer.valueOf(data[11]));
			cg.updateGrade("C-", Integer.valueOf(data[12]));
			cg.updateGrade("D+", Integer.valueOf(data[13]));
			cg.updateGrade("D", Integer.valueOf(data[14]));
			cg.updateGrade("D-", Integer.valueOf(data[15]));
			cg.updateGrade("F", Integer.valueOf(data[16]));
			cg.updateGrade("W", Integer.valueOf(data[17]));
			cg.updateGrade("Other", Integer.valueOf(data[18]));
			
			courseGrades.add(cg);
		}
		
		s.close();
	}
	
	public float getProfessorAverage (Professor p) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public float getCourseAverage (Course c, boolean sectionOnly) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public float getDepartmentAverage (String department) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public List<Professor> getProfessorsTeachingCourse (Course course) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
	public List<Professor> getProfessorsTeachingDepartment (String department) {
        throw new UnsupportedOperationException("Remove this line and replace with your implementation.");
	}
	
}
