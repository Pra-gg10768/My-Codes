import java.util.*;

public class Car {

	private Map<String, Integer> carMap;

    public Car() {
        carMap = new LinkedHashMap<>();
    }


	// Include getter and setter
	

	public void addCar(String name,int num)
	{
		// Code here
		if (num <= 0)  return;
        for(String k:carMap.keySet()) {
        	if(k.equalsIgnoreCase(name)) {
        		return;
        	}
        }
        carMap.put(name, num);
	}
	
	public Map<String, Integer> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Integer> carMap) {
		this.carMap = carMap;
	}

	public int carByName(String name)
	{
		// Code here
		return carMap.getOrDefault(name.trim().toLowerCase(), -1);
	}
	
	public List<String> carByCount(int count)
	{
		// Code here
		List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : carMap.entrySet()) {
            if (entry.getValue() >= count) {
                result.add(entry.getKey());
            }
        }
        return result.isEmpty() ? null : result;
	}
	
	public int totalCarsSold()
	{
		int total = 0;
        for (int count : carMap.values()) {
            total += count;
        }
        return total;
	}
	public boolean isEmpty() {
        return carMap.isEmpty();
    }
	
}