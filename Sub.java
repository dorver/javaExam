public class Sub implements Runnable{

    int a, b;
    public Sub(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println("Sub: " + (a-b));
    }
}
