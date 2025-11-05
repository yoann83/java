package perso;

import java.util.Scanner;

public class TestScanner extends Log {
    public TestScanner(Boolean start) {
        super(start);
    }

    public static void main(String[] args) {
        // début d'instruction
        new TestScanner(true);

        try {
            System.out.println("Quel est ton prénom ?");
            Scanner scan = new Scanner(System.in);

            String firstName = scan.nextLine();
            System.out.println("Bonjour " + firstName);

            System.out.println("Quel âge as-tu ?");
            int age = scan.nextInt();
            System.out.println("Et tu as : " + age + "ans");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // fin d'instruction
        new TestScanner(false);
    }
}
