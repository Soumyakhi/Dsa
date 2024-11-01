import java.util.HashMap;

public class ReformatDate1507Leet {
    public String reformatDate(String date) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("Jan", 1);
        hm.put("Feb",2 );
        hm.put("Mar", 3);
        hm.put("Apr", 4);
        hm.put("May", 5);
        hm.put("Jun", 6);
        hm.put("Jul", 7);
        hm.put("Aug", 8);
        hm.put("Sep", 9);
        hm.put("Oct", 10);
        hm.put("Nov", 11);
        hm.put("Dec", 12);
        String stArr[]=date.split(" ");
        StringBuilder sb=new StringBuilder();
        sb.append(stArr[2]);
        sb.append('-');
        int mm=hm.get(stArr[1]);
        if(mm<10){
            sb.append(0);
        }
        sb.append(mm);
        sb.append('-');
        String dd=stArr[0].substring(0,stArr[0].length()-2);
        if(dd.length()==1){
            sb.append(0);
        }
        sb.append(dd);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println((new ReformatDate1507Leet()).reformatDate("20th Oct 2052"));
    }
}
