package st1920.automaton;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import st1920.automaton.*;

public class Task4 {
	
	/**
	 * Tests 00 to 02 were used to understand the RegExp code in order to make changes to it
	 * We debugged these test cases and followed the trace to find out where to implement the changes
	 * The rest of the cases were made to test the functionality of the code.
	 */
	@Test
	public void test00() {
		REString reString = new REString("a|b|c");
		assertTrue(REGEXWrapper.matches("a", reString));
	}
	
	@Test
	public void test01() {
		REString reString = new REString("(a+$)+");
		assertTrue(REGEXWrapper.matches("a\naaa\r\n", reString));
	}
	
	@Test
	public void test02() {
		REString reString = new REString("$");
		assertTrue(REGEXWrapper.matches("\r\n", reString));
	}
	
	@Test
	public void test03() {
		REString reString = new REString(".");
		assertTrue(REGEXWrapper.matches("\r", reString));
	}
	
	@Test
	public void test04() {
		REString reString = new REString(".");
		assertTrue(REGEXWrapper.matches("\n", reString));
	}
	
	@Test
	public void test05() {
		REString reString = new REString(".");
		assertFalse(REGEXWrapper.matches("\r\n", reString));
	}
	
	@Test
	public void test06() {
		REString reString = new REString("..");
		assertTrue(REGEXWrapper.matches("\r\n", reString));
	}
	
	@Test
	public void test07() {
		REString reString = new REString("$"); 
		assertFalse(REGEXWrapper.matches("\n\n",reString));
	}
	
	@Test
	public void test08() {
		REString reString = new REString("$"); 
		assertFalse(REGEXWrapper.matches("$",reString));
	}
	
}