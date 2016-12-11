package Prob3;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(new Integer(10));
        q.insert(new Integer(20));
        q.insert(new Integer(30));

        int size = q.size();
        q.reverseQueue();
        for (int i = 0; i < size; i++) {
            System.out.print(q.remove()+" ");
        }
    }
}
