
import java.io.*;
import java.util.*;
public class Second {

    static void Solve() throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(a);
        hs.add(b);
        hs.add(c);
        hs.add(d);

        int res = 4 - hs.size();
        out.println(res);
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