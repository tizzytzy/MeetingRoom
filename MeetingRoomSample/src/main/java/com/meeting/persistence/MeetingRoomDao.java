package com.meeting.persistence;

import java.util.List;

import com.meeting.model.Location;
import com.meeting.model.MeetingRoom;
import com.meeting.persistence.query.SelectionCriteria;

public interface MeetingRoomDao{
	public MeetingRoom saveMeetingRoom(MeetingRoom meetingRoom) throws Exception;
	public List<MeetingRoom> listMeetingRooms(SelectionCriteria criteria);
	public MeetingRoom deleteMeetingRoom(MeetingRoom meetingRoom);
	public MeetingRoom getMeetingRoom(final long meetingRoomId);
	public Location saveLocation(Location location)throws Exception;;
	public Location getLocation(final long locationId);

}
