package tmp;

public class UnicodeValues {
  public static void main(String[] args) {
    String str = "abcdefghijklmnopqrstuvwxyz";
    String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String str3 = "0123456789";
    String str4 = "!@#$%^&*()_+";

    printUnicodeValues(str);


    String one = "AB";
    String two = "BB";
    printCompareTo(one, two);

    one = "AA";
    two = "AB";
    printCompareTo(one, two);
  }

  public static void printUnicodeValues(String str) {
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      int unicodeValue = (int) c;
      System.out.println(c + " -> " + unicodeValue);
    }
  }

  public static void printCompareTo(String one, String two) {
    if (one != null && two != null) {
      System.out.println("One: " + one);
      printUnicodeValues(one);
      System.out.println("Two: " + two);
      printUnicodeValues(two);
      System.out.println(one + " - " + two + " = " + one.compareTo(two));
      // char oneChar = one.charAt(0);
      // int oneUnicode = (int) oneChar;

      // char twoChar = two.charAt(0);
      // int twoUnicode = (int) twoChar;
      // System.out.println(one + " : " + oneChar + " -> " + oneUnicode);
      // System.out.println(two + " : " + twoChar + " -> " + twoUnicode);


      // System.out.println(oneUnicode + " - " + twoUnicode + " = " + one.compareTo(two));
    }
  }
}
