import java.util.HashMap;

public class EncodeDecode535Leet {
    static HashMap<String,Integer> hme=new HashMap<>();
    static HashMap<Integer,String> hmd=new HashMap<>();
    static int i=1;
    public String encode(String longUrl) {
        if(!hme.containsKey(longUrl)){
            hme.put(longUrl,i);
            hmd.put(i,longUrl);
            i++;
        }
        return "http://tinyurl.com/"+hme.get(longUrl);
    }
    public String decode(String shortUrl) {
        int order=Integer.parseInt(shortUrl.substring(shortUrl.lastIndexOf('/')+1));     
        return hmd.get(order);
    }
    public static void main(String[] args) {
        EncodeDecode535Leet ed=new EncodeDecode535Leet();
        System.out.println(ed.decode(ed.encode("https://leetcode.com/problems/design-tinyurl")));
    }
}
