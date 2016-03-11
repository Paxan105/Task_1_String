import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный текст: ");
        String text = scanner.nextLine();
        text=text.trim();
        System.out.print("Введите символ разделения в предложении: ");
        String separator =scanner.nextLine();

        Sentence sentence = new Sentence(text,separator);

        System.out.print("Введите подстроку для замены: ");
        String word = scanner.nextLine();

        System.out.print("Введите длину слов которые необходимо заменить: ");
        int number=scanner.nextInt();

        scanner.close();


        sentence.replace(word,number);

        System.out.println("Результат: "+sentence);



    }
}
