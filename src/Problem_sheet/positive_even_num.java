//package Problem_sheet;
//
//import static java.lang.Math.min;
//
//public class positive_even_num {
//
//
//    public static int distanceBetween(int[] arr, int n){
//        int res = -1;
//        for(int i = 0; i < n; i++){
//            if(arr[i]%2 == 0){
//                for(int j = j - i + 1; j < n; j++){
//                    if(arr[j] % 2 ==0){
//                        if(res == -1) res = j - 1;
//                        res = min(res, j -i);
//                        break;
//                    }
//                }
//            }
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        int[] arr = {5, 6, 2, 3, 8, 9 ,12 ,33};
//        int n = arr.length;
//
//    }
//}
