package Day3ArrayPracties;

public class DuplicateElement {

	public static void main(String[] args) {
		
		    
        int [] a = new int [] {1,2,2,3,3};   
          
        
  
        for(int i=0; i<5; i++) {  
        	
        	
            for(int d = i + 1; d<5; d++) {  
            	
                if(a[i] == a[d])  
                    System.out.println(a[d]);  

	}
        }
	}

}
