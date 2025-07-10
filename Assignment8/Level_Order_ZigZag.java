package Assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_ZigZag {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Level_Order_ZigZag m = new Level_Order_ZigZag();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void levelOrderZZ() {
			// write your code here
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			int c = 1;
			while (!q.isEmpty()) {
				Node rv = q.poll();
				if (c % 2 != 0) {
					System.out.print(rv.data + " ");
					if (rv.left != null) {
						q.add(rv.left);
					}
					if (rv.right != null) {
						q.add(rv.right);
					}
				} else {
					System.out.print(rv.data + " ");
					if (rv.right != null) {
						q.add(rv.right);
					}
					if (rv.left != null) {
						q.add(rv.left);
					}
				}
				c++;
			}
		}

	}

}
