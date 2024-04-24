import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2018_연속된자연수의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != n) {
            if (sum == n) {
                count ++;
                end_index++;
                sum += end_index;
            }
            else if (sum < n) {
                end_index++;
                sum += end_index;
            }
            else {
                sum -= start_index;
                start_index++;
            }
        }

        System.out.println(count);
    }
}
