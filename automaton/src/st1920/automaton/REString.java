package st1920.automaton;

public class REString {
	public String string = "";
	
	public REString() {}
	
	public REString(String p) {
		string = p;
	}
	
	public REString makeAlpha(REString p) {
		return new REString(p.string + "a");
	}

}
