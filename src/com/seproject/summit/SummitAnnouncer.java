package src.com.seproject.summit;

import java.util.ArrayList;
import java.util.List;

public class SummitAnnouncer {
	private List<SummitObserver> observerList = new ArrayList<SummitObserver>();
	private List<Summit> summitInfo = new ArrayList<Summit>();
	private int summitCount = 100;
	
	public void addRecipient(SummitObserver notify){
		observerList.add(notify);
	}
	
	public void removeRecipient(SummitObserver notify){
		observerList.remove(notify);
	}
	
	public void sendNotification(Summit summit){
		for(SummitObserver observer : observerList){
			observer.notify(summit);
		}
	}
	
	public void addNewSummit(Summit summit){
		summitInfo.add(summit);
	}
	
	public void removeSummitNotice(int sid){
		for(Summit summit: summitInfo){
			if(summit.getID() == sid){
				summitInfo.remove(summit);
				break;
			}
		}
	}
	
	public void reNotify(int sID){
		Summit temp = null;
		
		for(Summit summit : summitInfo){
			if(sID == summit.getID()){
				temp = summit;
				break;
			}
		}
		
		if(temp == null){
			return;
		}
		
		for(SummitObserver observer : observerList){
			observer.notify(temp);
		}
	}
	
}
