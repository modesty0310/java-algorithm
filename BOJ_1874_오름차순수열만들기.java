import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1874_오름차순수열만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean result = true;
        int n = Integer.parseInt(st.nextToken());
        int num = 1;
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int su = Integer.parseInt(st.nextToken());
            if(num <= su) {
                while (num <= su) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int popNum = stack.pop();
                if (popNum > su) {
                    result = false;
                    System.out.println("NO");
                    break;
                }
                sb.append("-\n");
            }
        }

        if (result) System.out.println(sb);
    }
}
