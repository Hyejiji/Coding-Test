class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 1;
        
    while(true){
        answer *= i;
        
        if(answer == n){
            answer = i;
            break;
        } else if(answer > n) {
            answer = i-1;
            break;
        }
        
        i++;
    }
        return answer;
    }
}