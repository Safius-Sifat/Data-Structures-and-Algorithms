// aara = {23,23,54,21,6,32,65,2}
//Q. search for element 21 in range of [1,4]

public class searchInRange {
    public static void main(String[] args) {
        int[] ara = {23,23,54,21,6,32,65,2};
        int target = 21;
        System.out.println(linearSearch(ara,target,1,4));
    }

    static int linearSearch(int[] arr, int target,int start,int end){
        if (arr.length == 0){
            return  -1;
        }
        for (int index = start; index <= end; index++){
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
