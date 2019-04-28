import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	GradeBook test;
	GradeBook test2;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creates objects
		test = new GradeBook(5);
		test2 = new GradeBook(5);
		
		//add scores
		test.addScore(80);
		test.addScore(85);
		
		test2.addScore(70);
		test2.addScore(65);
		test2.addScore(75);
	}

	@AfterEach
	void tearDown() throws Exception {
		test = null;
		test2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(test.toString().equals("80.0 85.0 0.0 0.0 0.0 "));
		assertEquals(test.getScoreSize(), 2);
		
		
		assertTrue(test2.toString().equals("70.0 65.0 75.0 0.0 0.0 "));
		assertEquals(test2.getScoreSize(), 3);
		
	}

	@Test
	void testSum() {
		double sum = test.sum();
		assertEquals(165, sum);
		
		double sum2 = test2.sum();
		assertEquals(210, sum2);
	}

	@Test
	void testMinimum() {
		double min = test.minimum();
		assertEquals(80, min);
		
		double min2 = test2.minimum();
		assertEquals(65, min2);
	}

	@Test
	void testFinalScore() {
		double fscore = test.finalScore();
		assertEquals(85, fscore);
		
		double fscore2 = test2.finalScore();
		assertEquals(145, fscore2);
	}


}
