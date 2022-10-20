import java.util.Arrays;
import java.util.Scanner;

public class ch1_b2750 {
    //수 정렬하기
    // 문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
    // 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
    // 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
    // 예제 입력 :
    //5
    //5
    //2
    //3
    //4
    //1
    // 예제 출력결과:
    // 1
    //2
    //3
    //4
    //5

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