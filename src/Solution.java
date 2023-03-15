import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("task1.mask2.chop3.pop4.peach5.speech6",".")));
    }

    public static String[] getTokens(String query, String delimiter) {
        ArrayList<String> words = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        while (tokenizer.hasMoreTokens()) {
            words.add(tokenizer.nextToken());
        }
//        System.out.println(words.toString());
        String [] result = words.toArray(new String[words.size()]);
        return result;
    }
}
