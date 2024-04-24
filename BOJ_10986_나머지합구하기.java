import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10986_나머지합구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        long[] remainderArr = new long[m];
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int remainder = (int) (arr[i] % m);

            if (remainder == 0) answer++;

            remainderArr[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if( remainderArr[i] > 1) {
              answer += remainderArr[i] * (remainderArr[i] - 1) / 2;
            }
        }

        System.out.println(answer);
    }
}
