public class SearchinRange {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int index1=2;
        int index2=7;
        int target=6;
        System.out.println(Searchinrange(array,index1,index2,target));
        
    }
    static boolean Searchinrange(int[] arr, int index1, int index2 , int target){
        if(arr.length==0){
            return false;
        }
        for(int i=index1;i<index2;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;

    }
}
