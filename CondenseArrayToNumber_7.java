import java.util.Scanner;

public class CondenseArrayToNumber_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        String [] numberAsString = input.split(" ");
        int [] numbers = new int [numberAsString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = Integer.parseInt(numberAsString [i]);
        }
        while (numbers.length > 1){
            int [] condensed = new int [numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed [i] = numbers [i] + numbers [i +1];
            }
            numbers = condensed;
        }
        System.out.println(numbers [0]);
    }
}
