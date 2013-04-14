public class LOGOOperator extends LOGONode{
	public LOGOOperator(String id, LOGONode... args) {
		super(id, args);
	}

	Double runAndCheck(LOGONode node) {
		Object nodeVal = node.run();
		if (LOGOPP.errorhandler.error())
			return 0.;
		if (nodeVal == null) {
			LOGOPP.errorhandler.set("null value");
			return 0.;
		}
		if (!(nodeVal instanceof Double)) {
			LOGOPP.errorhandler.set("wrong type");
			return 0.;
		}
		return (Double) nodeVal;
	}

	public Object run() {
		if (id.equals("u-")){
			Double ret = runAndCheck(children[0]);
			if (LOGOPP.errorhandler.error())
				return null;
			ret = ret * -1;
			LOGOPP.io.debug("Unary minus");
			LOGOPP.io.debug(ret.toString());
			return ret;
		}
		return null;
	}

}
