/**
 * Created by Pasha on 10.03.2016.
 */
import java.util.ArrayList;

public class Sentence {

       private ArrayList<Word> wordList = new ArrayList<Word>();

    public Sentence(String text) {

        getWords(text);

    }

    public void getWords(String text) {
        int start=0,end;

        while (text.indexOf(" ",start)!=-1) {

            end=text.indexOf(" ",start);
            wordList.add(new Word(text.substring(start,end)));
            start=end+1;
        }
        end = text.length();
        System.out.println(text.substring(start,end));
        wordList.add(new Word(text.substring(start,end)));
    }

    public void replace(String replaceString, int number){
        for (Word word : wordList) {
            if (word.getLength() == number){
                word.setWord(replaceString);
            }
        }
    }

    @Override
    public String toString() {
        String str="";
        for (Word word : wordList) {
            str=str+word.getWord()+" ";
        }
        return str;
    }

    }
