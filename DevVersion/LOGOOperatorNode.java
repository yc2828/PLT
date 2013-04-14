public class LOGOOperatorNode extends LOGONode{
	public LOGOOperatorNode(String id, LOGONode... args) {
		super(id, args);
	}

	Double runAndCheck(LOGONode node) {
		if (LOGOPP.errorhandler.error())
			return 0.;
		if (node == null) {
			LOGOPP.errorhandler.setRunTime(id, "no argument");
			return 0.;
		}
		Object nodeVal = node.run();
		if (LOGOPP.errorhandler.error())
			return 0.;
		if (nodeVal == null) {
			LOGOPP.errorhandler.setRunTime(id, "null argument");
			return 0.;
		}
		if (!(nodeVal instanceof Double)) {
			LOGOPP.errorhandler.setRunTime(id, "wrong argument type");
			return 0.;
		}
		return (Double) nodeVal;
	}

	public Object run() {
		Double ret;
		Double arg0, arg1;
		if (id.equals("u-")) {
			arg0 = runAndCheck(children[0]);
			if (LOGOPP.errorhandler.error())
				return null;
			ret = arg0 * -1;
			LOGOPP.io.debug("Unary minus");
			LOGOPP.io.debug(ret.toString());
			return ret;
		}
		if (id.equals("*")) {
			arg0 = runAndCheck(children[0]);
			arg1 = runAndCheck(children[1]);
			if (LOGOPP.errorhandler.error())
				return null;
			ret = arg0 * arg1;
			LOGOPP.io.debug("Multiply");
			LOGOPP.io.debug(ret.toString());
			return ret;
		}
		if (id.equals("/")) {
			arg0 = runAndCheck(children[0]);
			arg1 = runAndCheck(children[1]);
			if (LOGOPP.errorhandler.error())
				return null;
			if (arg0 == 0.) {
				LOGOPP.errorhandler.setRunTime(id, "devide by zero");
				return null;
			}
			ret = arg0 / arg1;
			LOGOPP.io.debug("devision");
			LOGOPP.io.debug(ret.toString());
			return ret;
		}
		if (id.equals("^")) {
			arg0 = runAndCheck(children[0]);
			arg1 = runAndCheck(children[1]);
			if (LOGOPP.errorhandler.error())
				return null;
			ret = Math.pow(arg0, arg1);
			LOGOPP.io.debug("power");
			LOGOPP.io.debug(ret.toString());
			return ret;
		}
		if (id.equals("+")) {
			arg0 = runAndCheck(children[0]);
			arg1 = runAndCheck(children[1]);
			if (LOGOPP.errorhandler.error())
				return null;
			ret = arg0 + arg1;
			LOGOPP.io.debug("plus");
			LOGOPP.io.debug(ret.toString());
			return ret;
		}
		if (id.equals("-")) {
			arg0 = runAndCheck(children[0]);
			arg1 = runAndCheck(children[1]);
			if (LOGOPP.errorhandler.error())
				return null;
			ret = arg0 - arg1;
			LOGOPP.io.debug("minus");
			LOGOPP.io.debug(ret.toString());
			return ret;
		}
		LOGOPP.errorhandler.setRunTime(id, "unrecognised operator");
		return null;		

	}
}
