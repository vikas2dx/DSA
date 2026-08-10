package Basic;

public class BasicProgram {


    public boolean isPrimeNumber(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }

    public void fibonacciNumber(int num) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < num; i++) {

            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }

    public int nthFibonacci(int num) {
        if (num <= 1) {
            return num;
        }

        return nthFibonacci(num - 1) + nthFibonacci(num - 2);
    }

    public boolean isPalidrome(int num) {
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        return num == reverse;
    }
}
