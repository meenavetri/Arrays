public class SearchinStrings {
    public static void main(String[] args) {
      //also can get input from user
        String name = " Meena";
        char target = 'm';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
      //use this
        // for(int i=0;i<str.length();i++){
        //     if(target == str.charAt(i)){
        //         return true;
        //     }
        // }
      // or
        for(char ch : str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;

    }
}
