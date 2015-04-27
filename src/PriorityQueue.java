import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishabh
 * @param <E>
 */
public class PriorityQueue {
    
	int[] frequency;
	int[] copyFrequency;
	LinkedList priorityList;
	String inputs;
	
	public static void main(String args[]) throws IOException {
		
		PriorityQueue queue = new PriorityQueue();
		// the file i used contained ababcdefghhh.,+
		queue.updateFrequency("test.txt");
		System.out.println(queue);
		System.out.println(queue.findMax());
		
		
		
		
		
		
		
	}
	
    public PriorityQueue(){
        frequency = new int[257];
        copyFrequency = new int[257];
        // feel free to make it something besides linkedlist if that would be better
        priorityList = new LinkedList();
  
        
    }
    
    
    public void updateFrequency(String testFile) throws IOException{
    	BitInputStream stream = new BitInputStream("test.txt");

		// the .read() function returns -1 when there is nothing left to read
    	// im pretty sure this is what we want to read them in
		int temp = 0;
		while(temp!=-1){
			temp = stream.read();
			if(temp!=-1){
				frequency[temp]++;
			}
			
		}
    	
    	
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
    	return copyFrequency[result];
    	
    	
    }
    
    // this may not be the correct approach but i think it works
    public void makePriorityQueue(){
    	int max = this.findMax();
    	
    	while(max!=0){
    		// make linked list
    		
    		
    		
    	}
    	
    	
    }
    
    
    	
    public String toString(){
    	
    	String result  = "";
    	for(int i=0; i<frequency.length; i++){
			result+=frequency[i];
		}
    	return result;
    }
}

    
