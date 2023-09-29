// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Conversor de temperaturas");

        double temperaturaEmCelsius = 30;

        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.1f Celsius equivale a %.1f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);
        System.out.println(mensagem);
    }
}