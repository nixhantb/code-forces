
import java.io.*;
import java.util.*;

public class Ten {

    static void Solve() throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

       
    
        int a[] = new int[n];
        for(int i = 0; i <n; i++){
            a[i] = in.nextInt();
            
        }
        
        int hMax=a[0];
        int hMin = a[0];
        int cnt=0;

        for(int i: a){

            if(i > hMax){
                cnt++;
                hMax=i;
            }
            if(i < hMin){
                cnt++;
                hMin=i;
            }
            
        }
        out.println(cnt);
        

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