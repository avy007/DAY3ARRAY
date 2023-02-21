package Day3ArrayPracties;

public class SmallestNo {

	public static void main(String[] args) {
		
		                 // 0 1 2 3  4  5 
		int a[]=new int[] {10,20,30,4,50};
		
		int small=a[0];
		
		for(int i=0; i<5; i++) {
			
			if(a[i]<small) {
				
				small=a[i];
				
			}
			
		}System.out.println("Smallest no of given array "+small);
		
		

	}

}
