
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PublicTests {
	Analyze analyzer;
	
	@Before
	public void prepare () throws FileNotFoundException {
		analyzer = new Analyze();
		analyzer.readData("201708_edited.csv");
	}
	
	@Test
	public void testProfessor() {
		Professor pOne = new Professor("Ilchul Yoon");
		Professor pTwo = new Professor("Ilchul Yoon");
		Professor pThree = new Professor("Roger Eastman");
		
		assertEquals("Ilchul Yoon", pOne.getName());
		assertTrue(pOne.equals(pTwo));
		assertFalse(pOne.equals(pThree));
		
	}
	
	@Test
	public void testCourse() {
		Course cOne = new Course("CMSC", 131, '\0', "-1");
		Course cTwo = new Course("CMSC", 131, '\0', "-1");
		Course cThree = new Course("CMSC", 131, 'A', "-1");
		Course cFour = new Course("CMSC", 131, 'A', "101");
		
		assertEquals("CMSC131\0", cOne.getCourse());
		assertEquals("CMSC", cOne.getDepartment());
		assertEquals("-1", cOne.getSection());
		assertEquals("0101", cFour.getSection());
		assertTrue(cOne.equals(cTwo));
		assertFalse(cOne.equals(cThree));
	}
	
	@Test
	public void testCourseGrade() {
		CourseGrade cOne = new CourseGrade(new Professor("A A"), new Course("AAAA", 000, '\0', "-1"));
		cOne.updateGrade("A+", 4);
		cOne.updateGrade("A", 4);
		cOne.updateGrade("A-", 4);
		cOne.updateGrade("B+", 4);
		cOne.updateGrade("B", 4);
		cOne.updateGrade("B-", 4);
		cOne.updateGrade("C+", 4);
		cOne.updateGrade("C", 4);
		cOne.updateGrade("C-", 4);
		cOne.updateGrade("D+", 4);
		cOne.updateGrade("D", 4);
		cOne.updateGrade("D-", 4);
		cOne.updateGrade("F", 4);
		cOne.updateGrade("W", 4);
		cOne.updateGrade("Other", 2);
		
		CourseGrade cTwo = new CourseGrade(new Professor("A A"), new Course("AAAA", 000, '\0', "-1"));
		cTwo.updateGrade("A+", 5);
		cTwo.updateGrade("A", 4);
		cTwo.updateGrade("A-", 4);
		cTwo.updateGrade("B+", 4);
		cTwo.updateGrade("B", 4);
		cTwo.updateGrade("B-", 4);
		cTwo.updateGrade("C+", 4);
		cTwo.updateGrade("C", 4);
		cTwo.updateGrade("C-", 4);
		cTwo.updateGrade("D+", 4);
		cTwo.updateGrade("D", 4);
		cTwo.updateGrade("D-", 4);
		cTwo.updateGrade("F", 4);
		cTwo.updateGrade("W", 4);
		cTwo.updateGrade("Other", 2);
		
		assertEquals("2.12", String.format("%.2f", cOne.getAverage()));
		assertEquals(2, cOne.getNumGrade("Other"));
		assertEquals(58, cOne.getNumStudents());
		assertEquals(0, cOne.compareTo(cOne));
		assertEquals(-1, cOne.compareTo(cTwo));
		assertEquals(1, cTwo.compareTo(cOne));
	}
	
	@Test
	public void testCourseData() {
		assertEquals("2.63", String.format("%.2f", analyzer.getCourseAverage(new Course("CMSC", 131, '\0', "-1"), false)));
		assertEquals("2.46", String.format("%.2f", analyzer.getCourseAverage(new Course("CMSC", 132, '\0', "-1"), false)));
		assertEquals("2.31", String.format("%.2f", analyzer.getCourseAverage(new Course("MATH", 140, '\0', "-1"), false)));
		
		assertEquals("2.63", String.format("%.2f", analyzer.getCourseAverage(new Course("CMSC", 131, '\0', "0101"), true)));
		assertEquals("2.53", String.format("%.2f", analyzer.getCourseAverage(new Course("CMSC", 131, '\0', "0401"), true)));
		
		assertEquals("-1.00", String.format("%.2f", analyzer.getCourseAverage(new Course("AAAA", 000, '\0', "-1"), false)));
	}
	
	@Test
	public void testProfessorData() {
		assertEquals("2.67", String.format("%.2f", analyzer.getProfessorAverage(new Professor("Roger D. Eastman"))));
		assertEquals("2.15", String.format("%.2f", analyzer.getProfessorAverage(new Professor("Ilchul Yoon"))));
		
		assertEquals("-1.00", String.format("%.2f", analyzer.getProfessorAverage(new Professor("A A"))));

	}
	
	@Test
	public void testDepartmentData() {
		assertEquals("2.74", String.format("%.2f", analyzer.getDepartmentAverage("CMSC")));
		assertEquals("2.50", String.format("%.2f", analyzer.getDepartmentAverage("MATH")));
	}
	
	@Test
	public void testGetProfessors() {
		List<Professor> professorsOne = analyzer.getProfessorsTeachingCourse(new Course("CMSC", 106, '\0', "-1"));
		
		assertTrue(professorsOne.contains(new Professor("Ilchul Yoon")));
		assertFalse(professorsOne.contains(new Professor("Roger D. Eastman")));
        assertFalse(hasDuplicateProfessors(professorsOne));
		
		List<Professor> professorsTwo = analyzer.getProfessorsTeachingDepartment("CMSC");
		assertTrue(professorsTwo.contains(new Professor("Ilchul Yoon")));
		assertTrue(professorsTwo.contains(new Professor("Roger D. Eastman")));
		assertFalse(professorsTwo.contains(new Professor("A A")));
		assertFalse(hasDuplicateProfessors(professorsTwo));
		
		List<Professor> professorsThree = analyzer.getProfessorsTeachingDepartment("AAAA");
		assertEquals(0, professorsThree.size());
	}
	
	public boolean hasDuplicateProfessors(List<Professor> l) {
		ArrayList<Professor> professors = new ArrayList<Professor>();
		
		for (Professor o : l) {
			if (professors.contains(o)) {
				return true;
			}
			
			professors.add(o);
		}
		
		return false;
	}
	
}
