import java.util.ArrayList;
import java.util.List;

//היי חודי, לא הספקתי לבדוק את עצמי במיין בכמה שאלות

public class Main {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.newId();

        Q4 q4 = new Q4();
        q4.equation();

        int a = 4;
        int b = 2;

        Add add = new Add(a, b);
        Sub sub = new Sub(a, b);
        Mult mul = new Mult(a, b);
        Div div = new Div(a, b);

        List<Thread> threads= new ArrayList<>();

        Thread t1 = new Thread(add);
        t1.start();
        threads.add(t1);

        Thread t2 = new Thread(sub);
        t2.start();
        threads.add(t2);

        Thread t3 = new Thread(mul);
        t3.start();
        threads.add(t3);

        Thread t4 = new Thread(div);
        t4.start();
        threads.add(t4);

        for (var thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("done");

    }
}
