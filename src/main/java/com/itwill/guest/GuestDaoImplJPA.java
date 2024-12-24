package com.itwill.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.guest.entity.Guest;
import com.itwill.guest.repository.GuestRepository;

@Repository("guestDaoImplJPA")
public class GuestDaoImplJPA implements GuestDao {
	@Autowired
	GuestRepository guestRepository;

	@Override
	public int insert(Guest guest) throws Exception {
		// TODO Auto-generated method stub
		Guest saveGuest = guestRepository.save(guest);
		return saveGuest.getGuestNo();
	}

	@Override
	public int update(Guest guest) throws Exception {
		System.out.println(">>>>>>>>>>>"+guest);
		Guest updateGuest = guestRepository.save(guest);
		return updateGuest.getGuestNo();
	}

	@Override
	public int delete(int guestNo) throws Exception {
		guestRepository.deleteById(guestNo);
		return 0;
	}

	@Override
	public Guest findByGuestNo(int guestNo) throws Exception {
		if (guestRepository.findById(guestNo).isPresent()) {
			return guestRepository.findById(guestNo).get();
		}
		return null;
	}

	@Override
	public List<Guest> findByAll() throws Exception {
		// TODO Auto-generated method stub
		return guestRepository.findAll();
	}

}
