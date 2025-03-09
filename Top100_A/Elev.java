import java.io.*;
import java.util.*;

public class Elev {

    static boolean Solve(int k, int a[]) throws IOException {
        

        
        Arrays.sort(a);  

        for (int i = 0; i < k - 1; i++) {
            if (Math.abs(a[i] - a[i + 1]) > 1) {
                return false;
            }
        }
        return true;
           
        }
       
    

    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();

        while(n-->0){

            int k = in.nextInt();

            int a[] = new int[k];

            for(int i=0; i <a.length; i++){
                a[i] = in.nextInt();
            }
            if(Solve(k, a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
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
