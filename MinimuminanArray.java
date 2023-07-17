public class Minimum {
    
    public static void main(String[] args) {
        int[] arr={1,9,3,4,-1,120,-123};
         int ans=min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr){
        int min= arr[0];
        for(int i=0; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
