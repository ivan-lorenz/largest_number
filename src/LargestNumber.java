import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestNumber {
    public static String largestNumber(String[] a) {
        StringBuilder result = new StringBuilder();
        List<Integer> digits = Arrays.stream(a).map(Integer::parseInt).collect(Collectors.toList());

        while(!digits.isEmpty()) {
            Integer maxDigit = 0;
            for(Integer digit: digits) {
                if (isGreaterOrEqual(digit,maxDigit)) {
                 maxDigit = digit;
                }
            }
            result.append(maxDigit);
            digits.remove(maxDigit);
        }

        return result.toString();
    }

    private static boolean isGreaterOrEqual(Integer a, Integer b) {
        String aByDigit = a.toString() + b.toString();
        String bByDigit = b.toString() + a.toString();

        return Integer.parseInt(aByDigit) >= Integer.parseInt(bByDigit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}

