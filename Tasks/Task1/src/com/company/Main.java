public class task1 {

    public static void main(String[] args) {

        System.out.println(remainder(5, 5));
        System.out.println(triArea(3, 2));
        System.out.println(animals(2, 3, 5));
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(operation(24, 15, 9));
        System.out.println(ctoa('A'));
        System.out.println(addUpTo(3));
        System.out.println(nextEdge(8, 10));
        System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        System.out.println(abcmath(5, 2, 1));


    }

    //task 1
    public static int remainder(int firstNumber, int secondNumber) {
        if (secondNumber != 0)
            return firstNumber % secondNumber;
        else
            return (int) Double.POSITIVE_INFINITY;
    }

    //task 2
    public static double triArea(int h, int a) {
        return a * h / 2;
    }

    //task 3
    public static int animals(int chickenLegs, int cowsLegs, int pigsLegs) {
        return chickenLegs * 2 + cowsLegs * 4 + pigsLegs * 4;
    }

    //task 4
    public static boolean profitableGamble(double prob, int prize, double pay) {
        return prob * prize > pay;
    }

    //task 5
    public static String operation(double N, double a, double b) {
        if (a + b == N) {
            return "added";
        } else if (a - b == N) {
            return "subtracted";
        } else if (a * b == N) {
            return "multiply";
        } else if (a / b == N) {
            return "divide";
        } else {
            return "none";
        }
    }

    //task 6
    public static int ctoa(char symbol) {
        return symbol;
    }

    //task 7
    public static int addUpTo(int lastNumber) {
        int sum = 0;
        for (int i = 1; i <= lastNumber; i++)
            sum += i;
        return sum;
    }

    //task 8
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    //task 9
    public static int sumOfCubes(int[] array) {
        int sum = 0;
        for (int i : array)
            sum += i * i * i;
        return sum;
    }

    //task 10
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return a % c == 0;
    }
}}