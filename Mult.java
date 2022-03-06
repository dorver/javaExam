public class Mult implements Runnable{

    int a, b;
    public Mult(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println("Mult: " + (a*b));
    }
}
