public class ShortestCharDist821Leet {
    /*public int[] shortestToChar(String s, char c) {
        HashSet<Integer>hs=new HashSet<>();
        int[]res=new int[s.length()];
        for(int i=0;i<res.length;i++){
            if(s.charAt(i)==c){
                hs.add(i);
            }
        }
        for(int i=0;i<res.length;i++){
            int min=Integer.MAX_VALUE;
            for (int j : hs) {
               min=Math.min(Math.abs(i-j), min); 
            }
            res[i]=min;
        }
        return res;
    }*/
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        int prev = -n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            res[i] = i - prev;
        }
        prev = 2 * n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            res[i] = Math.min(res[i], prev - i);
        }
    
        return res;
    }
    
    
    public static void main(String[] args) {
        int arr[]=(new ShortestCharDist821Leet()).shortestToChar("loveleetcode", 'e');
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
