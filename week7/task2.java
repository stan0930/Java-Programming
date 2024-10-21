package week7;

public class task2 {
    public static void main(String[] args) {
        int i=5;
        int j=2;
        int k=max(i,j);
        System.out.println("The maximum of "+i+" and "+j+" is "+k);
    }
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

}
}