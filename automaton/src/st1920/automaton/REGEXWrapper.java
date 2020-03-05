package st1920.automaton;

public class REGEXWrapper {
	
	public static boolean matches(String s, REString re) {
		return RegExpMatcher.matches(s, re.string);
	}
	
}
