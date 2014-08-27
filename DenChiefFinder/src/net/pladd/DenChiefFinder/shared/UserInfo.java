/**
 * 
 */
package net.pladd.DenChiefFinder.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author Patrick
 *
 */
public class UserInfo implements IsSerializable {
	public String ID;  // persistent user ID - same even if email changes
	
	public String FirstName;
	public String LastName;
	public String EmailAddress;
	public String HomePhone;
	public String CellPhone;
	public String WorkPhone;
	
	public enum UnitTypeEnum { TROOP, PACK }
	
	public UnitTypeEnum UnitType;
	public int UnitNum;
	public String UnitPosition;
	
	public UserInfo() {
		FirstName = "";
		LastName  = "";
		EmailAddress = "";
		HomePhone = "";
		CellPhone = "";
		WorkPhone = "";

		UnitType = UnitTypeEnum.TROOP;
		UnitNum = 0;
		UnitPosition = "";
	}
}
