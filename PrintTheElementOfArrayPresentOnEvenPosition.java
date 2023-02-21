package Day3ArrayPracties;

public class PrintTheElementOfArrayPresentOnEvenPosition {

	public static void main(String[] args) {
		//Java Program to print the elements of an array present on an even position
        
		int a[]=new int [5];
		
		a[0]=0;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		
		for(int i=0; i<5; i++) {
			
			if (i%2==0) {
				System.out.println(a[i]);
			}
			
		}
		
	}

}
