import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] sum = my_string.split("");
        
        for(String i : sum){
          answer += Integer.parseInt(i);
        }
        
        return answer;
    }
}