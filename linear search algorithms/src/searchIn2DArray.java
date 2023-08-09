public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,35,5},
                {24,23,1,54},
                {52,5,1,76,32},
                {98,57}
        };
        int target = 57;
        System.out.println(search(arr,target));
    }
}
