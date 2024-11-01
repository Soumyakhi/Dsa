import java.util.ArrayList;
import java.util.HashMap;

public class MinIndexSum599Leet {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> al=new ArrayList<>();
        HashMap<String,Integer>hm1=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            hm1.put(list1[i],i);
        }
        HashMap<String,Integer>hm2=new HashMap<>();
        int min[]={Integer.MAX_VALUE};
        for(int i=0;i<list2.length;i++){
            hm2.put(list2[i],i);
        }
        HashMap<String,Integer>hmr=new HashMap<>();
        hm1.forEach((k,v)->{
            if(hm2.containsKey(k)){
                min[0]=Math.min(min[0],v+hm2.get(k));
                hmr.put(k, v+hm2.get(k));
            }
        });
        hmr.forEach((k,v)->{
            if(v==min[0]){
                al.add(k);
            }
        });
        String arr[]=new String[al.size()];
        int index=0;
        for (String string : al) {
            arr[index++]=string;
        }
        return arr;
    }
    public static void main(String[] args) {
        String []l1={"Shogun","Tapioca Express","Burger King","KFC"};
        String []l2={"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String []res=(new MinIndexSum599Leet()).findRestaurant(l1, l2);
        for (String string : res) {
            System.out.println(string);
        }

    }
}
