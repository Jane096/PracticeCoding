//XOR 비트연산 개념 이해하기, 같은 숫자는 0/ 다른숫자는 1을 반환

class Solution {
    public int solution(int[] A) {
        int answer = 0;
        
        for(int n : A) {
            answer = answer ^ n;
        }
        return answer;
    }
}
