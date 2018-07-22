package sortedhuman.sortedmindz.com;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

import entity.sortedhuman.sortedmindz.com.HumanBusinessService;
import entity.sortedhuman.sortedmindz.com.HumanEntity;



@SuppressWarnings("deprecation")
@ManagedBean(name="humanuser")
@SessionScoped

public class HumanBusinessController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	HumanEntity humanEntity ;
	
	private List<HumanEntity> listOfHumans;
	private HumanEntity selectedHuman;
	
	private String date;
	
	
	
	
	public String getDate() {
		return date;
	}

	
	public void setDate(String date) {
		this.date = date;
	}

	public String searchPage(){
	
		//humanEntity.setFirstName("");
		System.out.println("hello");
		
		
		return "success";
		}
	
	public String createPage(){
		
		//humanEntity.setFirstName("");
		System.out.println("create page");
		return "success";
		}


	public String save() {	
		
		//date =humanEntity.getDob().toString();
		System.out.println("humanEntity.getFirstName()-[" + humanEntity.getFirstName()+"]");
		
		if(humanEntity.getFirstName() != null && !(humanEntity.getFirstName() == "")) {
			System.out.println("inside if statement");
			System.out.println("value of object-----"+humanEntity);
			System.out.println("value of objecy name-----"+humanEntity.getFirstName());

			this.setListOfHumans(new HumanBusinessService().search(1,"", ""));
			
			return"human";
		}
		else 
			
		    

			return "success";
				
		
		}

	public HumanEntity getHumanEntity() {
		if(humanEntity==null) {
			humanEntity = new HumanEntity();
		}
		return humanEntity;
	}
	
	public String backButton() {
		humanEntity.setFirstName("");
		humanEntity.setLastName("");
		//date =humanEntity.getDob().toString();
		setDate("");
		return "success";
		
	}

	public void setHumanEntity(HumanEntity humanEntity) {
		this.humanEntity = humanEntity;
	}


	public List<HumanEntity> getListOfHumans() {
		return listOfHumans;
	}


	public void setListOfHumans(List<HumanEntity> listOfHumans) {
		this.listOfHumans = listOfHumans;
	}


	public HumanEntity getSelectedHuman() {
		return selectedHuman;
	}


	public void setSelectedHuman(HumanEntity selectedHuman) {
		this.selectedHuman = selectedHuman;
	}
	
	

}
