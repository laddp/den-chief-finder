/**
 * 
 */
package net.pladd.DenChiefFinder.server;

import net.pladd.DenChiefFinder.shared.UserInfo;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

/**
 * @author Patrick
 *
 */
public class UserInfoHandler {
	private DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	
	Key addToDataStore(UserInfo user)
	{
		Entity storeUser = new Entity("User");
		storeUser.setProperty("googleID", user.ID);
		storeUser.setProperty("userObj", user);
		
		ds.put(storeUser);
		
		return null;
	}
	
	

//	boolean ExistsInDatastore()
}
