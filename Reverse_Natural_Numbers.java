public class Reverse_Natural_Numbers {

  // public static void main(String[] args){
    
  //   int[] result = solution(12345);
  //   for(int i=0; i<result.length; i++){
  //     System.out.println("result[" + i + "] : " + result[i] );
  //   }
  // }

  class Solution {
    public int[] solution(long n) {
        String a = "" + n;
          int[] answer = new int[a.length()];
          int cnt=0;
  
          while(n>0) {
              answer[cnt]=(int)(n%10);
              n/=10;
              System.out.println(n);
              cnt++;
          }
        return answer;
    }
  }

  // public static int[] solution(long n) {
        
  //   int cnt = 0;
  //   long num = n;
      
  //     while(n!=0){
  //         n /= 10;
  //         cnt++;
  //     }
  //    int[] answer = new int[cnt];
      
  //    for(int i=0; i<cnt; i++){
  //        answer[i] = (int)(num%10);
  //        num /= 10;
  //        System.out.println("answer[" + i + "] : " + answer[i] );
  //    }
  //    System.out.println();
  //     return answer;
  // }

  // public static int[] solutionA(long n){
  //   // return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
  //   return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    
  // }
}
