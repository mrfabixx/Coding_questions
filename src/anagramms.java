import java.util.Arrays;

public class anagramms {

    public void Übung1(){
        String wort_1 = "Maman";
        String wort_2 = "Maaan";

        if (wort_1.length() != wort_2.length()) {
            System.out.println("kein anagram ");
        }
        String[] anagram_1 = {wort_1};
        String[] anagram_2 = {wort_2};
        boolean anagramme = Arrays.equals(anagram_1, anagram_2);
        System.out.println(anagramme);
        if (anagramme == true){
            System.out.println("das ist ein anagramm");
        }else{
            System.out.println("kein annagramm");
        }
    }

    }

