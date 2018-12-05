package ua.com.qalight.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TextManipulatorTest {

	@Test
	void testGetKeyOne() {
		String value = TextManipulator.getKeyOne().get("A");

		assertEquals("M", value);
	}

	@Test
	void testGetKeyTwo() {
		String value = TextManipulator.getKeyTwo().get("A");

		assertEquals("Z", value);
	}

	@Test
	void testModifyText() {
		String text = "A%va Tr7U6$9 Iu^3fT";

		assertEquals("AVATRUIUFT", TextManipulator.modifyText(text));
	}

	@Test
	void testEncodeText() {
		String text = "AVAT";

		assertEquals("MQMY", TextManipulator.encodeText(text));
	}
}
