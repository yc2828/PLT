public class LOGOOperator extends LOGONode{
	public LOGOOperator(String id, LOGONode... args) {
		super(id, args);
	}
	public Object run(LOGOErrorHandler e) {
		Object[] childrenVal = new Object[3];
		if (id.equals("u-")){
			childrenVal[0] = children[0].run(e);
			if (childrenVal[0] == null) {
				LOGOPP.io.err("null value");
				return null;
			}
			if (childrenVal[0] instanceof String) {
				LOGOPP.io.err("wrong type");
				return null;
			}
			if (childrenVal[0] instanceof Double) {
				Double ret = (Double)childrenVal[0] * -1;
				LOGOPP.io.out("Unary minus");
				LOGOPP.io.out(ret.toString());
				return ret;
			}			
		}
		return null;
	}

}