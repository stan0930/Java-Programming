package week6;
import java.util.Scanner;

public class task4 {
    public   static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount=0;
        int count=0;
        long startTime = System.currentTimeMillis();
        String output="";
        Scanner input=new Scanner(System.in);

        while(count<NUMBER_OF_QUESTIONS){
            int number1= (int)(Math.random()*10);
            int number2= (int)(Math.random()*10);
            if (number1<number2){
                int temp=number1;
                number1=number2;    
                number2=temp;
            }
            System.out.println("What is "+number1+" -"+number2+"?");
            int answer=input.nextInt();

            if((number1-number2)==answer){
                System.out.println("Correct!");
                correctCount++;
            }
            else
            System.out.println("You answer is wrong.\n"+number1+"-"+number2+"should be"+(number1-number2)+"\n");
            count++;
        }
        long endTime = System.currentTimeMillis();
        long testlTime = endTime - startTime;
        System.out.println("You got "+correctCount+" out of "+NUMBER_OF_QUESTIONS+" questions correct in "+testlTime+" milliseconds.");
        }
}
