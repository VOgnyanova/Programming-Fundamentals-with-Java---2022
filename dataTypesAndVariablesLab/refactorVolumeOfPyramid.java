package dataTypesAndVariablesLab;

import java.util.Scanner;

public class refactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Length, Width, Height = 0;
        System.out.print("Length: ");
        Length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        Width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        Height = Double.parseDouble(scanner.nextLine());
        Height = (Length * Width * Height) / 3;
        System.out.printf("Pyramid Volume: %.2f", Height);

    }
}
