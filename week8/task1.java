package week8;

public class task1 {
    public static void main(String[] args){
        int[] values=new int[5];
        for (int i=1;i<=5;i++){
            values[i]=i+values[i-1];
        }
        values[0]=values[1]+values[4];
        System.out.println(values[0]);
    }

}
