import java.io.*;
public class UserInterface {

	public String findPetName(String fileName) {
		try (FileReader filereader=new FileReader(new File(fileName));
				BufferedReader br=new BufferedReader(filereader)){
					
					String line;

					while((line=br.readLine())!=null) {
						if(countvowels(line)==2) {
							return line;
						}
				}
				}catch(FileNotFoundException e) {
					return "Please give the correct file name";
				}catch(IOException e) {
					return "Error occured while reading the names from file";
				}return "";
				
	}
	private int countvowels(String name) {
		int count =0;
		for(char ch:name.toLowerCase().toCharArray()) {
			if("aieou".indexOf(ch)!=-1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {

		// Fill the code here
		UserInterface ui=new UserInterface();
		String filename="FindingPetName/inputfeed.txt";
		String petname=ui.findPetName(filename);
		System.out.println(petname);
		
	}

}