package Array;

public class Linear_search {
    static boolean search(int[] arr) {
        int target = 34;
        for (int j : arr) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }
        public static void main(String[] args){
            int[] arr = {2, 1, 3, 5, 4, 9, 10, 12};
            System.out.println(search(arr));
        }
    }

