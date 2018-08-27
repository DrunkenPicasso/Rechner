import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class Rechner {

    public static void main(String[] args) {

        Scanner benutzereingabe = new Scanner(System.in);

        Operation operation = new Operation();

        try {

            char operator;
            Integer zahlensystem, resultat = 0;
            String eingabe1, eingabe2, output;


            System.out.print("Wählen Sie das Zahlensystem (1 für dezimal, 2 für binär, 8 für oktal und 16 für hexadezimal): ");

            zahlensystem = benutzereingabe.nextInt();


            System.out.print("Bitte geben Sie die erste Zahl ein: ");
            eingabe1 = benutzereingabe.next();

            System.out.print("Bitte geben Sie die zweite Zahl ein: ");
            eingabe2 = benutzereingabe.next();

            System.out.print("Bitte geben Sie die gewünschte Mathe-Operation ein: ");
            operator = benutzereingabe.next().charAt(0);


            switch (operator) {

                case '+':
                    resultat = operation.addition(eingabe1, eingabe2, zahlensystem);

                    break;

                case '-':
                    resultat = operation.substraktion(eingabe1, eingabe2, zahlensystem);
                    break;

                case '*':
                    resultat = operation.multiplikation(eingabe1, eingabe2, zahlensystem);
                    break;

                case '/':
                    resultat = operation.division(eingabe1, eingabe2, zahlensystem);
                    break;

                default:
                    System.out.println("Bitte einen gültigen Operator eingeben!");
                    break;

            }

            switch (Integer.valueOf(zahlensystem)) {

                case 1:
                    output = Integer.toString(resultat);
                    System.out.println("Resultat ist: " + output);
                    break;

                case 2:
                    output = Integer.toBinaryString(resultat);
                    System.out.println("Resultat ist: " + output);
                    break;


                case 8:
                    output = Integer.toOctalString(resultat);
                    System.out.println("Resultat ist: " + output);
                    break;

                case 16:
                    output = Integer.toHexString(resultat);
                    System.out.println("Resultat ist: " + output);
                    break;
            }


        } catch (java.util.InputMismatchException e) {
            System.out.println("Falsche Eingabe: " + e);
        } catch (Exception e) {
            System.out.println("Ein Fehler ist aufgetreten" + e);
        } finally {
            benutzereingabe.close();
        }


    }
}