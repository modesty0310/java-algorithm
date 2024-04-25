import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12891_DNA비밀번호 {

    static int[] myArr = new int[4];
    static int[] checkArr = new int[4];
    static int check = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        char[] arr = new char[n];
        arr = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());

        int answer = 0;
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) check++;
        }
        for (int i = 0; i < m; i++) {
            Add(arr[i]);

        }

        if(check == 4) answer++;

        for (int i = m; i < n; i++) {
            int j = i - m;
            Add(arr[i]);
            Remove(arr[j]);
            if (check == 4) answer++;
        }

        System.out.println(answer);
    }
    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) check++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) check++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) check++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) check++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) check--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) check--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) check--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) check--;
                myArr[3]--;
                break;
        }
    }
}
