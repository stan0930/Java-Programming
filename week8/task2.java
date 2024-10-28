package week8;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        double[] mylist = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++){

            mylist[i] = input.nextDouble();
        }
        input.close();

    }
}
