package ua.com.qalight.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class IOManagerTest {
	
	private static String textInFile;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		textInFile = IOManager.readTextFromFile();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		IOManager.writeTextToFile(textInFile);
	}

	@Test
	void testReadAndWriteText() {
		String testText = "AB\nCD\nEF\nGH\nIJ\n";	
		IOManager.writeTextToFile(testText);
		assertEquals(testText, IOManager.readTextFromFile());
	}

}
