import java.util.HashSet;
import java.util.Set;


public class wordCounter {
    public static int wordCounter(String str){
        if(isNullOrEmpty(str))
            return 0;
        str = str.replaceAll("\\p{Punct}", "");

        Set<String> noInString = new HashSet<String>();
        String[] words = str.split(" ");
        for(String wrd:words){
            noInString.add(wrd);
        }
        return noInString.size();
    }
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
    public static void main(String[] args) {
        String string ="This is a test and a good test.";
        System.out.println(wordCounter(string) + " words.");

        String string2 ="This is a test.";
        System.out.println(wordCounter(string2) + " words.");

        String string3 ="";
        System.out.println(wordCounter(string3));
    }
}




