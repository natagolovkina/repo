import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static  String name2 = new String();

    public static void main(String[] args) throws IOException {
        Scanner name = new Scanner(System.in);
        int j = 0;

        while (name.hasNext()) {
            String name1 = name.next();
            name2 = name1 +" " + name2;
            j+=1;
            if (j == 10)
                break;
        }
        System.out.println(name2);
        name.close();
    }
}



