import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Map<String, Double> studentAverages = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student full name and points ");
        while (true) {
            String studentName = scanner.nextLine();

            if (studentName.equals("!")) {
                break;
            }

            int totalPoints = 0;
            int count = 0;

            String input;
            while (!(input = scanner.nextLine()).equals("-1")) {
                int point = Integer.parseInt(input);
                totalPoints += point;
                count++;
            }

            double average = count > 0 ? (double) totalPoints / count : 0;
            studentAverages.put(studentName, average);
        }

        double highestAverage = 0;
        String studentWithHighestAverage = "";

        for (Map.Entry<String, Double> entry : studentAverages.entrySet()) {
            String student = entry.getKey();
            double average = entry.getValue();

            System.out.println(student + ": Average Point = " + average);

            if (average > highestAverage) {
                highestAverage = average;
                studentWithHighestAverage = student;
            }
        }

        System.out.println("Student with the highest average point: " + studentWithHighestAverage);
    }
}
