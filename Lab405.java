import java.util.Scanner;

public class Lab405 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input some sentence: ");
        String sentence = sc.nextLine();


        if (!sentence.endsWith(".")) {
            System.out.println("The sentence must end with full stop point: " + sentence);
        } else {

            sentence = sentence.substring(0, sentence.length() - 1);
            String[] words = sentence.split(" ");

            for (String w : words) {
                System.out.println(w);
            }
        }
    }
}
