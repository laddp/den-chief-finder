package net.pladd.DenChiefFinder.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;

import net.pladd.DenChiefFinder.shared.UserInfo;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DenChiefFinder implements EntryPoint {
	/**
	 * Create a remote service proxy to talk to the server-side service.
	 */
	private final DenChiefServiceAsync dcf = GWT.create(DenChiefService.class);

	MainUI mainPage = new MainUI();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		RootPanel.get("appcontent").add(mainPage);

		dcf.getUserInfo(new AsyncCallback<UserInfo>() {
					public void onFailure(Throwable caught) {
						mainPage.setHeader("Error loading user info");
					}

					public void onSuccess(UserInfo result) {
						mainPage.setHeader(result.FirstName + " " + result.LastName);
					}
				}
		);

	}
}
