import java.util.Scanner;

public class EvenAndOddSubtraction_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        String [] inputAsString = input.split(" ");
        int [] inputAsNumber = new int [inputAsString.length];
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        for (int i = 0; i < inputAsNumber.length; i++) {
             inputAsNumber [i] = Integer.parseInt(inputAsString [i]);
        }
        for (int number: inputAsNumber) {
            if ( number % 2 == 0){
                sumEvenNumbers += number ;
            } else {
                sumOddNumbers += number;
            }
        }
        int different = sumEvenNumbers - sumOddNumbers;
        System.out.println(different);
    }
}
