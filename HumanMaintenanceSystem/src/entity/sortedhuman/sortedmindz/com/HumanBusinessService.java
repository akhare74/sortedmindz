package entity.sortedhuman.sortedmindz.com;

import java.util.ArrayList;
import java.util.List;

public class HumanBusinessService {
	
	
	public List<HumanEntity> search(String firstName, String lastName) {
		
		List<HumanEntity> list = new ArrayList<HumanEntity>();
		
		// Initialize list with a few dummy records
		
		list.add(new HumanEntity("Akash","K."));
		list.add(new HumanEntity("Jaya","L."));
		list.add(new HumanEntity("Manisha","D."));
		list.add(new HumanEntity("Pragya","K."));
		
		return list;
	}
	
	public List<HumanEntity> search(Integer id, String firstName, String lastName) {
		
		List<HumanEntity> list = new ArrayList<HumanEntity>();
		
		// Initialize list with a few dummy records
		
		list.add(new HumanEntity(1,"Akash","K."));
		list.add(new HumanEntity(2,"Jaya","L."));
		list.add(new HumanEntity(3,"Manisha","D."));
		list.add(new HumanEntity(4,"Pragya","K."));
		
		return list;
	}
	

}
