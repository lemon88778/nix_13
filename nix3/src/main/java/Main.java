import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner textString = new Scanner(System.in);
        System.out.println("Введите:");
        String str = textString.nextLine();

        int sizeOfStr = str.length();
        int sum = 0;
        int tempNum = 0;
        for (int i = 0; i < sizeOfStr; ++i) {
            if (Character.isDigit(str.charAt(i))) {
                tempNum = (10 * tempNum) + Character.getNumericValue(str.charAt(i));
            } else {
                sum += tempNum;
                tempNum = 0;
            }
        }
        sum += tempNum;
        System.out.println(sum);
    }
}