// 두 수의 나눗셈

class Solution {
  public int solution(int num1, int num2) {
      int answer = 0;
      
      answer = num1*1000/num2;
      
      return answer; 
  }
}

// 숫자 비교하기

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
    
        return num1==num2? 1 : -1;
    }
}