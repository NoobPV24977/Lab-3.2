import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текстовий рядок:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        int oddLengthCount = 0;
        for (String word : words) {
            if (word.length() % 2 != 0) {
                oddLengthCount++;
            }
        }
        System.out.println("Кількість слів з непарною довжиною: " + oddLengthCount);

        System.out.print("Введіть літеру для підрахунку частоти входження: ");
        char target = scanner.next().charAt(0);

        int frequency = 0;
        for (char c : input.toCharArray()) {
            if (c == target) {
                frequency++;
            }
        }
        System.out.println("Частота входження літери '" + target + "': " + frequency);

        String withoutParentheses = input.replaceAll("\\([^)]*\\)", "");
        System.out.println("Текст без частин у круглих дужках:");
        System.out.println(withoutParentheses.trim());
    }
}
