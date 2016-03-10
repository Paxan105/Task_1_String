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

        int start,end;
        start =0;

        
        while (stringBuffer.indexOf(" ",start)!=-1){
            if (stringBuffer.indexOf(" ",start)!=-1){
             end = stringBuffer.indexOf(" ",start);
                if(end-start==number){
                //    Производим замену
                    Sentence.replace(stringBuffer,start,end);
                    start += Word.getWord().length();
                } else start = end+1 ;
            }
        }

        if (stringBuffer.indexOf(" ",start)==-1){
            end = stringBuffer.length();
            if(stringBuffer.length()-start == number){
               //   Производим замену
                Sentence.replace(stringBuffer,start,end);
            }
        }
        System.out.println("Результат: " + stringBuffer);






    }
}
