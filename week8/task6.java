package week8;

public class task6 {
    public static void main(String[] args) {
        float[] mylist = new float[5];

        for(int i=0; i<mylist.length; i++){
            mylist[i] = (float) (Math.random() * 10);
        }

        for(int i=0; i<mylist.length; i++){
            System.out.print(mylist[i] + " ");
        }
        float max = mylist[0];
        for(int i=1; i<mylist.length; i++){
            if(mylist[i] > max){
                max = mylist[i];
            }
        System.out.println("\nThe maximum value is " + max);
        }
    }
}
