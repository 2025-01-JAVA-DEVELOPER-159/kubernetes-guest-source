package com.itwill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


import com.itwill.app.domain.DatasourceProperties;
import com.itwill.guest.GuestService;
import com.itwill.guest.dto.GuestDto;


@SpringBootApplication
@EnableConfigurationProperties(DatasourceProperties.class)
public class GuestBackendApplication  implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(GuestBackendApplication.class, args);
	}
	@Autowired
	private GuestService guestService;
	@Override
	public void run(String... args) throws Exception {
		guestService.guestWrite(GuestDto.builder()
						.guestName("guest1")
						.guestEmail("guest@gmail.com")
						.guestHomepage("http://www.google.co.kr")
						.guestTitle("제목1")
						.guestContent("내용1")
						.build());
		guestService.guestWrite(GuestDto.builder()
						.guestName("guest2")
						.guestEmail("guest@gmail.com")
						.guestHomepage("http://www.google.co.kr")
						.guestTitle("제목2")
						.guestContent("내용2")
						.build());
		guestService.guestWrite(GuestDto.builder()
						.guestName("guest3")
						.guestEmail("guest@gmail.com")
						.guestHomepage("http://www.google.co.kr")
						.guestTitle("제목3")
						.guestContent("내용3")
						.build());
		guestService.guestWrite(GuestDto.builder()
						.guestName("guest4")
						.guestEmail("guest@gmail.com")
						.guestHomepage("http://www.google.co.kr")
						.guestTitle("제목4")
						.guestContent("내용4")
						.build());
		guestService.guestWrite(GuestDto.builder()
						.guestName("guest5")
						.guestEmail("guest5@gmail.com")
						.guestHomepage("http://www.google.co.kr")
						.guestTitle("제목5")
						.guestContent("내용5")
						.build());
	
	}
}
