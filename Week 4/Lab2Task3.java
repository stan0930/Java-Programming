public class task {
    public static void main(String[] args) {

        int today = 2; 


        int daysLater = 100;


        int futureDay = (today + daysLater % 7) % 7;

  
        if (futureDay == 0) {
            futureDay = 7;
        }

        System.out.println("100天后的日期是星期" + futureDay);
    }
}
