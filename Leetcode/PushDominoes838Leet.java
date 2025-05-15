public class PushDominoes838Leet {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] force = new int[n];
        int f = 0;
        char []dominoesArr=dominoes.toCharArray();
        for(int i=0;i<n;i++){
            if(dominoesArr[i]=='R'){
                f=n;
            }
            else if(dominoesArr[i]=='L'){
                f=0;
            }
            else{
                f=Math.max(f-1, 0);
            }
            force[i]=f;
        }
        for(int i=n-1;i>=0;i--){
            if(dominoesArr[i]=='L'){
                f=n;
            }
            else if(dominoesArr[i]=='R'){
                f=0;
            }
            else{
                f=Math.max(f-1, 0);
            }
            force[i]-= f;
        }
        StringBuilder sBuilder=new StringBuilder();
        for(int i=0;i<n;i++){
            if(force[i]>0){
                sBuilder.append('R');
            }
            else if(force[i]<0){
                sBuilder.append('L');
            }
            else{
                sBuilder.append('.');
            }
        }
        return sBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println((new PushDominoes838Leet()).pushDominoes("RR.L"));
    }
}
