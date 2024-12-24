package com.itwill.guest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.itwill.guest.dto.GuestDto;
import com.itwill.guest.entity.Guest;
/*
 * - 방명록(guest) 관리 비즈니스로직(업무)를 수행하는 클래스
 * - GUI객체(스윙,서블릿,JSP)에서 직접접근(메쏘드호출)하는클래스
 * - GuestDao객체를 이용해서 데이타베이스에 접근하는클래스
 */
@Service
public class GuestServiceImpl implements GuestService{
		@Autowired
		@Qualifier("guestDaoImplJPA")
		private GuestDao guestDao;
		
		public GuestServiceImpl() throws Exception{
			System.out.println("### GuestService()생성자");
		}
		
		/*
		 * 방명록쓰기
		 */
		@Override
		public int guestWrite(GuestDto guestDto) 
				throws Exception{
			/*
			<< GuestDao객체사용>>
			*/
			return guestDao.insert(Guest.toEntity(guestDto));
		}
		/*
		 * 방명록번호로 1개보기
		 */
		@Override
		public GuestDto guestDetail(int guest_no) throws Exception{
			Guest guest=guestDao.findByGuestNo(guest_no);
			if(guest!=null) {
				return GuestDto.toDto(guestDao.findByGuestNo(guest_no));
			}
			return null;
		}
		/*
		 * 방명록번호로삭제
		 */
		@Override
		public int guestDelete(int guest_no) 
				throws Exception{
			return guestDao.delete(guest_no);
		}
		/*
		 * 방명록 리스트보기
		 */
		@Override
		public List<GuestDto> guestList()throws Exception {
			List<GuestDto> guestDtoList=new ArrayList<>();
			for (Guest guestEntity : guestDao.findByAll()) {
				guestDtoList.add(GuestDto.toDto(guestEntity));
			}
			return guestDtoList;
			
		}
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
		@Override
		public int guestUpdate(GuestDto guestDto) throws Exception{
			Guest guest=Guest.toEntity(guestDto);
			return guestDao.update(guest);
		}
		
		
		
		
	}