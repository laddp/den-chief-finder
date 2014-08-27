/**
 * 
 */
package net.pladd.DenChiefFinder.server;

import net.pladd.DenChiefFinder.client.DenChiefService;
import net.pladd.DenChiefFinder.shared.UserInfo;
import net.pladd.DenChiefFinder.shared.UtilityStuff;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author Patrick
 *
 */
public class DenChiefServiceImpl extends RemoteServiceServlet implements
		DenChiefService {

	private UserService userService = UserServiceFactory.getUserService();

	/**
	 * 
	 */
	private static final long serialVersionUID = 419153290536922733L;

	/* (non-Javadoc)
	 * @see net.pladd.DenChiefFinder.client.DenChiefService#userInfo()
	 */
	@Override
	public UserInfo getUserInfo() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		User user = userService.getCurrentUser();
		if (user != null)
		{
			UserInfo inf = UtilityStuff.dummyUser();
			
			inf.ID = user.getUserId();
			
			return inf;
		}
		else return null;
	}

	
	@Override
	public void setUserInfo(UserInfo userInfo) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

}
