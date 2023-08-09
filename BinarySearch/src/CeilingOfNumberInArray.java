public class CeilingOfNumberInArray {

    /// if you have a sorted array , use binary search89

    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,88};
//        int[] arr = {10,9,8,7,6,5,4,4,2,1};
        int ans = orderAgnosticBS(arr,43);

        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        boolean ascending = arr[start] <= arr[end];

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2;
            // start + end might exceed the limit of an int
            mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid];
            }

            if (target < arr[mid]) {
                if (ascending) {
                    end = mid - 1;
                } else start = mid + 1;
            } else if (target > arr[mid]) {
                if (ascending) {
                    start = mid + 1;
                } else end = mid - 1;
            }
        }

        // because if the while loop ends without returning any position,then it means the element was not found
        // the start position also gets bigger than end position
        // so the start position has the ceiling number
        return arr[end];


    }
}
