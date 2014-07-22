package com.meeting.controller.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.meeting.model.Location;
import com.meeting.model.MeetingDetail;
import com.meeting.model.MeetingRoom;
import com.meeting.service.MeetingRoomService;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager")
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/BeanLocations.xml" })
public class MeetingControllerTest {
	@Autowired
	MeetingRoomService meetingRoomService;

	   @Test
	   public void MeetingCRUD() throws Exception{
		   MeetingRoom room=new MeetingRoom();
		   room.setName("sample");
		   room.setCapacity(10);
		   Location location=new Location();
		   location.setBuildingName("Pramati");
		   location.setLevel("3");
		   //room.setLocation(location);
		   meetingRoomService.addLocation(location);
		   System.out.println("The location is id ::"+location.getLocationId());
		 //  location=meetingRoomService.getLocation(3);
		   room.setLocation(location);
		   MeetingDetail meetingDetail=new MeetingDetail();
		   meetingDetail.setFromDate(new Date());
		   meetingDetail.setToDate(new Date());
		   meetingDetail.setMeetingRoom(room);
		   //room.getMeetingDetails().add(meetingDetail);
		   Set<MeetingDetail> meetingDetailsList=new HashSet<MeetingDetail>();
		   meetingDetailsList.add(meetingDetail);
		   room.setMeetingDetails(meetingDetailsList);
		   
		   meetingRoomService.addMeetingRoom(room);
	   }
}
