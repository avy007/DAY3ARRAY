package Day3ArrayPracties;

public class PrintTheElementOfArrayPresentOnOddPosition {

	public static void main(String[] args) {
		//PrintTheElementOfArrayPresentOnOddPosition
		
		int [] a=new int[7];
		
		a[0]=0;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		a[5]=5;
		a[6]=6;
		
		for(int i=0; i<7; i++) {
			
			if(i%2!=0)
			
			System.out.println("ArrayPresentOnOddPosition "+a[i]);
		}

	}

}
