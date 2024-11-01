public class DeleteColumns944Leet {
    public int minDeletionSize(String[] strs) {
        if(strs.length==1){
            return 0;
        }
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String []arr={"zyx","wvu","tsr"};
        System.out.println((new DeleteColumns944Leet()).minDeletionSize(arr));
    }
}
