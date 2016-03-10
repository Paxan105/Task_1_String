/**
 * Created by Pasha on 10.03.2016.
 */
public class Sentence {

    public static StringBuffer replace(StringBuffer stringBuffer,int start, int end){

        stringBuffer.delete(start, end);

        stringBuffer.insert(start,Word.getWord());

        return stringBuffer;
    }

}
