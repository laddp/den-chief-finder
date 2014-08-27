/**
 * 
 */
package net.pladd.DenChiefFinder.shared;

import net.pladd.DenChiefFinder.shared.UtilityStuff.DayOfWeekEnum;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author Patrick
 *
 */
public class MeetingInfo implements IsSerializable {
	public DayOfWeekEnum MeetingDay;
	public int           MeetingHour;
	public int			 MeetingMinute;
	
	public String MeetingAddress;
	public String MeetingTown;
	public String MeetingState;
	public String MeetingZip;
	public float  Latitude;
	public float  Longitude;
	
	public long MeetingContact;
	
	public MeetingInfo() { }
}
