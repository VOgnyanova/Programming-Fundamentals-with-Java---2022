package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentGrade = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrade.containsKey(name)) {

                studentGrade.put(name, new ArrayList<>());
            }
            studentGrade.get(name).add(grade);

        }
        Map<String, Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrade = entry.getValue();
            double avgGrade = getAverageGrade(listGrade);
            if (avgGrade >= 4.50) {
                averageGrade.put(studentName, avgGrade);
            }
        }

        averageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));

    }

    private static double getAverageGrade(List<Double> listGrade) {
        double sumGrades = 0;
        for (double grade : listGrade) {
            sumGrades += grade;
        }
        return sumGrades / listGrade.size();
    }

}
