

public class Hashad_Su {
  public static void main(String[] args){
    solution(11);
  }
  public static boolean solution(int x) {
    boolean answer = true;

    int sum = 0;
    int x1 = x;

    while (x1 > 0) {
      sum += x1 % 10;
      x1 /= 10;
    }

    System.out.println(x +"의 자리수의 합은 " + sum + "입니다.");

    if (x % sum == 0) {
      answer = true;
    } else {
      answer = false;
    }

    System.out.println("결과 ㅣ " + answer);
    return answer;
  }
}
