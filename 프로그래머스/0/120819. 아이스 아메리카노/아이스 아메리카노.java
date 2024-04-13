class Solution {
    public int[] solution(int money) {
        
        int jan = money / 5500;
        int left = money % 5500;
        
        int[] answer = {jan, left};
        return answer;
    }
}