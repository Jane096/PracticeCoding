package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class lottoPractice {
		public static void main(String[] args) {
			System.out.println("몇번돌릴까요");
			
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			
			for(int i=1; i <= count; i++) { //0번째 부터 시작하는 것은 없다 1로 넣어야지
				System.out.println(i + "번째:" + making_lottonumber());
			}
		}
		static String making_lottonumber() {
			Set<Integer>set = new HashSet<Integer>(); //set은 알아서 중복을 체크해준다.. 코드 간소화!
			
			while(set.size() != 6) {
				set.add((int)(Math.random()*45 + 1)); //1부터 45까지 범위지정, double return 이기때문에 형변환 
			}
			
			//정렬
			List<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list); //ascending order(natural ordering), random()으로 가져온 숫자 오름차순 정렬 
			
			return list.toString(); 
		}
	}

