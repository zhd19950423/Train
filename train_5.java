package offer_train;

import java.util.Stack;


/*
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class train_5 {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        while(!stack1.isEmpty()) {
        	int x = stack1.pop();
        	stack2.push(x);
        }
        stack1.push(node);
        while(!stack2.isEmpty()) {
        	int x = stack2.pop();
        	stack1.push(x);
        }
    }
    
    public int pop() {   	
    	return stack1.pop();
    }
}
