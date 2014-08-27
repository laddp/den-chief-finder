package net.pladd.DenChiefFinder.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import net.pladd.DenChiefFinder.shared.UserInfo;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("dcf")
public interface DenChiefService extends RemoteService {
	UserInfo getUserInfo() throws IllegalArgumentException;
	void setUserInfo(UserInfo userInfo) throws IllegalArgumentException;
	
	
}
