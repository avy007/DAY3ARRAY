package Day3ArrayPracties;

public class LargestNoinArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=10;
		a[2]=90;
		a[3]=10;
		a[4]=100;
		
		int max=a[0]; //10
		
		for(int i=0; i<5; i++) {
			if(a[i]>max) {
				
				max=a[i];
				
			}
			
		}System.out.println("Largest No Of Given Array "+max);

	}

}
