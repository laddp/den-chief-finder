package net.pladd.DenChiefFinder.client;

import net.pladd.DenChiefFinder.shared.UserInfo;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>DCFservice</code>.
 */
public interface DenChiefServiceAsync {
	void getUserInfo(AsyncCallback<UserInfo> callback)
			throws IllegalArgumentException;

	void setUserInfo(UserInfo userInfo, AsyncCallback<Void> callback)
			throws IllegalArgumentException;
}
