package LinearSearch;

public class StringCharSearch {
    public static void main(String[] args) {
        String str="dinesh";
        char target= 'i';
        System.out.println(charSearch(str,target));
    }
    static boolean charSearch(String str,char target){
        for(char ch : str.toCharArray()){
            if(ch==target) return true;

        }
        return false;
    }
}
