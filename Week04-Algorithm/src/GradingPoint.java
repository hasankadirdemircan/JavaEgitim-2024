import java.util.Random;
import java.util.Scanner;

public class GradingPoint {
    public static void main(String[] args) {
        GradingPoint gradingPoint = new GradingPoint();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç tane öğrenci puanı oluşturulsun?");
        int n = scanner.nextInt();
        int[] grades = gradingPoint.generatePoints(n);

        int[] newGrades = gradingPoint.gradingStudents(grades);
        for (int grade : newGrades) {
            System.out.println(grade);
        }
    }

    public int[] generatePoints(int n) {
        Random random = new Random();
        int[] grades = new int[n];

        for(int i=0; i<n; i++) {
            grades[i] = random.nextInt(101);
        }
        return grades;
    }


    public int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (!(grade < 38)) {
                int nextMultiple = (int) (Math.ceil((double) grade / 5) * 5);
                if (nextMultiple - grade < 3) {
                    grades[i] = nextMultiple;
                }
            }
        }
        return grades;
    }
}