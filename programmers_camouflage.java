import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1; //for multiply
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1); 
        }
        for(String keys: map.keySet()) {
            answer *= (map.get(keys) + 1);
        }
        answer -= 1; //아무것도 안입는다는 경우의 수 제거(0,0)
        return answer;
    }
}
