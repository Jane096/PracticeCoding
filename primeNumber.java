package PrimeNumber;

public class primeNumber {
	
	//0~100까지 소수인 숫자 출력하기
	public static void main(String[] args) {
		for(int i=2; i<=100; i++) { //1은 소수 아님
			int count = 0;
			
			for(int j=2 ; j<i; j++) {
				
				if(i % j == 0) { //자기 자신과 나눠지는 숫자
					count += 1;	
				}
			}
			if(count==0) System.out.println(i); //전역변수와 지역변수???
		}
	}
}
 
