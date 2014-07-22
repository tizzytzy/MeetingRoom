package com.meeting.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meeting.model.MeetingRoom;
import com.meeting.service.MeetingRoomService;

@Controller
public class MeetingRoomController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	MeetingRoomService meetingRoomService;

	@RequestMapping(value = "/meeting/meetingroom", method = RequestMethod.POST)
	public @ResponseBody
	String addMeetingRoom(@RequestParam String meetingRoomName) {

		try {
			MeetingRoom meetingRoom = new MeetingRoom();
			meetingRoom.setName(meetingRoomName);
			meetingRoom.setCapacity(10);
			meetingRoomService.addMeetingRoom(meetingRoom);
			return "Added sucessfully";
		} catch (Exception e) {
			System.out.println("Exception occured" + e);
		}
		return "Failed to add the MeetingRoom";
	}

	@RequestMapping(value = "/meeting/meetingroom", method = RequestMethod.GET)
	public @ResponseBody
	MeetingRoom getMeetingRoom(@RequestParam long meetingRoomId) {
		MeetingRoom meetingRoom = null;
		try {
			meetingRoom = meetingRoomService.getMeetingRoom(meetingRoomId);
		} catch (Exception e) {
			System.out.println("Exception occured" + e);
		}
		return meetingRoom;
	}
}
