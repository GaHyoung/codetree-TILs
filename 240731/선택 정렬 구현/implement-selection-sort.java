import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 여기에 코드를 작성해주세요.ㅇ
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            int minIndex = i; //최솟값 인덱스

            for(int j = i+1; j < size; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int i = 0; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}