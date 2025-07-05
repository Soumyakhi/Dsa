import java.util.ArrayList;
import java.util.List;

public class SummaryRange228Leet {
    public List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        int first=0,last=0;
        for(int i=1;i<nums.length;i++){
            if(nums[last]+1==nums[i]){
                last++;
            }
            else{
                if(first==last){
                    res.add(Integer.toString(first));
                }
                else{
                    res.add(first+"->"+last);
                }
                first=nums[i];
                last=nums[i];
            }
        }
        if(first==last){
                    res.add(Integer.toString(first));
            }
        else{
            res.add(first+"->"+last);
        }
        return res;
    }
}
