package dev.game.map;

public class Node {
	
	public enum NodeType {
		TOWN, CITY, FORT, FIELD
	}
	
	Node[] linkedNodes;
	
	private String name;
	private NodeType nodeType;
	
	public Node() {
		
	}
	
	public Node(Node[] linkedNodes, String name, NodeType type) {
		this.linkedNodes = linkedNodes;
		this.name = name;
		this.nodeType = type;
	}

	public Node[] getLinkedNodes() {
		return linkedNodes;
	}

	public void setLinkedNodes(Node[] linkedNodes) {
		this.linkedNodes = linkedNodes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NodeType getNodeType() {
		return nodeType;
	}

	public void setNodeType(NodeType nodeType) {
		this.nodeType = nodeType;
	}
	
	
}
