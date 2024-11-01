public class SeniorCitizens2678Leet {
    public int countSeniors(String[] details) {
        int count=0;
        for (String string : details) {
            if(Integer.parseInt(string.substring(11, 13))>60){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String []details={"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println((new SeniorCitizens2678Leet()).countSeniors(details));
    }
}
