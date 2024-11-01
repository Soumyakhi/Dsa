public class StringCompress443Leet {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int index=0;
        for(int i=0;i<chars.length;i++){
            
            int j=i,count=1;
            while(j<chars.length-1){
                if(chars[j]==chars[j+1]){
                    count++;
                    j++;
                }
                else{
                    break;
                }
            }
            chars[index++]=chars[i];
            if(count>1){
                int l=0;
                String s=Integer.toString(count);
                while(l<s.length() && index<chars.length){
                    chars[index++]=s.charAt(l);
                    l++;
                }
                i=j;
            }
        }
        
        return index; 
    }
    public static void main(String[] args) {
        char[] arr={'a','a','b','b','c','c','c','a','a'};
        StringCompress443Leet sc=new StringCompress443Leet();
        System.out.println(sc.compress(arr));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
