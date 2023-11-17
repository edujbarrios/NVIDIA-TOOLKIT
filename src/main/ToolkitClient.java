package main;

import java.util.Scanner;
import Management.NvidiaToolkit;
import ToolkitFactory.ToolkitFactory;

public class ToolkitClient {
    public static void main(String[] args) {
        ToolkitFactory factory = new ToolkitFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the graphics card family (Tesla, Fermi, Pascal): ");
        String familyType = scanner.nextLine().trim();

        try {
            // Crear y usar el toolkit para la familia elegida
            NvidiaToolkit toolkit = factory.createToolkit(familyType);
            System.out.println("Using " + familyType + " Toolkit:");
            toolkit.compile();
            toolkit.profile();
            toolkit.monitor();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
