/**
 * Created by Pasha on 10.03.2016.
 */
public class Sentence {

      public static StringBuffer replace(StringBuffer stringBuffer, int number){

        int start,end;
        start =0;


        while (stringBuffer.indexOf(" ",start)!=-1){
            if (stringBuffer.indexOf(" ",start)!=-1){
                end = stringBuffer.indexOf(" ",start);
                if(end-start==number){
                    //    Производим замену
                    stringBuffer.delete(start, end);
                    stringBuffer.insert(start,Word.getWord());
                    start += Word.getWord().length();
                } else start = end+1 ;
            }
        }

        if (stringBuffer.indexOf(" ",start)==-1){
            end = stringBuffer.length();
            if(stringBuffer.length()-start == number){
                //   Производим замену
                stringBuffer.delete(start, end);
                stringBuffer.insert(start,Word.getWord());
            }
        }


        return stringBuffer;
    }


}
