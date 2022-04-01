import java.util.Scanner;

public class palindrom {


    void palindrom_1() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("geben sie ein wort ein ");
    String original = scanner.next();
    String reversed_String = "";

/**
 String original = "abcd";
 String reversed_String = "";
 */

        for (int i = original.length() - 1; i >= 0; i--) {
        reversed_String += original.charAt(i);
        System.out.println(reversed_String);
    }
    boolean palindrom = true;
        for (int i = 1; i < original.length(); i++) {
        if (original.charAt(i) != reversed_String.charAt(i)) {
            palindrom = false;
        }
    }
        if (palindrom) {
        System.out.println("its a palindrom ");
    } else {
        System.out.println("its not a palindrom ");
    }
  }

}
