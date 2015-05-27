package com.interviewques.myipl;

public class Edge {

	private Vertex endEdge;
	private int weight;

	public void setEndEdge(Vertex endEdge) {
		this.endEdge = endEdge;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Edge(Vertex d, int weight) {
		this.endEdge = d;
		this.weight = weight;
	}
}
