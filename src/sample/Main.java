package sample;

public class Main {

    public static int calculateAddNumbers(int numberOne, int numberTow) {
        return numberOne * numberTow;
    }

    public static int calculateSum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int calculateSumTwo(int numberOne, int numberTwo, int numberTre) {
        return numberOne + numberTwo + numberTre;
    }

}
    public static void main(String[] args) {
        System.out.println(calculateAddNumbers(3,6));
        System.out.println(calculateSum(4, 10));
        System.out.println(calculateSumTwo(1, 2, 3));
    }
}

