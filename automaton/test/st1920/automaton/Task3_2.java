package st1920.automaton;
import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Task3_2 {
	
	@Test(expected = IllegalArgumentException.class)
	public void test01() {
		REString reString = new REString("(string");
		REGEXWrapper.matches("string", reString);

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test02() {
		REString reString = new REString("\"string\"");
		assertTrue(REGEXWrapper.matches("string", reString));
		REString reString1 = new REString("\"string");
		REGEXWrapper.matches("string", reString1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test03() {
		REString reString = new REString("<");
		assertFalse(REGEXWrapper.matches("3", reString));
		REString reString2 = new REString("<2-7>");
		assertTrue(REGEXWrapper.matches("5", reString2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test04() {
		REString reString = new REString("<>");
		assertFalse(REGEXWrapper.matches("", reString));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test05() {
		REString reString = new REString("<2->");
		assertFalse(REGEXWrapper.matches("string", reString));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test06() {
		REString reString2 = new REString("[^~?]");
		assertFalse(REGEXWrapper.matches("a", reString2));
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test07() {
		REString reString2 = new REString("(?P<i d>aaa)a");
		assertFalse(REGEXWrapper.matches("aaaa", reString2));
		
	}
    
	@Test(expected = IllegalArgumentException.class)
	public void test08() {
		REString reString2 = new REString("ab{0,}bc");
		assertFalse(REGEXWrapper.matches("abbbbc", reString2));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test09() {
		REString reString2 = new REString("ab{1,3}bc");
		assertFalse(REGEXWrapper.matches("abbbbc", reString2));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test10() {
		REString reString2 = new REString("ab{3,1}bc");
		assertFalse(REGEXWrapper.matches("abbbbc", reString2));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test11() {
		REString reString2 = new REString("ab{0,1}bc");
		assertFalse(REGEXWrapper.matches("abc", reString2));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test12() {
		REString reString2 = new REString("(a+|b)*");
		assertFalse(REGEXWrapper.matches("ab", reString2));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test13() {
		REString reString2 = new REString("(?i)ab{0,}?bc");
		assertFalse(REGEXWrapper.matches("ABBBBC", reString2));
		
	}
}
