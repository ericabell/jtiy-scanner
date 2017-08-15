import java.util.Scanner;

public class Scan {
    public static void main(String args[]) {
        Scanner s = null;
        try {
            s = new Scanner(System.in);

//            while (s.hasNext()) {
//                System.out.println(s.next());
//            }
            while (s.hasNextInt()) {
                System.out.println(s.nextInt());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

