package xr_algorithm_stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * ���һ����getMin�Ĺ��ܵ�ջ
 * 
 * ��������ջ
 * 
 * @author X.R
 *
 */
public class GetMinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack1 stack1 = new MyStack1();
		stack1.push(3);
		System.out.println("��ǰջ����СֵΪ��" + stack1.getMin());
		stack1.push(4);
		System.out.println("��ǰջ����СֵΪ��" + stack1.getMin());
		stack1.push(1);
		System.out.println("��ǰջ����СֵΪ��" + stack1.getMin());
		System.out.println("��ǰջ��ջ��Ϊ��" + stack1.pop());
		System.out.println("��ǰջ����СֵΪ��" + stack1.getMin());

		System.out.println("*****�ڶ��ַ���*****");

		MyStack2 stack2 = new MyStack2();
		stack2.push(3);
		System.out.println("��ǰջ����СֵΪ��" + stack2.getMin());
		stack2.push(4);
		System.out.println("��ǰջ����СֵΪ��" + stack2.getMin());
		stack2.push(1);
		System.out.println("��ǰջ����СֵΪ��" + stack2.getMin());
		System.out.println("��ǰջ��ջ��Ϊ��" + stack2.pop());
		System.out.println("��ǰջ����СֵΪ��" + stack2.getMin());
	}

	public static class MyStack1 {
		private Stack<Integer> stack1;
		private Stack<Integer> stack2;

		public MyStack1() {
			this.stack1 = new Stack<Integer>();
			this.stack2 = new Stack<Integer>();

		}

		// ��ջ
		public void push(int num) {
			if (this.stack2.isEmpty()) {
				this.stack2.push(num);
			} else if (num <= this.getMin()) {
				this.stack2.push(num);
			}
			this.stack1.push(num);
		}

		// ��ջ
		public int pop() {
			if (this.stack1.isEmpty()) {
				System.out.println("Error!");
			}
			int temp = this.stack1.peek();
			if (temp == this.getMin()) {
				this.stack2.pop();
			}
			return temp;
		}

		// ȡ����СԪ��
		private int getMin() {
			// TODO Auto-generated method stub
			if (this.stack2.isEmpty()) {
				System.out.println("Error!");
			}
			return this.stack2.peek();
		}
	}

	public static class MyStack2 {
		private Stack<Integer> stack1;
		private Stack<Integer> stack2;

		public MyStack2() {
			this.stack1 = new Stack<Integer>();
			this.stack2 = new Stack<Integer>();

		}

		// ��ջ
		public void push(int num) {
			if (this.stack2.isEmpty()) {
				this.stack2.push(num);
			} else if (num < this.getMin()) {
				this.stack2.push(num);
			} else if (num >= this.getMin()) {
				int value = this.stack2.peek();
				this.stack2.push(value);
			}
			this.stack1.push(num);
		}

		// ��ջ
		public int pop() {
			if (this.stack1.isEmpty()) {
				System.out.println("Error!");
			}
			int temp = this.stack1.peek();
			if (temp == this.getMin()) {
				this.stack2.pop();
			}
			return temp;
		}

		// ȡ����СԪ��
		private int getMin() {
			// TODO Auto-generated method stub
			if (this.stack2.isEmpty()) {
				System.out.println("Error!");
			}
			return this.stack2.peek();
		}
	}

}
