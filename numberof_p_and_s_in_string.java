public class numberof_p_and_s_in_string {

  public static void main(String [] args){
    System.out.println("result : " + solution("pPoooyY"));

  }
  static boolean solution(String s) {
    s = s.toLowerCase();

    int count = 0;

    for(int i=0; i<s.length(); i++){
      
      if('p' == s.charAt(i)){
        count++;
      }else if('y' ==s.charAt(i)){
        count--;
      }

    }
      if(count == 0){
        return true;
      }else{
        return false;
      }
  }

}
