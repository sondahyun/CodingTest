package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 종료 조건이 없을 때
public class B10951 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String[] split = line.split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            System.out.println(A + B);
        }

    }
}
