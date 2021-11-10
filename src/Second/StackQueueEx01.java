package Second;

import java.util.*;

public class StackQueueEx01 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new LinkedList();

        stack.push(0);
        stack.push(1);
        stack.push(2);

        queue.offer(7);
        queue.offer(8);
        queue.offer(9);

        System.out.println("--- Stack ---");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("--- Queue ---");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
