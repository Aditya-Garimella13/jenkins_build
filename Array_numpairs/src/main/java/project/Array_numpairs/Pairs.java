package project.Array_numpairs;
import java.util.*;
import java.util.HashSet;

public class Pairs {

//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			Scanner sc=new Scanner(System.in);
//			
//			int n=5;
//			int []a= {1,2,3,4,5};
//			System.out.println("enter the sum");
//			int m=sc.nextInt();
//			int result_pair=pair_sum(a,n,m);
//			int result_triplets=triplets_sum(a,n,m);
//			System.out.println("result_triplets "+result_triplets);
//			//System.out.print(result);
//	
//		}
	/**
	 * this function is used to return if a pair exists or not 
	 * @param arr
	 * @param n size of array
	 * @param m sum value
	 * @return -1 or 1 if it doesn't exists or not
	 */
		public static int pair_sum(int[] arr,int n,int m) {
			if(n<=1) {
				throw new IllegalArgumentException("array should be greater than 1");
			}
			int has_pair=-1;
			HashSet<Integer> s=new HashSet<Integer>();
			for(int i=0;i<n;i++) {
				int temp=m-arr[i];
				if(s.contains(temp)) {
					System.out.println("pair with given sum "+arr[i]+","+temp);
					has_pair=1;
				}
				s.add(arr[i]);
			}
			if(has_pair==1) {
				return 1;
			}
			else {
				System.out.println("pairs dont exist");
				return -1;
			}
					
		}
		/**
		 * triplets
		 * @param arr
		 * @param n
		 * @param m
		 * @return the number of triplet
		 */
		static int triplets_sum(int[] arr,int n,int m) {
			if(n<=2) {
				throw new IllegalArgumentException("array should be greater than 2");
			}
			int count=0;
			for(int i=0;i<n-2;i++) {
				HashSet<Integer> s=new HashSet<Integer>();
				int cur_sum=m-arr[i];
				for(int j=i+1;j<n;j++) {
					if(s.contains(cur_sum-arr[j])) {
						System.out.println("triplets is "+arr[i]+" "+arr[j]+" "+(cur_sum-arr[j]));
						count++;
					}
					s.add(arr[j]);
				}
			}
			if(count>0) {
				System.out.println("number of trplets is "+count);
				return count;
			}
			else {
				return count;
			}
		}

	}
