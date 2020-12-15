import java.util.Scanner;

public class ReverseArrayOfStrings_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        String [] lineAsStrings = input.split(" ");

        for (int i = 0; i < lineAsStrings .length /2; i++) {
            int swapIndex = lineAsStrings.length - 1 - i;
            String oldString = lineAsStrings [i];
            lineAsStrings [i] = lineAsStrings [swapIndex ];
            lineAsStrings [swapIndex ] = oldString;
        }
        for (int i = 0; i < lineAsStrings.length; i++) {
            System.out.print(lineAsStrings  [i] + " ");
        }
    }
}
