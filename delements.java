package Day3ArrayPracties;

public class delements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=new int[] {10,30,30,4,50};
		
		int duplicate=a[0];
		
		for(int i=0; i<5; i++) { //2			
			for(int c=i+1; c<5; c++) {//3o
				 
				if(a[i]==a[c]) {
					System.out.println(a[c]);
				}
				
			}
			
		}//System.out.println("Smallest no of duplicate "+a[c]);
		
		

	}

}
