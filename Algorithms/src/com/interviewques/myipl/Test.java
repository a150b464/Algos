package com.interviewques.myipl;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {
	public static void main(String[] args) {
		Comparator<String> comparator = new StringLengthComparator();
		PriorityQueue<String> queue = new PriorityQueue<String>(10, comparator);
		queue.add("very long indeed");
		queue.add("short");
		queue.add("A");
		queue.add("medium");
		while (queue.size() != 0) {
			System.out.println(queue.poll());
		}
	}
}