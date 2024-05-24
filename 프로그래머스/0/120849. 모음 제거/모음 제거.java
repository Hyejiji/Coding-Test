class Solution {
    public String solution(String my_string) {
        String[] m = {"a", "e", "i", "o", "u"};
        
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<m.length; j++){
                my_string = my_string.replace(m[j], "");
            }
        }
        
        return my_string;
    }
}