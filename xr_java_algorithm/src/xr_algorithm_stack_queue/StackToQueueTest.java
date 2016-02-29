package xr_algorithm_stack_queue;

import java.util.Stack;

/**
 * ������ջʵ�ֶ��еĲ���
 * �Ƚ��ȳ�
 * @author X.R
 *
 */
public class StackToQueueTest {
	
	public static class MyStack{
		private Stack<Integer> stack;
		
		public MyStack(){
			this.stack = new Stack<Integer>();
		}
		
		public void push(int num){
			this.stack.push(num);
		}
		
		public int pop(){
			return this.stack.pop();
		}
	}

	public static class Queue{
		private Stack<Integer> stack1;
		private Stack<Integer> stack2;

		public Queue(){
			this.stack1 = new Stack<Integer>();
			this.stack2 = new Stack<Integer>();
		}

		public void add(int num){
			stack1.push(num);
		}

		//���ص�һ��Ԫ�� ������ջ
		public int poll(){
			if(!this.stack2.isEmpty()&&!this.stack1.isEmpty()){
				System.out.println("Error!");
			}else if(this.stack2.isEmpty()){
				while(!this.stack1.isEmpty()){
					this.stack2.push(this.stack1.pop());
				}
			}
			return this.stack2.pop();
		}

		//��ջ
		public int peek(){
			if(!this.stack2.isEmpty()&&!this.stack1.isEmpty()){
				System.out.println("Error!");
			}else if(this.stack2.isEmpty()){
				while(!this.stack1.isEmpty()){
					this.stack2.push(this.stack1.pop());
				}
			}
			return this.stack2.peek();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack  myStack = new MyStack();
		myStack.push(3);
		myStack.push(4);
		myStack.push(1);
		myStack.push(2);
		myStack.push(5);
		
		System.out.println("ջΪ��");

		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		System.out.println("==============");
		Queue myQueue = new Queue();
		myQueue.add(3);
		myQueue.add(4);
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(5);

		System.out.println("����Ϊ��");

		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());

	}

}
