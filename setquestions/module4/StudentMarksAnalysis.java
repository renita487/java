import java.util.Scanner;

public class StudentMarksAnalysis {

    static void displayMarks(int[] marks) {
        for (int m : marks)
            System.out.print(m + " ");
        System.out.println();
    }

    static int highest(int[] marks) {
        int max = marks[0];
        for (int m : marks)
            if (m > max) max = m;
        return max;
    }

    static int lowest(int[] marks) {
        int min = marks[0];
        for (int m : marks)
            if (m < min) min = m;
        return min;
    }

    static double average(int[] marks) {
        int sum = 0;
        for (int m : marks)
            sum += m;
        return (double) sum / marks.length;
    }

    static int countAboveAverage(int[] marks, double avg) {
        int count = 0;
        for (int m : marks)
            if (m > avg) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();
        }

        displayMarks(marks);

        double avg = average(marks);

        System.out.println("Highest = " + highest(marks));
        System.out.println("Lowest = " + lowest(marks));
        System.out.println("Average = " + avg);
        System.out.println("Above Average Count = " +
                countAboveAverage(marks, avg));
    }
}