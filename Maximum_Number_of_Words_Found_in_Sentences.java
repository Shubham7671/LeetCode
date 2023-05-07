
//

public class Maximum_Number_of_Words_Found_in_Sentences {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0; i<sentences.length; i++) {
            max = Math.max(max,sentences[i].split(" ").length);
        }
        return max;
    }

}
