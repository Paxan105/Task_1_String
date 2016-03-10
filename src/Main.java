import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
          int number;

        System.out.print("Введите начальный текст: ");
        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());

        System.out.print("Введите подстроку для замены: ");
        Word.setWord(scanner.nextLine());

        System.out.print("Введите длину слов которые необходимо заменить: ");
        number=scanner.nextInt();

        scanner.close();

        Sentence.replace(stringBuffer,number);

        System.out.println("Результат: " + stringBuffer);





    }
}
