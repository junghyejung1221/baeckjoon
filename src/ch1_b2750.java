import java.util.Arrays;
import java.util.Scanner;

public class ch1_b2750 {

    public static void main(String[] args) {

        int A ;
        int num;
        int B;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();

        int arr[] = new int[A];

        for(int i = 0 ; i< A; i++){
            num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr); // 오름차순 정렬

        for(int i = 0 ; i< A; i++){

            if (i != 0){
                if (arr[i] == arr[i -1]){
                    arr[i - 1] = 1000001;
                }
            }
        }

        for(int i = 0 ; i< A; i++){
            if (arr[i] != 1000001){
                System.out.println(arr[i]);}
        }
    }


}