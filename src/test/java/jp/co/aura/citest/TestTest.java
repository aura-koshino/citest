package jp.co.aura.citest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestTest {

	@Test
	public void testTest() {
		assertThat( 0, is(0) );		
	}

	@Test
	public void testMethod() {
		assertThat( true, is(true));
	}

}
