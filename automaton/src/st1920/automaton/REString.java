package st1920.automaton;

public class REString {
	public String string;
	
	public REString(String p) {
		string = p;
	}
	
	public REString makeAlpha(REString p) {
		return new REString(p.string + "a");
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

}
