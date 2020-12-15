import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String firstArrayString = scanner.nextLine();
        String [] firstNumberString = firstArrayString.split(" ");
        int [] firstArray = new int[firstNumberString .length ];

        for (int i = 0; i < firstArray.length ; i++) {
            firstArray [i] = Integer.parseInt(firstArrayString );
        }
    }
}
