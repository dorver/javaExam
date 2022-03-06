public class Div implements Runnable{

    int a, b;
    public Div(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println("Div: " + (float)(a/b));
    }
}
