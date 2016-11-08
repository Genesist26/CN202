package Prob5;

public class TestQ5 {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(4);
        q.insert(7);
        q.insert(8);
        q.insert(3);
        q.insert(1);
        q.insert(2);
        Stack.stackify(q);

    }

}
