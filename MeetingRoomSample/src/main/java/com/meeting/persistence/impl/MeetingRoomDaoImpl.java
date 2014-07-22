package com.meeting.persistence.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.meeting.model.Location;
import com.meeting.model.MeetingRoom;
import com.meeting.persistence.MeetingRoomDao;
import com.meeting.persistence.query.SelectionCriteria;

public class MeetingRoomDaoImpl implements MeetingRoomDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public MeetingRoom saveMeetingRoom(MeetingRoom meetingRoom) throws Exception {
		Transaction tx = null;
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();
		try {
			tx = session.getTransaction();
			session.beginTransaction();
			session.save(meetingRoom);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		} finally {
			session.close();
		}

		// getHibernateTemplate().save(meetingRoom);
		return null;
	}

	public List<MeetingRoom> listMeetingRooms(SelectionCriteria criteria) {
		// TODO Auto-generated method stub

		return null;
	}

	public MeetingRoom deleteMeetingRoom(MeetingRoom meetingRoom) {
		// TODO Auto-generated method stub
		return null;
	}

	public MeetingRoom getMeetingRoom(final long meetingRoomId) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();
		Criteria criteria = session.createCriteria(MeetingRoom.class);
		criteria.setFetchMode("permissions", FetchMode.SELECT);
		criteria.add(Restrictions.idEq(meetingRoomId));
		return (MeetingRoom) criteria.uniqueResult();
	}

	public Location saveLocation(Location location) throws Exception {
		Transaction tx = null;
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();
		try {
			tx = session.getTransaction();
			session.beginTransaction();
			session.save(location);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		} finally {
			session.close();
		}

		// getHibernateTemplate().save(meetingRoom);
		return null;
	}

	public Location getLocation(long locationId) {
		Session session = getHibernateTemplate().getSessionFactory()
				.openSession();
		Criteria criteria = session.createCriteria(Location.class);
		criteria.setFetchMode("permissions", FetchMode.SELECT);
		criteria.add(Restrictions.idEq(locationId));
		return (Location) criteria.uniqueResult();
	}
}
