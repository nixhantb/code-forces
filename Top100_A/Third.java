
import java.io.*;
import java.util.*;
public class Third {

    static void Solve() throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        
        
        String  st = in.next();

        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i < st.length(); i++){
            hs.add(st.charAt(i));
        }


        
        if(hs.size() % 2==0){
            out.println("CHAT WITH HER!");
        }
        else{
            out.println("IGNORE HIM!");
        }
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