package Instance;
import StaticStuff.*;
import java.util.ArrayList;

public class Instance {
	
	//Data
	private User user;
	private ArrayList<Group> groups;
	private Statistics stats;
	private HowTo information;
	
	public Instance(String username, String password){
		this.user = new User(username, password);
		this.groups = user.getGroups();
		this.stats = user.getUserStatistics();
		this.information = new HowTo();
	}
}
