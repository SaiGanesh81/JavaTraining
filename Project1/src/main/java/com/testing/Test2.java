package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	void test() {
		LoginTesting t = new LoginTesting();
		assertEquals(1, t.isUser());
	}

}
