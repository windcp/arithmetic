package first;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 一个栈压入元素，而另一个栈作为缓冲，将栈1的元素出栈后压入栈2中。
 * 也可以将栈1中的最后一个元素直接出栈，而不用压入栈2中再出栈。
 */
public class E_StackToQueen {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void queenPush(Integer i){
        stack1.push(i);
    }

    public Integer queenPop() throws Exception {
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new Exception("栈为空！");
        }

        if (stack2.isEmpty()){
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }
}
