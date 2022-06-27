import java.util.Scanner;

public class Main {
    static String data = "<<code>>";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number < 5) {

            System.out.println("Lütfen kaç tane  kelime gireceğinizi seçiniz? (en az 5)");
            number = scanner.nextInt();
            if (number < 5) {
                System.out.println("lütfen en az 5 giriniz");
            }
        }
        String[] words = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Lütfen " + (i + 1) + ". kelimeyi giriniz");
            words[i] = scanner.next();
        }
        System.out.println(parameter(words));

    }

    public static String parameter(String[] array) {
        String result = " ";
        for (String s : array) {
            if (s.equals(data)) {
                result = "Tanımlı value yu içeren String deger:" + s;
                break;
            } else {
                result = "tanımlı valueyu içeren string değer bulunamadı";
            }
        }
        return result;
    }
}

