import java.util.List;
import java.util.stream.Stream;

public class CartonUtility {
	private List<Carton> cartonList;

	public List<Carton> getCartonList() {
		return cartonList;
	}

	public void setCartonList(List<Carton> cartonList) {
		this.cartonList = cartonList;
	}

	public Stream<Carton> convertToStream() {
		 
		return cartonList.stream();
	}

	public Carton findMax(Stream<Carton> stream1) {
		
		Carton maxCarton = null;

	    for (Carton carton : stream1.toList()) {  
	        if (maxCarton == null || carton.getQuantity() > maxCarton.getQuantity()) {
	            maxCarton = carton;
	        }
	    }

	    return maxCarton;
					
	}
	

}
