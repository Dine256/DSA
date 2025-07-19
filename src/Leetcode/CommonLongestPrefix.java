package Leetcode;

public class CommonLongestPrefix {
    public static void main(String[] args) {
        String [] str1={"flowers","floor,flower"};
        String str=str1[0];
        for (int i = 1; i < str1.length; i++) {
            while (str1[i].indexOf(str) != 0) {
                str=str.substring(0, str.length() - 1);
            }
        }
        System.out.println(str);
    }

}
