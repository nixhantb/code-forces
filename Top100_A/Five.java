
import java.io.*;
import java.util.*;
public class Five {

    static void Solve() throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        
        
        int n = in.nextInt(); //9
        int m = in.nextInt(); // 3

        
        // 1000
        // 31^2
        int count=0;
        for(int a = 0; a*a <= n && a <= 31; a++){

            for(int b = 0; b*b <= m && b <= 31; b++){

                if( (a * a) + b == n && a + (b*b) == m){
                    count++;
                }
            }
        }

        out.println(count);

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