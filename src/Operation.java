public class Operation {

    // Dezimale Operationen

    Integer addition(String n1, String n2, Integer base) {

        if (Integer.valueOf(base)==1) {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);
            return (a + b);
        }

        else {
            int a = Integer.parseInt(n1, base);
            int b = Integer.parseInt(n2, base);
            return (a + b);
        }
    }

    Integer substraktion(String n1, String n2, Integer base) {
        if (Integer.valueOf(base)==1) {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);
            return (a - b);
        }

        else {
            int a = Integer.parseInt(n1, base);
            int b = Integer.parseInt(n2, base);
            return (a - b);
        }
    }

    Integer multiplikation(String n1, String n2, Integer base) {
        if (Integer.valueOf(base)==1) {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);
            return (a * b);
        }

        else {
            int a = Integer.parseInt(n1, base);
            int b = Integer.parseInt(n2, base);
            return (a * b);
        }
    }

    Integer division(String n1, String n2, Integer base) {
        if (Integer.valueOf(base)==1) {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);
            return (a / b);
        }

        else {
            int a = Integer.parseInt(n1, base);
            int b = Integer.parseInt(n2, base);
            return (a / b);
        }
    }

}
