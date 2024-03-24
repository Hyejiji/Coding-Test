// 짝수는 싫어요

class Solution {
    public int[] solution(int n) {
        int[] answer = {};

        answer = new int[n%2==0?n/2:n/2+1];

        int index = 0;
        for(int i=1; i<=n; i+=2){
            answer[index++] = i;
        }

        return answer;
    }
}
