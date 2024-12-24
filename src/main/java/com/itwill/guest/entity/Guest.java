package com.itwill.guest.entity;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.itwill.guest.dto.GuestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@DynamicUpdate
@DynamicInsert
@Entity

public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer guestNo;

	private String guestName;
	@CreationTimestamp		  //JPA insert시 자동삽입
	private Date guestDate;
	private String guestEmail;
	private String guestHomepage;
	private String guestTitle;
	private String guestContent;
	
	public static Guest toEntity(GuestDto guestDto) {
		return Guest.builder()
				.guestNo(guestDto.getGuestNo())
				.guestName(guestDto.getGuestName())
				.guestDate(guestDto.getGuestDate())
				.guestEmail(guestDto.getGuestEmail())
				.guestHomepage(guestDto.getGuestHomepage())
				.guestTitle(guestDto.getGuestTitle())
				.guestContent(guestDto.getGuestContent())
				.build();
	}
}
