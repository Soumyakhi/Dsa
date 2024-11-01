import java.util.HashMap;

public class RomanToInt250Leet {
    public int romanToInt(String s) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);
        hm.put("IV",4);
        hm.put("IX",9);
        hm.put("XL",40);
        hm.put("XC",90);
        hm.put("CD",400);
        hm.put("CM",900);
        int sum=0,i=0;
        while(i<s.length()){
            if(i>=s.length()-1){
                sum=sum+hm.get(Character.toString(s.charAt(i)));
                i++;
            }
            else{
                if(s.charAt(i)=='I'){
                    if(s.charAt(i+1)=='V'){
                        sum=sum+4;
                        i+=2;
                    }
                    else if(s.charAt(i+1)=='X'){
                        sum=sum+9;
                        i+=2;
                    }
                    else{
                        sum=sum+1;
                        i++;
                    }
                }
                else if(s.charAt(i)=='X'){
                    if(s.charAt(i+1)=='L'){
                        sum=sum+40;
                        i+=2;
                    }
                else if(s.charAt(i+1)=='C'){
                        sum=sum+90;
                        i+=2;
                    }
                    else{
                        sum=sum+10;
                        i++;
                    }
                }
                else if(s.charAt(i)=='C'){
                    if(s.charAt(i+1)=='D'){
                        sum=sum+400;
                        i+=2;
                    }
                    else if(s.charAt(i+1)=='M'){
                        sum=sum+900;
                        i+=2;
                    }
                    else{
                        sum=sum+100;
                        i++;
                    }
                }
                else{
                    sum=sum+hm.get(Character.toString(s.charAt(i)));
                    i++;
                }
            }
            
        }
        return sum;
    }
    /*public int romanToInt(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);
        hm.put("IV", 4);
        hm.put("IX", 9);
        hm.put("XL", 40);
        hm.put("XC", 90);
        hm.put("CD", 400);
        hm.put("CM", 900);

        int sum = 0;
        int i = 0;

        while (i < s.length()) {
            // Check for subtractive combination first
            if (i < s.length() - 1 && hm.containsKey(s.substring(i, i + 2))) {
                sum += hm.get(s.substring(i, i + 2));
                i += 2;
            } else {
                sum += hm.get(Character.toString(s.charAt(i)));
                i++;
            }
        }

        return sum;
    }*/

    public static void main(String[] args) {
        RomanToInt250Leet rm=new RomanToInt250Leet();
        System.out.println(rm.romanToInt("MCMXCIV"));
    }
}
