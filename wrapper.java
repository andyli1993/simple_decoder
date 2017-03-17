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

		//create a loop which records the decoder value pair onto the hashmap

		for (char alphabet1 = 'a', alphabet2 = 'n';	alphabet1 <= 'm'; 	alphabet1++, alphabet2++) {
			library.put(alphabet1,alphabet2);

		}

		//prompt message to ask ur
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
		boolean abc= true;
		size= processed.length();
		//convert string to separate tokens 
		char[] tokens=processed.replaceAll("\\W","").toCharArray();		
		StringBuilder decoded_code = new StringBuilder();	
		int counter =1;	
		//loop through and append decoded char
		while(size>0){

			if (library.get(tokens[counter-1]) == null) {
				System.out.println("can't decode that!");
				abc=false;
				break;


			} else {			  	
				decoded_code.append(library.get(tokens[counter-1]));
				counter++;
				size--;
			}
		}

		if(abc!=false){
			System.out.println("you decoded code is :" +decoded_code);

		}
	}

	//process data based on future requirements
	public static String process(String input_string) {
		//two assumptions and are not all lower case, alphabets input only limited to m, user might put invalid input by mistake in which case system will trigger an error message


		return input_string.toLowerCase();			
	}
}





