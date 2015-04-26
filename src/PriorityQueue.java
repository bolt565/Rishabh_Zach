import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishabh
 */
public class PriorityQueue {
    
	int[] frequency;
	int[] copyFrequency;
	String inputs;
	
	public static void main(String args[]){
		
		PriorityQueue queue = new PriorityQueue();
		queue.updateFrequency("test.txt");
		System.out.println(queue);
		for(int i=0; i<256; i++){
			System.out.println(i+" ");
		}
		
	}
	
    public PriorityQueue(){
        frequency = new int[257];
  
        
    }
    
    
    public void updateFrequency(String testFile){
    	try{
    	Scanner scan = new Scanner(new File("test.txt"));
    	
    	scan.useDelimiter("");
    	System.out.println(scan.hasNext());
    	while(scan.hasNext()){
    		
    		String str = scan.next();
    		System.out.println(str);
    		char ch = str.charAt(0);
    		frequency[ch]++;
    		
    		
    	}
    	
    	scan.close();
    	}
    	catch(FileNotFoundException e) {}
    	
    	
    }
    
    public int findMax(){
    	int result =0;
    	int max =0;
    	
    	for(int i=0; i<256; i++){
    		if(frequency[i]>max){
    			result = i;
    			max = frequency[i];
    		}	
    	}
    	
    	copyFrequency[result]=max;
    	frequency[result]=0;
    	return result;
    	
    	
    }
    
    
    	
    public String toString(){
    	
    	String result  = "";
    	for(int i=0; i<frequency.length; i++){
			result+=frequency[i];
		}
    	return result;
    }
}

    
