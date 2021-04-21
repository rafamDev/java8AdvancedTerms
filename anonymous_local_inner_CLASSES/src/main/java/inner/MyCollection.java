package inner;

public class MyCollection {

	private static final int size = 15;
	
    private int vector [] = new int [size];
    
    public MyCollection(){
    	for(int i = 0; i < size; i++){
        	//All positions of vector. [0;15]
    		vector[i] = i;
    	}
    }
    
    public void printPairs() {
    	pairsIterator itPairs = this.new pairsIterator();
    	  while(itPairs.hasNext()){
    		  System.out.println(itPairs.getNext() + " ");
    	  }
    }
	   
       //Iterator inner class with pairs position.
       private class pairsIterator{
    	   
    	   private int nextPosition = 0;
    	   
    	   public boolean hasNext(){
    		   //Indicate if there are more elements within the vector. 
    		   return (nextPosition <= size - 1);
    	   }
    	   
    	   public int getNext(){
    		   int valuePosition = vector[nextPosition];
    		   nextPosition += 2;
    		   //Return the value for each pair position.
    		   return valuePosition;
    	   }
       
       }
}
