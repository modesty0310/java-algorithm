import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1253_좋은수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n 길이의 배열 만들기
        int n = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // arr 정렬
        Arrays.sort(arr);

        // n 길이만큼 for문 돌면서 투포인터 사용
        int answer = 0;
        for (int i = 0; i < n; i++) {
            long targetNum = arr[i];
            int start_index = 0;
            int end_index = n - 1;
            while (start_index < end_index) {
                long sum = arr[start_index] + arr[end_index];
                if (targetNum == sum) {
                    // 배열안에 0이 있으면 자기 자신과 0의 합은 자신이 됨으로 그거 로직
                    if (start_index != i && end_index != i) {
                        answer++;
                        break;
                    } else if (start_index == i) {
                        start_index++;
                    } else if (end_index == i) {
                        end_index--;
                    }
                } else if (sum > targetNum) {
                    end_index--;
                } else {
                    start_index++;
                }
            }
        }

        System.out.println(answer);
    }
}
