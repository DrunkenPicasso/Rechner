public class Operation {

    // Dezimale Operationen

    double addition(double n1, double n2) {
        return (n1 + n2);
    }

    double substraktion(double n1, double n2) {
        return (n1 - n2);
    }

    double multiplikation(double n1, double n2) {
        return (n1 * n2);
    }

    double division(double n1, double n2) {
        return (n1 / n2);
    }

    // Binäre Operationen

    String binaryaddition(String n1, String n2) {
        int a = Integer.parseInt(n1, 2);
        int b = Integer.parseInt(n2, 2);
        int res = a + b;
        return Integer.toBinaryString(res);
    }

    String binarysubstraktion(String n1, String n2) {
        int a = Integer.parseInt(n1, 2);
        int b = Integer.parseInt(n2, 2);
        int res = a - b;
        return Integer.toBinaryString(res);
    }

    String binarymultiplikation(String n1, String n2) {
        int a = Integer.parseInt(n1, 2);
        int b = Integer.parseInt(n2, 2);
        int res = a * b;
        return Integer.toBinaryString(res);
    }

    String binarydivision(String n1, String n2) {
        int a = Integer.parseInt(n1, 2);
        int b = Integer.parseInt(n2, 2);
        int res = a / b;
        return Integer.toBinaryString(res);
    }

}
