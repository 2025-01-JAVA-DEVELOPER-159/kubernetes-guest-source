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
		for(int i=0;i<5;i++){
		guestService.guestWrite(GuestDto.builder()
						.guestName("guest"+i)
						.guestEmail("guest"+i+"@gmail.com")
						.guestHomepage("http://www.google"+i+".co.kr")
						.guestTitle("제목"+i)
						.guestContent("내용"+i)
						.build());
		}	

		
	
	}
}
