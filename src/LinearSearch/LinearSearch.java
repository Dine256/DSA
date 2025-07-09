package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 545, 558, 45, 2, 87, 8};
        int target = 87;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        for (int index : arr) {
            if (index == target) {
                return 1;
            }
        }
        return -1;
    }


}
