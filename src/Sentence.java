/**
 * Created by Pasha on 10.03.2016.
 */
import java.util.ArrayList;

public class Sentence {

    private ArrayList<Word> wordList = new ArrayList<Word>();
    String text;


    public Sentence(String text,String separator) {
        this.text = text;
        for (String string : text.split(separator)){
            wordList.add(new Word(string));
        }

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
        if(wordList.size()!=0) {
            String str = "";
            for (Word word : wordList) {
                str = str + word.getWord() + " ";
            }
            return str;
        }
        return text;
    }

    }
