package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {
    static class Students {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Students(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> listStudents = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] studentData = command.split("\\s+");

            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];

            Students currentStudents = new Students(firstName, lastName, age, homeTown);
            listStudents.add(currentStudents);

            command = scanner.nextLine();

        }
        String city = scanner.nextLine();
        for (Students student : listStudents) {
            if (student.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());

            }
        }
    }
}