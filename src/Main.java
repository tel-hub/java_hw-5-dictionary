import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Введите слово (словарь работает с цветами) >");

        String word = keyboard.next();

        String translation = switch (word.toLowerCase()) {
            case "красный" -> "red";
            case "синий" -> "blue";
            case "зеленый" -> "green";
            case "черный" -> "black";
            case "желтый" -> "yellow";
            case "розовый" -> "pink";
            case "коричневый" -> "brown";
            case "оранжевый" -> "orange";
            default -> "";
        };

        System.out.println(translation.equals("")
                ? "Перевод слова " + word + " отсутствует в словаре"
                : "Перевод слова " + word + " -> " + translation);
    }
}
