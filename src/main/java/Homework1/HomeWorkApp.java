package Homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();



    }

private static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
}

private static void checkSumSign() {
        int a = 10;
        int b = 20;
        int sum = a + b;
    System.out.println(sum);

    if (sum >= 0) {
        System.out.println("Сумма положительная");
    } else if (sum < -1) {
        System.out.println("Сумма отрицательная");
    }

}

    private static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >=1 && value <= 100 ) {
            System.out.println("Желтый");
        } else if ( value > 100 ) {
                System.out.println("Зеленый");
        }


    }


    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println(a + ">=" + b);
        } else if (a < b ) {
            System.out.println(a + "<" + b);
        }
    }

}
