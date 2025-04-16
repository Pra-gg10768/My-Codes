import java.util.Map;
import java.util.HashMap;

public class Country {
    
    private Map<String,String> countryMap=new HashMap<String,String>();

    public Map<String, String> getCountryMap() {
		return countryMap;
	}

	public void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}

	public void add(String cname,String capname)
    {
	    countryMap.put(cname.toLowerCase(), capname);
    }

    public String search(String cname)
    {
    	if (countryMap.isEmpty()) {
            return "The map is empty";
        }
        return countryMap.getOrDefault(cname.toLowerCase(), "Data not found");
    }
}
