
public class Main {
    public static void main(String[] args) {
        int[] nums = {23,45,-2,4,-89,34,5,90,354};
        int target = 4;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
        }

    // search the array and return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return  -1;
        }
        for (int index = 0; index < arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // if this line executes then no index was found.
        // hence return -1
        return -1;
    }

}