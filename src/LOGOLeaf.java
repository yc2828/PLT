public class LOGOLeaf extends LOGONode{
	public LOGOLeaf(String id) {
		super(id);
	}
	public Object run(LOGOErrorHandler e) {
		LOGOPP.io.out(id);
		if (Character.isDigit(id.charAt(0))) {
			LOGOPP.io.out("is Double");
			return Double.parseDouble(id);
		}
		else {
			LOGOPP.io.out("is String");
			return id;
		}
	}

}