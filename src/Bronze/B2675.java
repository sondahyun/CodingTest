package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2675 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split(" ");
        if (split[0].equals("")) {
            System.out.println(split.length - 1);
        } else {
            System.out.println(split.length);
        }
    }
}
