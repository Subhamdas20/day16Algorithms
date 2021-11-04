package algorithms;
import java.util.Arrays;

public class AnagramDetection {
    public boolean anagramCheck(String firstValue , String secondValue){
        char []first = firstValue.toLowerCase().toCharArray();
        char []second = secondValue.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        boolean check;
        check = Arrays.equals(first,second);
        return check;
    }
    public static void main(String[] args) {
        AnagramDetection obj = new AnagramDetection();
        boolean result = obj.anagramCheck("abcd","cdab");
        if (result == true){
            System.out.println("Anagram Detected");
        }
        else System.out.println("Anagram Not detected");
    }
}
