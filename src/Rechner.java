import java.util.Scanner;

public class Rechner {

    public static void main(String[] args) {
        Scanner benutzereingabe = new Scanner(System.in);

        Operation operation = new Operation();


        char operator;
        Integer zahlensystem;

        try {
            System.out.print("Wählen Sie das Zahlensystem (0 für dezimal oder 1 für binary): ");
            zahlensystem = benutzereingabe.nextInt();

            if (zahlensystem == 0) {

                double eingabe1, eingabe2, resulat = 0;


                System.out.print("Bitte geben Sie die erste Zahl ein: ");
                eingabe1 = benutzereingabe.nextDouble();

                System.out.print("Bitte geben Sie die zweite Zahl ein: ");
                eingabe2 = benutzereingabe.nextDouble();

                System.out.print("Bitte geben Sie die gewünschte Mathe-Operation ein: ");
                operator = benutzereingabe.next().charAt(0);


                switch (operator) {

                    case '+':
                        resulat = operation.addition(eingabe1, eingabe2);
                        break;

                    case '-':
                        resulat = operation.substraktion(eingabe1, eingabe2);
                        break;

                    case '*':
                        resulat = operation.multiplikation(eingabe1, eingabe2);
                        break;

                    case '/':
                        resulat = operation.division(eingabe1, eingabe2);
                        break;

                    default:
                        System.out.println("Bitte einen gültigen Operator eingeben!");

                }


                System.out.println("Resultat ist: " + resulat);
            } else if (zahlensystem == 1) {

                String binresultat = null;
                String bineingabe1, bineingabe2;

                System.out.print("Bitte geben Sie die erste binäre Zahl ein: ");
                bineingabe1 = benutzereingabe.next();

                System.out.print("Bitte geben Sie die zweite binäre Zahl ein: ");
                bineingabe2 = benutzereingabe.next();

                System.out.print("Bitte geben Sie die gewünschte Mathe-Operation ein: ");
                operator = benutzereingabe.next().charAt(0);


                switch (operator) {

                    case '+':
                        binresultat = operation.binaryaddition(bineingabe1, bineingabe2);
                        break;

                    case '-':
                        binresultat = operation.binarysubstraktion(bineingabe1, bineingabe2);
                        break;

                    case '*':
                        binresultat = operation.binarymultiplikation(bineingabe1, bineingabe2);
                        break;

                    case '/':
                        binresultat = operation.binarydivision(bineingabe1, bineingabe2);
                        break;

                    default:
                        System.out.println("Bitte einen gültigen Operator eingeben!");

                }
                System.out.println("Resultat ist: " + binresultat);
            }

            benutzereingabe.close();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Falsche Eingabe: " + e);
        }

    }
}