public class ShortestDistance2515Leet {
    public int closetTarget(String[] words, String target, int startIndex) {
        int found=0;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                found=1;
            }
        }
        if(found==0){
            return -1;
        }
        return Math.min(left(startIndex, words, target), right(startIndex, words, target));
    }
    int right(int start,String []words,String target){
        int count=0;
        int index=start;
        while (true) {
            if(index==words.length){
                index=0;
            }
            if(words[index].equals(target)){
                return count;
            }
            index++;
            count++;
        }
    
    }
    int left(int start,String []words,String target){
        int count=0;
        int index=start;
        while (true) {
            if(index==-1){
                index=words.length-1;
            }
            if(words[index].equals(target)){
                return count;
            }
            index--;
            count++;
        }
    
    }
    public static void main(String[] args) {
        String words[]={"hello","i","am","leetcode","hello"};
        System.out.println((new ShortestDistance2515Leet()).closetTarget(words, "hello", 1));
    }
}
