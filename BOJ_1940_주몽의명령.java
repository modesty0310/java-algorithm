import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940_주몽의명령 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n개의 재료, m의 갑옷
        // n, m 가져오기
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        // 길이 n의 arr만들기
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        // arr에 값 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // arr 오름차순 정렬하기
        Arrays.sort(arr);
        // count, start, end 만들기
        int count = 0;
        int start = 0;
        int end = n - 1;

        // while문
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == m) {
                count++;
                start++;
                end--;
            } else if (sum < m) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);
    }
}
