package backjoon_test;

import java.util.Arrays;
import java.util.Scanner;

class heap2959 {
	 public static void heapSort(int[] a) {
		 int max = a.length;
         
         for(int i=max / 2 - 1; i>=0; i--) {
             heapify(a, max, i);
         }
        
         for(int i=max - 1; i>0; i--) {
             int temp = a[0];
             a[0] = a[i];
             a[i] = temp;
             heapify(a, i, 0);
         }
      }
    
     public static void heapify(int[] a, int length, int i) {
         int parent = i;
         int leftchild = i*2 + 1;
         int rightchild = i*2+2;
         
         if(leftchild < length && a[parent] < a[leftchild]) {
             parent = leftchild;
         }else if(rightchild < length && a[parent] < a[rightchild]) {
             parent = rightchild;
         }
         
         if(i != parent) {
             int temp = a[parent];
             a[parent] = a[i];
             a[i] = temp;
             heapify(a,length, parent);
             System.out.println(Arrays.toString(a));
         }
     }
     
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int[] arr = new int[4];
         
         for(int i=0; i<arr.length; i++) {
             arr[i] = sc.nextInt();
         }
         
         heapSort(arr);
         System.out.println(Arrays.toString(arr));
        
         System.out.println(arr[0] * arr[2]);
     }
    }
