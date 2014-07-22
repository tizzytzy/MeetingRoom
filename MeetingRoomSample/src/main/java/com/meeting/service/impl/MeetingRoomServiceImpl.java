package com.meeting.service.impl;

import java.util.List;

import com.meeting.model.Location;
import com.meeting.model.MeetingRoom;
import com.meeting.persistence.MeetingRoomDao;
import com.meeting.persistence.query.SelectionCriteria;
import com.meeting.service.MeetingRoomService;

public class MeetingRoomServiceImpl implements MeetingRoomService{
	
	private MeetingRoomDao meetingRoomDao;

	public void addMeetingRoom(com.meeting.model.MeetingRoom meetingRoom) throws Exception {
		// TODO Auto-generated method stub
		meetingRoomDao.saveMeetingRoom(meetingRoom);
		
	}

	public MeetingRoom getMeetingRoom(long meetingRoomId) {
		// TODO Auto-generated method stub
		meetingRoomDao.getMeetingRoom(meetingRoomId);
		
		return null;
	}

	public List<MeetingRoom> getMeetingRoomList(
			SelectionCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	public MeetingRoomDao getMeetingRoomDao() {
		return meetingRoomDao;
	}

	public void setMeetingRoomDao(MeetingRoomDao meetingRoomDao) {
		this.meetingRoomDao = meetingRoomDao;
	}

	public void addLocation(Location location) throws Exception {
		meetingRoomDao.saveLocation(location);
		
	}

	public Location getLocation(long LocationId) {
		// TODO Auto-generated method stub
		return null;
	}



}
