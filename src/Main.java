import java.util.Scanner;

public class Main {

        static char find (String s,int times){

            char ch = 0;

            int cnt = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == ch) {
                    cnt++;
                } else {
                    ch = s.charAt(i);
                    cnt = 1;
                }

                if (cnt >= times) {
                    break;
                }
            }

            return ch;
        }

        public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);

            int times = scanner.nextInt();

            String s = scanner.next();

            char ch = find(s, times);

            System.out.println(ch);

            scanner.close();
        }
    }
