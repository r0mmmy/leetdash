class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        
        for(String b : babbling){
            for(String w : word){
                b = b.replace(w, " ");
            }
            
            if(b.replace(" ", "").length() == 0){
                answer++;
            }
        }
        return answer;
    }
}
