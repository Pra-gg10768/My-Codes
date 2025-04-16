import java.util.HashSet;

public class ClassHouseFormation {

	HashSet<String> studSet=new HashSet<String>();


	public HashSet<String> getStudSet() {
		return studSet;
	}

	public void setStudSet(HashSet<String> studSet) {
		this.studSet = studSet;
	}

	public void addName(String details)
	{ 
		String[] parts = details.split(":");
        if (parts.length == 2) {  
            String name = parts[1].trim();  
            studSet.add(name);
        }
	}
	
	public HashSet<String> formTeam()
	{	
		HashSet<String> teamSet = new HashSet<>(); 

	    for (String name : studSet) {
	        char firstLetter = Character.toUpperCase(name.charAt(0)); 
	        String house;

	        if (firstLetter >= 'A' && firstLetter <= 'H') {
	            house = "RED";
	        } else if (firstLetter >= 'I' && firstLetter <= 'P') {
	            house = "BLUE";
	        } else {
	            house = "GREEN";
	        }

	        teamSet.add(name + ":" + house);
	    }
	    return teamSet;
		
	}
}
