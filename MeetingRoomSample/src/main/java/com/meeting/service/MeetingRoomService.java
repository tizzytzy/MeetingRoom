package com.meeting.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.meeting.model.Location;
import com.meeting.model.MeetingRoom;
import com.meeting.persistence.query.SelectionCriteria;

@Transactional(propagation = Propagation.SUPPORTS)
public interface MeetingRoomService {

	@Transactional(propagation = Propagation.REQUIRED)
	public void addMeetingRoom(MeetingRoom meetingRoom) throws Exception;

	public MeetingRoom getMeetingRoom(long meetingRoomId);

	public List<MeetingRoom> getMeetingRoomList(SelectionCriteria criteria);

	@Transactional(propagation = Propagation.REQUIRED)
	public void addLocation(Location location)throws Exception;

	public Location getLocation(long LocationId);
	
}
