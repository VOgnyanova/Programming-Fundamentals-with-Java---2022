package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class mainStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<students> StudentList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            String studentsData = scanner.nextLine();
            String name = studentsData.split(" ")[0];
            String lastName = studentsData.split(" ")[1];
            double grade = Double.parseDouble(studentsData.split(" ")[2]);


            students Student1 = new students(name, lastName, grade);
            StudentList.add(Student1);

        }
        StudentList.sort(Comparator.comparingDouble(students::getGrade).reversed());

        for (students Students1: StudentList){
            System.out.println(Students1.toString());
        }
    }
}
