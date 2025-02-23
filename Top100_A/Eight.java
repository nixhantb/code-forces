
import java.io.*;
import java.util.*;

public class Eight {

    static void Solve() throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        int sumR = 0;
        int sumC = 0;
        int sm = 0, sc = 0;
        int ss = 0;
        int m = (n - 1) / 2;

        int minus = a[m][m];
        for (int i = 0; i < n; i++) {
            sumR += a[i][i];
            sumC += a[i][n - i - 1];
            sc += a[m][i];
            sm += a[i][m];
               
        }

        ss = (sc -minus) + (sm -minus) + (sumC -minus) + sumR;
        
        out.println(ss);

        out.flush();
    }

    public static void main(String[] args) throws IOException {
        Solve();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}