import static java.lang.System.*;


public class Helloworld {
    public static String S1;
    public static String S2;
    public static String regex="[^a-zA-Z0-9]";

    public static boolean isPalindrome(String text) {
        if (text.length()==0){
            return true;
        }
        S1=text.replaceAll(regex,"");
        StringBuilder S11 = new StringBuilder(S1);
        StringBuilder S12 = new StringBuilder(S11.reverse());
        S2=S12.toString();
        return S2.equalsIgnoreCase(S1);
    }

    public static void main(String[] args){
        out.println(isPalindrome("I'am mai!"));
    }

}