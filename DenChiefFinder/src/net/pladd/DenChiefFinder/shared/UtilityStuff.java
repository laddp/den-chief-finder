/**
 * 
 */
package net.pladd.DenChiefFinder.shared;

import net.pladd.DenChiefFinder.shared.UserInfo.UnitTypeEnum;

/**
 * @author Patrick
 *
 */
public class UtilityStuff {
	public enum DayOfWeekEnum { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
	
	public static UserInfo dummyUser()
	{
		UserInfo rc = new UserInfo();
		
		rc.ID           = "123456789";
		rc.FirstName    = "Patrick";
		rc.LastName     = "Ladd";
		rc.EmailAddress = "pmladd@gmail.com";
		rc.HomePhone    = "(845)296-1242";
		rc.CellPhone    = "(914)475-8692";
		rc.WorkPhone    = "(845)297-5580 x1701";
		
		rc.UnitType = UnitTypeEnum.TROOP;
		rc.UnitNum = 26;
		rc.UnitPosition = "SM";
		
		return rc;
	}
}
