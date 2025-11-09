package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B9086 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i <T; i++) {
            String a = in.readLine();
            System.out.println(a.charAt(0) + "" + a.charAt(a.length()-1));
            System.out.printf("%c%c", a.charAt(0), a.charAt(a.length()-1));
        }
    }
}
