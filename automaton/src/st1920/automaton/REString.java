package st1920.automaton;

public class REString {
	public String string;
	
	public REString(String p) {
		string = p;
	}
	
	public REString makeAlpha(REString p) {
		return new REString(p.string + "a");
	}
	
	public REString makeBeta(REString p) {
		return new REString(p.string + "b");
	}
	
	public REString makeNum(REString p) {
		return new REString(p.string + "1");
	}
	
	public REString makeConcatenation(REString p, REString r) {
		return new REString(p.string + r.string);
	}
	
	public REString makeZeroOrOne(REString p) {
		return new REString(p.string + "?");
	}
	
	public REString makeZeroOrMore(REString p) {
		return new REString(p.string + "*");
	}
	
	public REString makeOneOrMore(REString p) {
		return new REString(p.string + "+");
	}
	
	public REString makeOccur1(REString p, int a) {
		return new REString(p.string + "{" + a + "}");
	}
	
	public REString makeExclude(REString p) {
		return new REString("~" + p.string);
	}
	
	public REString makeClass(REString p) {
		return new REString("[" + p.string + "]");
	}
	
	public REString makeExcludeClass(REString p) {
		return new REString("[^" + p.string + "]");
	}
	
	public REString makeAnyChar(REString p) {
		return new REString(p.string + ".");
	}
	
	public REString makeNothing(REString p) {
		return new REString(p.string + "#");
	}
	
	public REString makeAny(REString p) {
		return new REString(p.string + "@");
	}

}
