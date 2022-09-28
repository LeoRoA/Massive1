public class Main {
    public static void main(String[] args) {

        int[] massive1 = new int[3];
        massive1[0] = 1;
        massive1[1] = 2;
        massive1[2] = 3;
        double[] massive2 = {1.57, 7.654, 9.986};
        boolean[] massive3 = {true, false};


        System.out.println("Task2:");
        System.out.println("Массив 1: ");
        for (int i = 0; i < massive1.length; i++) {
            if (i != massive1.length-1) {
                System.out.print(massive1[i]+", ");
            }
            else System.out.println(massive1[i]);
        }
        System.out.println("Массив 2: ");
        for (int i = 0; i < massive2.length; i++) {
            if (i != massive2.length-1) {
                System.out.print(massive2[i]+", ");
            }
            else System.out.println(massive2[i]);

        }
        System.out.println("Массив 3: ");
        for (int i = 0; i < massive3.length; i++) {
            if (i != massive3.length-1) {
                System.out.print(massive3[i]+", ");
            }
            else System.out.println(massive3[i]);
        }

        System.out.println("Task3:");
        System.out.println("Массив 1: ");
        for (int i = massive1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(massive1[i]+", ");
            }
            else System.out.println(massive1[i]);
        }
        System.out.println("Массив 2: ");
        for (int i = massive2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(massive2[i]+", ");
            }
            else System.out.println(massive2[i]);
        }
        System.out.println("Массив 3: ");
        for (int i = massive3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(massive3[i]+", ");
            }
            else System.out.println(massive3[i]);
        }

        System.out.println("Task4:");
        System.out.println("Массив 1: ");
        for (int i = 0; i < massive1.length; i++) {
            if (massive1[i] % 2 != 0) {
                massive1[i] += 1;
            }
            System.out.println(massive1[i]);
        }
    }
}