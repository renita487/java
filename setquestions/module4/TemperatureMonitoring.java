import java.util.Scanner;

public class TemperatureMonitoring {

    static void display(double[] temp) {
        for (double t : temp)
            System.out.print(t + " ");
        System.out.println();
    }

    static double highest(double[] temp) {
        double max = temp[0];
        for (double t : temp)
            if (t > max) max = t;
        return max;
    }

    static double lowest(double[] temp) {
        double min = temp[0];
        for (double t : temp)
            if (t < min) min = t;
        return min;
    }

    static int feverCount(double[] temp) {
        int count = 0;
        for (double t : temp)
            if (t >= 38) count++;
        return count;
    }

    static double average(double[] temp) {
        double sum = 0;
        for (double t : temp)
            sum += t;
        return sum / temp.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] temp = new double[n];

        for (int i = 0; i < n; i++)
            temp[i] = sc.nextDouble();

        display(temp);

        System.out.println("Highest = " + highest(temp));
        System.out.println("Lowest = " + lowest(temp));
        System.out.println("Average = " + average(temp));
        System.out.println("Fever Patients = " + feverCount(temp));
    }
}