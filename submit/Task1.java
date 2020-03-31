package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Task1 {
	
	@Test
	public void testMatchesEMPTY1() {
		assertFalse(RegExpMatcher.matches("", ""));	//Bug 1 Found (easy)
	}
	
	@Test
	public void testMatchesEMPTY2() {
		assertFalse(RegExpMatcher.matches("a", ""));	//Bug 2 Found (easy)
	}
	
	@Test
	public void testMatchesOR1() {
		assertTrue(RegExpMatcher.matches("a", "(a|b|c)"));	//Bug 3 Found (easy)
	}
	
	@Test
	public void testMatchesOR2() {
		assertTrue(RegExpMatcher.matches("ab", "[a|b]"));	//Bug 3 Found (easy)
	}
	
	@Test
	public void testMatchesAND() {
		assertTrue(RegExpMatcher.matches("acb", "[a&b]"));	//Bug 3 Found (easy)
	}
	
	@Test
	public void testMatchesFOLLOW1() {
		assertTrue(RegExpMatcher.matches("vabc", "abc"));	//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesZeroOrOne1() {
		assertTrue(RegExpMatcher.matches("bca", "a?"));		//Bug 11 Found (easy)
	}
	
	@Test
	public void testMatchesZeroOrOne2() {
		assertTrue(RegExpMatcher.matches("abc", "ab?c"));		//Bug 11 Found (easy)
	}
	
	@Test
	public void testMatchesZeroOrMore() {
		assertTrue(RegExpMatcher.matches("abbbbc", "ab*bc"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesOneOrMore1() {
		assertFalse(RegExpMatcher.matches("abbbbc", "ab+bc"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesOCCUR1() {
		assertTrue(RegExpMatcher.matches("bcaaaa", "a{4}"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesOCCUR2() {
		assertTrue(RegExpMatcher.matches("bcaaaaa", "a{4,}"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesOCCUR3() {
		assertTrue(RegExpMatcher.matches("bcaaaaa", "a{4,6}"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesEXCLUDE() {
		assertTrue(RegExpMatcher.matches("deacb", "~abc"));		//Bug 15 Found (medium)
	}
	
	@Test
	public void testMatchesCLASS() {
		assertTrue(RegExpMatcher.matches("bcaaAaa", "[a-zA-Z]"));		//Bug 3 Found (easy)
	}
	
	@Test
	public void testMatches1() {
		assertTrue(RegExpMatcher.matches("def", "()ef"));		//Bug 13 Found (hard)
	}
	
	@Test
	public void testMatches2() {
		assertTrue(RegExpMatcher.matches("abc", "((a))"));		//Bug 12 Found (hard)
	}
	
	@Test
	public void testMatches3() {
		assertTrue(RegExpMatcher.matches("abcabc", "(abc)\\1"));		//Bug 4 Found (easy)
	}
	
	@Test
	public void testMatches4() {
		assertTrue(RegExpMatcher.matches("aaaa", "a{i}"));		//Bug 7 Found (medium)
	}
	
	@Test
	public void testMatches5() {
		assertTrue(RegExpMatcher.matches("a", "a{i,}"));		//Bug 7 Found (medium)
	}
	
	@Test
	public void testMatches6() {
		assertTrue(RegExpMatcher.matches("2", "<-1>"));		//Bug 9 Found (medium)
	}
	
	@Test
	public void testMatches7() {
		assertTrue(RegExpMatcher.matches("a", "[a--b]"));		//Bug 5 Found (hard)
	}
	
	@Test
	public void testMatches8() {
		assertTrue(RegExpMatcher.matches("a", "a**"));		//Bug 8 Found (medium)
	}
	
	@Test
	public void testMatches9() {
		assertTrue(RegExpMatcher.matches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a"));		//Bug 6 Found (hard)
	}
	
	@Test
	public void testMatches10() {
		assertTrue(RegExpMatcher.matches("a42a", "a*"));		//Bug 10 Found (hard)
	}
	
	@Test
	public void testMatches11() {
		assertTrue(RegExpMatcher.matches("abcdss42aasdf", "abc"));		//Bug 10 Found (hard)
	}
	
	@Test
	public void testMatches12() {
		assertTrue(RegExpMatcher.matches("zx", "[^a"));		//Bug 14 Found (medium)
	}

}
