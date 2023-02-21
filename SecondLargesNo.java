package Day3ArrayPracties;

public class SecondLargesNo {

	public static void main(String[] args) {
		int a[];
		a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=4;
		//a[3]=6;
		//a[4]=9;
		//a[5]=0;
		//a[6]=3;
		
		int larzest=0;
		int secondlarze=0;
		
		for(int i=0;i<a.length;i++) { //0 1 2
			
			if(a[i]>larzest) {
				//1>0
				//2>1
				//4>2
				
				secondlarze=larzest;
				//0
				//1
				//2
				larzest=a[i];  
				//1
				//2
				//4
			}
		
		}System.out.println(secondlarze);

	}

}
