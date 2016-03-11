/**
 * Created by Pasha on 10.03.2016.
 */
public class Word {

    private String word;

    private int length;


    public Word(String word) {
        this.word = word;
        this.length = word.length();
    }


    public int getLength() {
        return length;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
        length = word.length();
    }
}
