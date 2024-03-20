//사칙연산

//1 두수의 합
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = -1;
    answer = num1 + num2;
    return answer;
}

//2 두수의 차
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = 0;
    
    if(-50000<=num1<=50000 && -50000<=num2<=50000) {
        answer = num1-num2;    
    }
    
    return answer;
}

//3 두수의 곱
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = 0;
    
    if(0<=num1<=100 && 0<=num2<=100){
        answer = num1*num2;
    }
    return answer;
}


//4 몫 구하기
class Solution {
  public int solution(int num1, int num2) {
      int answer = 0;
      
      if(num1 >=0 && num1<=100 && num2>=0 && num2<=100) {
          answer = (int)num1/(int)num2;    
      }
           return answer;  
      }
    
  }