package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void test() throws SQLException {
		LoginTesting t = new LoginTesting();
		assertEquals(true, t.isConnected());
	}

}
