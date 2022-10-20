import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 구간 합 구하기 4
// 문제 : 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
// 출력 : 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
// 예제입력 :
// 5 3
//5 4 3 2 1
//1 3
//2 4
//5 5
// 예제 출력 :
// 12
//9
//1



public class ch2_b11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int Nc = Integer.parseInt(stringTokenizer.nextToken());  //숫자개수
        int Qc = Integer.parseInt(stringTokenizer.nextToken()); //물어볼 문제 개수
        long[] S = new long[Nc];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i< Nc; i++){  //배열에 아예 총합을 구해놓기

            if (i != 0){
                S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
            }else {
                S[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for (int i = 0; i< Qc; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int fa = Integer.parseInt(stringTokenizer.nextToken());  //첫번째 배열 위치
            int ba = Integer.parseInt(stringTokenizer.nextToken());  //마지막 배열 위치
//            System.out.println("첫번째 배열 수 " + S[fa - 1] + " 마지막 배열 " + S[ba - 1]);

            if (fa - 1 == 0){
                System.out.println(S[ba - 1] );
            }else {
                System.out.println(S[ba - 1] - S[fa - 2]);}


        }


    }
}