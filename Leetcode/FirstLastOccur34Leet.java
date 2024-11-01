public class FirstLastOccur34Leet {
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        res[0]=findFirstOccurrence(nums, target);
        res[1]=findLastOccurrence(nums, target);
        return res;
    }
    int findLastOccurrence(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int last = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                last = mid;
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return last;
    }
    int findFirstOccurrence(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int first = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                first = mid;
                r = mid - 1;  
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return first;
    }
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int res[]=(new FirstLastOccur34Leet()).searchRange(nums, 8);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
