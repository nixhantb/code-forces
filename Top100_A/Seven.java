
import java.io.*;
import java.util.*;
public class Seven {

    static void Solve() throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        
        
        int r = in.nextInt();
        int c = in.nextInt();
       

        char a[][] = new char[r][c];

        for (int i = 0; i < r; i++) {
            String line = in.nextLine(); 
            for (int j = 0; j < c; j++) {
                a[i][j] = line.charAt(j); 
            }
        }

        List<Integer> rc = new ArrayList<>();
        List<Integer> cc = new ArrayList<>();

        for(int i= 0; i < r; i++){
            
            for(int j = 0; j <c; j++){

                if(a[i][j] == '*'){
                    rc.add(i+1);
                    cc.add(j+1);
                }
            }
        }

        int x1=0;
        int y1 = 0;


        for(int arr : rc){
            x1 = x1^arr;
        }

        for(int ary: cc){
            y1 = y1^ary;
        }

        System.out.println(x1+" "+y1);



        
       
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