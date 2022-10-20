import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//구간 합 구하기 5
// 문제 : N×N개의 수가 N×N 크기의 표에 채워져 있다. (x1, y1)부터 (x2, y2)까지 합을 구하는 프로그램을 작성하시오. (x, y)는 x행 y열을 의미한다.
//
//예를 들어, N = 4이고, 표가 아래와 같이 채워져 있는 경우를 살펴보자.
//
//1	2	3	4
//2	3	4	5
//3	4	5	6
//4	5	6	7
//여기서 (2, 2)부터 (3, 4)까지 합을 구하면 3+4+5+4+5+6 = 27이고, (4, 4)부터 (4, 4)까지 합을 구하면 7이다.
//
//표에 채워져 있는 수와 합을 구하는 연산이 주어졌을 때, 이를 처리하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M이 주어진다. (1 ≤ N ≤ 1024, 1 ≤ M ≤ 100,000) 둘째 줄부터 N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다. 다음 M개의 줄에는 네 개의 정수 x1, y1, x2, y2 가 주어지며, (x1, y1)부터 (x2, y2)의 합을 구해 출력해야 한다. 표에 채워져 있는 수는 1,000보다 작거나 같은 자연수이다. (x1 ≤ x2, y1 ≤ y2)
// 출력 : 총 M줄에 걸쳐 (x1, y1)부터 (x2, y2)까지 합을 구해 출력한다.
// 예제 입력 :
//4 3
//1 2 3 4
//2 3 4 5
//3 4 5 6
//4 5 6 7
//2 2 3 4
//3 4 3 4
//1 1 4 4
// 예제 출력결과:
//27
//6
//64
public class ch2_b11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int size = Integer.parseInt(stringTokenizer.nextToken());  //배열의 크기
        int count = Integer.parseInt(stringTokenizer.nextToken()); //문제의 개수
        long[][] S = new long[size][size];  // Array 숫자

        for (int i = 0; i< size; i++){  //배열에 값 입력 & 총합을 다 구해 놓기
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int k = 0; k< size; k++) {
                if (k != 0){
                    S[i][k] = S[i][k-1] + Integer.parseInt(stringTokenizer.nextToken());
                }else {
                    S[i][k] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }
        }

//        for (int i = 0; i< count; i++){ // 검사
//            for (int k = 0; k< 4; k++) {
//                System.out.print( S[i][k] + " ");
//            }
//            System.out.println();
//        }

        long[][] Q = new long[count][4];  // Array 질문
        for (int i = 0; i< count; i++){  // 문제 구할 위치 숫자 값 입력
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int k = 0; k< 4; k++) {
                Q[i][k] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

//        for (int i = 0; i< count; i++){ // 검사
//            for (int k = 0; k< 4; k++) {
//                System.out.print( Q[i][k]);
//            }
//            System.out.println();
//        }

        for (int i = 0; i< count; i++){
            int sum =0;
            int x1 = (int) Q[i][0] - 1;
            int y1 = (int) Q[i][1] - 1;
            int x2 = (int) Q[i][2] - 1;
            int y2 = (int) Q[i][3] - 1;

//            System.out.println( i+1 + "질문 ("+ x1 + "," + y1 + "),(" + x2 + "," + y2 + ")" );
            if (x1 == x2){
                if (y1 - 1 < 0) {
                    sum += (int) S[x1][y2] ;
                }else{//고쳐야함
//                    System.out.println(S[x1][y2] - S[x1][y1 - 1]);
                    sum += (int) S[x1][y2] - (int) S[x1][y1 - 1];
                }
            }else {
                for (int jj = x1; jj <= x2; jj++) {
                    if (y1 - 1 < 0) {
//                        System.out.println(S[jj][y2] );
                        sum += (int)S[jj][y2];
                    }else{
//                        System.out.println(S[jj][y2] - S[jj][y1 - 1]);
                        sum += (int) S[jj][y2] - (int) S[jj][y1 - 1];
                    }
                }
            }


            System.out.println(sum);
        }


    }
}