import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the sentence");
	    String sentence = sc.nextLine();
	    
	    String[] array = sentence.split(" ");
	    if(!sentence.matches("[a-zA-Z ]+")) {
	    	System.out.println("Invalid Sentence");
	    	return;
	    }
	    if(array.length%2==0) {
	    	String temp = array[0];
	    	array[0] = array[array.length-1];
	    	array[array.length-1] = temp;
	    }else {
	    	for(int i = 0;i<array.length;i++) {
	    		array[i] = new StringBuilder(array[i]).reverse().toString();
	    	}
	    }
	    System.out.println("Word Count: "+array.length);
	    for(int j = 0;j<array.length;j++) {
	    	System.out.print(array[j]+" ");
	    }
	}
}
