import java.util.ArrayList;

public class Recursion3 {
    
    static void perm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            perm(newStr,permutation+currentChar);
        }
    }
    static int countPath(int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i==m || j==n){
            return 0;
        }
        return countPath(i+1, j, m, n)+countPath(i, j+1, m, n);
    }
    static int placeTiles(int n,int m){
        if(m==n){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horizental=placeTiles(n-1, m);
        int vertical=placeTiles(n-m, m);
        return horizental+vertical;
    }
    static int callGuests(int n){
        if(n==1||n<1){
            return 1;
        }
        int single=callGuests(n-1);
        int pair=(n-1)*callGuests(n-2);
        return single+pair;
    }
    static void subSets(int n,ArrayList<Integer> sets,int i){
        if(n+1==i){
            for (Integer integer : sets) {
                System.out.print(integer);
            }
            System.out.println("");
            return;
        }
        sets.add(i);
        subSets(n, sets,i+1);
        sets.remove(sets.size()-1);
        subSets(n, sets,i+1);
    }
    public static void main(String[] args) {
        System.out.println("Permutations of a String");
        perm("abc","");
        System.out.println("Rats in a maze paths count");
        System.out.println(countPath(0, 0, 2, 2));
        System.out.println("place 1*m tiles into n*m floor");
        System.out.println(placeTiles(4, 2));
        System.out.println("Call Guests");
        System.out.println(callGuests(3));
        System.out.println("Subsets");
        ArrayList<Integer> sets=new ArrayList<>();
        subSets(3,sets,1);
        
    }
}
