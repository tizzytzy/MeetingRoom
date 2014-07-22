package com.meeting.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MEETING_ROOM")
public class MeetingRoom {

	@Id
	@GeneratedValue
	@Column(name = "room_id")
	private Long roomId;

	@Column(name = "name")
	private String name;

	@Column(name = "capacity")
	private int capacity;

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Set<MeetingDetail> getMeetingDetails() {
		return meetingDetails;
	}

	public void setMeetingDetails(Set<MeetingDetail> meetingDetails) {
		this.meetingDetails = meetingDetails;
	}

	@ManyToOne
	@JoinColumn(name = "location_id",
            nullable=false)
	private Location location;
	
    @Column(name = "is_booked")
    private boolean                     isBooked         = Boolean.FALSE;
    
    @Column(name="added_date")
    private Date 					addedDate;
    
	@OneToMany(mappedBy = "meetingRoom",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<MeetingDetail> meetingDetails;
    
}
