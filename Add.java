public class Add implements Runnable {

    int a, b;
    public Add(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println("Add: " + (a+b));
    }
}
