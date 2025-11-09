package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10811 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        int[] box = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            box[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(box[i] + " ");
        }
        System.out.println();
        for (int i = 1; i <= M; i++) {
            String[] split1 = in.readLine().split(" ");
            for (int j = Integer.parseInt(split1[0]); j <= Integer.parseInt(split1[1]); j++) {
                int temp = box[j];
                box[j] = box[Integer.parseInt(split1[1])-]
            }
            for (int n = 1; n <= N; n++) {
                System.out.print(box[n] + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(box[i] + " ");
        }
    }
}
