//index 0 -> index 3, index 1 -> index 4로 이동하게됨(K=3일때) => (i+K) % length

class Solution {
    public int[] solution(int[] A, int K) {
        int[] answer = new int[A.length];
        
        for(int i=0; i<A.length; i++) {
           answer[(i+K) % A.length] = A[i];
        }
        return answer;
    }
}
