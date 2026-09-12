package Basic;

public class BasicProgram {


    public boolean isPrimeNumber(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }

    public boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        return num == reverse;
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

    public boolean isArmStrongNumber(int num) {

        if (num < 0) return false;

        int temp = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;

        }

        return sum == num;

    }


    public int secondLargestNumber(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;


        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contains least 2 elements");
        }

        for (int num : nums) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num < largest) {
                secondlargest = num;
            }

        }
        return secondlargest;

    }


    public int factorialRecursion(int num) {

        if (num < 0) {
            throw new IllegalArgumentException(
                    "Factorial is not defined for negative numbers"
            );
        }
        if (num == 0 || num == 1) return 1;

        return num * factorialRecursion(num - 1);
    }

    public int factorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException(
                    "Factorial is not defined for negative numbers"
            );
        }

        if (num == 0 || num == 1) return 1;


        int result = 1;

        for (int i = 2; i <= num; i++) {
            result = result * i;
        }

        return result;

    }


    public boolean isPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }


}
