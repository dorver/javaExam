import java.util.Scanner;

public class Q2 {

    public void checkMatrix(){
        int[][] smallMatrix = new int[10][10];
        int[][] bigMatrix = new int[40][40];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                Scanner scanner = new Scanner(System.in);
                System.out.println("please enter a number");
                int num= scanner.nextInt();
                smallMatrix[i][j] = num;
            }
        }
        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 40; j++){
                Scanner scanner = new Scanner(System.in);
                System.out.println("please enter a number");
                int num= scanner.nextInt();
                smallMatrix[i][j] = num;
            }
        }

        int k = 0;
        int l = 0;

        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 40; j++){
                if(l < 9) {
                    if (bigMatrix[i][j] == smallMatrix[k][l]) {
                        l++;
                    }
                    else{
                        k = 0;
                        l = 0;
                        break;
                    }
                }
                else if(k == 9 && l == 9){
                    System.out.println("true");
                    return;
                }
                l = 0;
                k++;
                break;
            }
            break;
        }
    }
}
