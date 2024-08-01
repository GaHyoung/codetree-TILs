import java.util.*;

public class Main {

    private static int size;
    private static int[] arr;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        insertion_sort();

        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void insertion_sort(){
        for(int i = 1; i < size; i++){
            int target = arr[i];
            int j = i -1;

            while(j >= 0 && arr[j] > target){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
    }
}