public class FindMin {
    public static void main(String[] args) {
        int[] ara = {23,23,54,21,6,32,65,2};
        System.out.println(min(ara));
    }
    //return the minimum value in the array
    static  int min(int[] ara){
        int ans = ara[0];
        for (int i = 1; i < ara.length; i++){
            if (ara[i] < ans){
                ans = ara[i];
            }
        }
        return  ans;
    }
}
