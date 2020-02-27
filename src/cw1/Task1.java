package cw1;

import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Task1 {

	@Test
	public void testMatches() {
		assertTrue(RegExpMatcher.matches("a", "[a|b]"));	//Bug 3 Found (easy)
	}

}
