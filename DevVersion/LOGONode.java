public class LOGONode {
	LOGONode[] children;
	String id;
	public LOGONode(String id, LOGONode... args) {
		this.id = id;
		children = args;
		LOGOPP.io.debug(id);
		for (LOGONode node : children)
			LOGOPP.io.debug("child: " + node.id);
	}
	public Object run() {
		return null;
	};
}