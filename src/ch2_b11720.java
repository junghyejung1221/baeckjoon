import java.util.Scanner;
//숫자의 합
// 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
// 출력 : 입력으로 주어진 숫자 N개의 합을 출력한다.
// 예제 입력 :
//1
//1
// 예제 출력결과:
//1

public class ch2_b11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String sNum = sc.next();

        char cNum[] = sNum.toCharArray();  //String 을 char 배열 안에 넣기

        int result = 0;
        for (int i =0 ; i< cNum.length ; i++)
        {
            result += Character.getNumericValue(cNum[i]);
        }

        System.out.println(result);
    }
}