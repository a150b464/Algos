package com.interviewques.myipl;

import java.util.ArrayList;
import java.util.List;

public class InterviewImpl {

	public void findShortestPath(Vertex source) {

	}
//Find
	public void findAllRoutes(Vertex source) {

	}

	//Below method computes the sum of weights along the vertices in ArrayList listofVertices
	public void findAllWeights(ArrayList<Vertex> listOfVertices){
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");

		A.adjacentNodes = new Edge[] { new Edge(B, 8), new Edge(D, 5),
				new Edge(E, 7) };
		B.adjacentNodes = new Edge[] { new Edge(C, 4) };
		C.adjacentNodes = new Edge[] { new Edge(D, 8), new Edge(E, 2) };
		D.adjacentNodes = new Edge[] { new Edge(C, 8), new Edge(E, 6) };
		E.adjacentNodes = new Edge[] { new Edge(B, 3) };

		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(A);
		vertexList.add(A);
		vertexList.add(C);
		vertexList.add(D);
		vertexList.add(E);

		for (Vertex v : vertexList) {

		}

	}
}
