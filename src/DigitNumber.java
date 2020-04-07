public class DigitNumber {

    public static void main(String[] args) {
        sumDigits(125); // 1 + 2 + 5 = 8
        sumDigits(-125); // invalid number
        sumDigits(4); // 4
        sumDigits(32123);// 3 + 2 + 1 + 2 + 3 = 11
        sumDigits(0); // invalid number
    }

    public static void sumDigits(int number) {
        if (number < 1) {
            System.out.println("The number " + number + " is invalid.");
        } else {

            int sum = 0;
            // 1 step = number = 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 result = 5
            // 2 step = number = 12 -> 12 / 10 = 1.2 -> 1 * 10 = 10 -> 12 - 10 result = 2
            // 3 step = number = 1 -> 1 / 10 = 0 -> 0 * 10 = 0 -> 1 - 0 result = 1
            // sum result = 3;
            while (number > 0) {
                //extract the lest-significant digit
                int digit = number % 10;
                sum += digit;
                // drop the least-significant digit
                number /= 10; // same as number = number / 10
            }
            System.out.println("The sum of the digits are: " + sum);
        }
    }
}