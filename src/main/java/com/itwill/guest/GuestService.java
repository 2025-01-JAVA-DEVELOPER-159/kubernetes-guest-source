package com.itwill.guest;

import java.util.List;

import com.itwill.guest.dto.GuestDto;

import jakarta.transaction.Transactional;
@Transactional
public interface GuestService {

	int GUEST_SEARCH_BY_ALL = 0;
	int GUEST_SEARCH_BY_NAME = 1;
	int GUEST_SEARCH_BY_TITLE = 2;
	int GUEST_SEARCH_BY_CONTENT = 3;

	/*
	 * 방명록쓰기
	 */
	int guestWrite(GuestDto guest) throws Exception;

	/*
	 * 방명록번호로 1개보기
	 */
	GuestDto guestDetail(int guest_no) throws Exception;

	/*
	 * 방명록번호로삭제
	 */
	int guestDelete(int guest_no) throws Exception;

	/*
	 * 방명록 리스트보기
	 */
	List<GuestDto> guestList() throws Exception;

	/*
	 * 방명록 이름으로검색해서 리스트보기
	 */
	/*
	public List<Guest> findByGuestName(String guest_name) throws Exception{
		return guestDao.findByGuestName(guest_name);
	}
	*/
	/*
	 * 방명록 전체,이름,제목,내용 으로검색해서 리스트보기
	 */
	/*
	public List<Guest> findByGuest(int searchType,String searchString)throws Exception{
		List<Guest> guestList=new ArrayList<Guest>();
		switch (searchType) {
		case GuestService.GUEST_SEARCH_BY_ALL:
			guestList = guestDao.findByAll();
			break;
		case GuestService.GUEST_SEARCH_BY_NAME:
			guestList=guestDao.findByGuestName(searchString);
			break;
		case GuestService.GUEST_SEARCH_BY_TITLE:
			guestList=guestDao.findByGuestTitle(searchString);
			break;
		case GuestService.GUEST_SEARCH_BY_CONTENT:
			guestList=guestDao.findByGuestContent(searchString);
			break;
		}
		return guestList;
	}
	*/
	/*
	 * 방명록수정
	 */
	int guestUpdate(GuestDto guest) throws Exception;

}