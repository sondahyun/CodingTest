package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10988 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split("");
        int flag = 0;

        for (int i = 0; i < split.length / 2; i++) {
            if (split[i].equals(split[split.length-i-1])) {
                flag = 1;
            }else {
                flag = 0;
            }
        }
        System.out.println(flag);
    }
}
