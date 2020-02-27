package cw1;

import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Task1 {
	
	@Test
	public void testMatchesEMPTY1() {
		//assertFalse(RegExpMatcher.matches("", ""));	//Bug 1 Found (easy)
	}
	
	@Test
	public void testMatchesEMPTY2() {
		//assertFalse(RegExpMatcher.matches("a", ""));	//Bug 2 Found (easy)
	}
	
	//TODO Add test cases for 0, 1 and more than 1 match
	@Test
	public void testMatchesOR1() {
		//assertTrue(RegExpMatcher.matches("a", "[a|b]"));	//Bug 3 Found (easy)
	}
	
	@Test
	public void testMatchesOR2() {
		//assertTrue(RegExpMatcher.matches("ab", "[a|b]"));	//Bug 3 Found (easy)
	}
	
	//TODO Add test cases for 0, 1 and more than 1 match 
	@Test
	public void testMatchesAND() {
		//assertTrue(RegExpMatcher.matches("acb", "[a&b]"));	//Bug 3 Found (easy)
	}
	
	//TODO Add test cases for different patterns
	@Test
	public void testMatchesFOLLOW1() {
		//assertTrue(RegExpMatcher.matches("acb", "a"));	//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesZeroOrOne1() {
		//assertTrue(RegExpMatcher.matches("bca", "a?"));		//Bug 11 Found (easy)
	}
	
	@Test
	public void testMatchesZeroOrOne2() {
		//assertTrue(RegExpMatcher.matches("bc", "a?"));		//Bug 11 Found (easy)
	}
	
	@Test
	public void testMatchesZeroOrMore() {
		//assertTrue(RegExpMatcher.matches("bcaa", "a*"));		//Bug 15 Found (easy)
	}
	
	@Test
	public void testMatchesOneOrMore2() {
		//assertFalse(RegExpMatcher.matches("bc", "a+"));		//Bug 15 Found (easy)
	}
	
	@Test
	public void testMatchesOCCUR1() {
		//assertTrue(RegExpMatcher.matches("bcaaaa", "a{4}"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesOCCUR2() {
		//assertTrue(RegExpMatcher.matches("bcaaaaa", "a{4,}"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesOCCUR3() {
		//assertTrue(RegExpMatcher.matches("bcaaaaa", "a{4,6}"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesEXCLUDE() {
		//assertTrue(RegExpMatcher.matches("deacb", "~abc"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesCLASS() {
		//assertTrue(RegExpMatcher.matches("bcaaAaa", "[a-zA-Z]"));		//Bug 3 Found (easy)
	}

}
