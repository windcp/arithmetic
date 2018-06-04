package first;

import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 思路：借助栈实现，或使用递归的方法。
 */
public class C_LinkNode {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> newList = printListFromTailToHead(list);
        System.out.println(newList);
    }

    public static ArrayList<Integer> printListFromTailToHead(ArrayList<Integer> list){
        if(list == null){
            return list;
        }

        ArrayList<Integer> newList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(Integer i: list){
            stack.push(i);
        }

        while (!stack.isEmpty()){
            newList.add(stack.pop());
        }

        return newList;
    }
}
