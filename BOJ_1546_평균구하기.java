import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546_평균구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int length = Integer.parseInt(s);
        int[] arr = new int[length];
        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;
        long max = 0;
        for (int i : arr) {
            if (max < i) max = i;
            sum += i;
        }

        System.out.println(sum * 100.0 / max / length);
    }
}
