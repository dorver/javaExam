import java.util.Scanner;

public class Q1 {

    public void newId(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name");
        String name= scanner.next();

        System.out.println("please enter your id ");
        int id = scanner.nextInt();

        int position = (id / 10) % 10;

        int numToAdd = id % 10;

        int firstNum = (int) (id / Math.pow(10, position));

        int secNum = (int) (id % Math.pow(10,position));

        int newLeftId = (int) (firstNum * 10 + numToAdd);
        String newLeft = Integer.toString(newLeftId);
        String newRight = Integer.toString(secNum);

        String newIdString = newLeft + newRight;
        System.out.println(name);
        System.out.println(newIdString);


    }
}
