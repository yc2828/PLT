public class LOGONode {
	LOGONode[] children;
	String id;
	public LOGONode(String id) {
		this.id = id;
	}
	public LOGONode(String id, LOGONode[] args) {
		this.id = id;
		children = args;
	}
	public Object run(LOGOErrorHandler e) {
		return null;
	};
}