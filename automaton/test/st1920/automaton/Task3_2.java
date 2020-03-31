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
	
	
	@Test
	public void test06() {
		REString reString2 = new REString("[^~?]");
		assertFalse(REGEXWrapper.matches("aaa", reString2));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test07() {
		REString reString2 = new REString("(?P<i d>aaa)a");
		assertFalse(REGEXWrapper.matches("aaaa", reString2));
	}
    
	@Test
	public void test08() {
		REString reString2 = new REString("ab{0,}bc");
		assertTrue(REGEXWrapper.matches("abbbbc", reString2));	
	}
	
	@Test
	public void test09() {
		REString reString2 = new REString("ab{1,3}bc");
		assertTrue(REGEXWrapper.matches("abbbbc", reString2));	
	}
	
	@Test
	public void test10() {
		REString reString2 = new REString("ab{3,1}bc");
		assertFalse(REGEXWrapper.matches("abbbbc", reString2));
	}
	
	@Test
	public void test11() {
		REString reString2 = new REString("ab{0,1}bc");
		assertTrue(REGEXWrapper.matches("abc", reString2));
		
	}
	
	@Test
	public void test12() {
		REString reString2 = new REString("(a+|b)*");
		assertTrue(REGEXWrapper.matches("ab", reString2));
	}
	
	@Test
	public void test13() {
		REString reString2 = new REString("(?i)ab{0,}?bc");
		assertFalse(REGEXWrapper.matches("ABBBBC", reString2));
	}
	
	@Test
	public void test14() {
		REString reString2 = new REString("^#?([a-f0-9]{6}|[a-f0-9]{3})$\n" + 
				"");
		assertFalse(REGEXWrapper.matches("ABBBBC", reString2));
	}
	
	@Test
	public void test15() {
		REString reString2 = new REString("<0-0>");
		assertFalse(REGEXWrapper.matches("[~..]<0-1>", reString2));
	}
	
	@Test
	public void test16() {
		REString reString2 = new REString("/^[a-z0-9_-]{3,16}$/");
		assertFalse(REGEXWrapper.matches("my-us3r_n4m3", reString2));
	}
	
	@Test
	public void test17() {
		REString reString2 = new REString("/^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$/");
		assertFalse(REGEXWrapper.matches("https://net.tutsplus.com/about", reString2));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test18() {
		REString reString2 = new REString("~b&<>");
		assertFalse(REGEXWrapper.matches("b", reString2));
	}
	
}
