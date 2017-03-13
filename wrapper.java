package first_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class wrapper {

	static int size= 0;
	String ab1 = null;


	public static void main(String args[]) {

		// instantiate a hash map
		HashMap<Character,Character> library = new HashMap<Character,Character>() ;
		// Put elements to the map, ideally should be stored elsewhere and imported using a secured reader.
		library.put('a', 'n');
		library.put('b', 'o');
		library.put('c', 'p');
		library.put('d', 'q');
		library.put('e', 'r');
		library.put('f', 's');
		library.put('g', 't');
		library.put('h', 'u');
		library.put('i', 'v');
		library.put('j', 'w');
		library.put('k', 'x');
		library.put('l', 'y');
		library.put('m', 'z');
		
		System.out.print("Enter your string want to be decoded: ");
		//  read input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input_string = null;

	
		//store input
		try {
			input_string = br.readLine();	
			
		} catch (IOException ioe) {
			System.out.println("please check your input");
			System.exit(1);
		}

		//process data 
		String processed =process(input_string);
		size= processed.length();
        //convert string to separate tokens 
		char[] ab=processed.replaceAll("\\W","").toCharArray();		
		StringBuilder decoded_code = new StringBuilder();	
		int counter =1;	
		//loop through and append decoded char
		while(size>0){
			decoded_code.append(library.get(ab[counter-1]));
	      	counter++;
			size--;
			}
		System.out.println("you decoded code is :" +decoded_code);
		}
	
	//process data based on future requirements
	public static String process(String input_string) {
		//two assumptions input string are not trimmed, and are not all lower case, alphabets input only limited to m 
		String processed=input_string.trim();
		processed.toLowerCase();	
		return processed;		
	}
}





