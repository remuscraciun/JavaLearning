import java.util.ArrayList;

public class NumberInWord {

    public static void printNumberInWord( int number ) {

        var digits = new ArrayList<String>();

        while ( number != 0 ) {

            int lastDigit = Math.abs(number % 10);
            number = number / 10;

            switch (lastDigit) {
                case 1 -> digits.add("ONE");
                case 2 -> digits.add("TWO");
                case 3 -> digits.add("THREE");
                case 4 -> digits.add("FOUR");
                case 5 -> digits.add("FIVE");
                case 6 -> digits.add("SIX");
                case 7 -> digits.add("SEVEN");
                case 8 -> digits.add("EIGHT");
                case 9 -> digits.add("NINE");
                default -> digits.add("ZERO");
            }
        }
        for ( int index = digits.size()-1 ; index >= 0 ; index-- ) System.out.print(digits.get(index)+ " ");
    }

    public static void main(String[] args) {
        printNumberInWord(8887232);
    }
}
