package Lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple" + "\n");
    }

    public static void checkSumSign() {
        int a = 12;
        int b = 24;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная"+ "\n");
        } else {
            System.out.println("Сумма отрицательная"+ "\n");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный"+ "\n");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый"+ "\n");
        } else if (value > 100) {
            System.out.println("Зеленый"+ "\n");
        }
    }

    public static void compareNumbers() {
        int a = 8;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
