import java.util.Scanner;

public class Scan {
    public static void main(String args[]) {
        Scanner s = null;
        try {
            s = new Scanner(System.in);

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

