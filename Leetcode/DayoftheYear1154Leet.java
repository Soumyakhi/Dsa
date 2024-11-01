public class DayoftheYear1154Leet {
    public int dayOfYear(String date) {
        int mm=Integer.parseInt(date.substring(5,7));
        int dd=Integer.parseInt(date.substring(8,10));
        int yy=Integer.parseInt(date.substring(0,4));
        if(mm==2){
            dd+=31;
        }
        else if(mm==3){
            dd+=31+28;
        }
        else if(mm==4){
            dd+=31+28+31;
        }
        else if(mm==5){
            dd+=31+28+31+30;
        }
        else if(mm==6){
            dd+=31+28+31+30+31;
        }
        else if(mm==7){
            dd+=31+28+31+30+31+30;
        }
        else if(mm==8){
            dd+=31+28+31+30+31+30+31;
        }
        else if(mm==9){
            dd+=31+28+31+30+31+30+31+31;
        }
        else if(mm==10){
            dd+=31+28+31+30+31+30+31+31+30;
        }
        else if(mm==11){
            dd+=31+28+31+30+31+30+31+31+30+31;
        }
        else if(mm==12){
            dd+=31+28+31+30+31+30+31+31+30+31+30;
        }
        if((yy % 400 == 0) || (yy % 100 != 0) && (yy % 4 == 0)){
            if(mm>2){
                dd++;
            }
        }
        return dd;
    }
    public static void main(String[] args) {
        System.out.println((new DayoftheYear1154Leet()).dayOfYear("2019-02-10"));
    }
}
