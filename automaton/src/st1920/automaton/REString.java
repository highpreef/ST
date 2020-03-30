package st1920.automaton;

public class REString {
	public String string;
	
	public REString(String p) {
		string = p;
	}
	
	public REString makeAlpha(REString p) {
		return new REString(p.string + "a");
	}

	public REString makeAnd(REString p, REString q) {
		return new REString(p.string + "&" + q.string);
	}
	
	public REString makeOr(REString p, REString q) {
		return new REString(p.string + "|" + q.string);
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
	
	public REString makeRange(REString p, int a, int b) {
		return new REString(p.string + "{" + a + "," + b + "}");
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
	
	public REString makeGroup(REString p) {
		return new REString("(" + p.string + ")");
	}
	
	public REString makeRep(REString p, int a, int b) {
		return new REString(p.string + "<" + a + "-" + b + ">");
	}

}
