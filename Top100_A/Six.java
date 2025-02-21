
import java.io.*;
import java.util.*;
public class Six {

    static void Solve() throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        
        
        String s = in.next();
        String maxPalindrome = "";
        List<String> subsequences = new ArrayList<>();
        subsequences(s, "", subsequences);

        for(String st: subsequences){

            if(isPalindrome(st)){
                
                if (st.compareTo(maxPalindrome) > 0) {
                    maxPalindrome = st;
                }
            }
        }
        out.println(maxPalindrome);
      
        out.flush();
    }
    static void subsequences(String str, String ans, List<String> store){

        if(str.length()==0){
            store.add(ans);
            return;
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);

        subsequences(rem, ans+ch, store);
        subsequences(rem, ans, store);

        
    }
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
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