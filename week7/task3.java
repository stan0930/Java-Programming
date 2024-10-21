package week7;

public class task3 {
    public static void main(String[] args) {
        System.out.println("the grade is");
        ptintGrade(78.5);

        System.out.println("the grade is");
        ptintGrade(59.5);

}
        public static void ptintGrade(double grade) {
            if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
}
}