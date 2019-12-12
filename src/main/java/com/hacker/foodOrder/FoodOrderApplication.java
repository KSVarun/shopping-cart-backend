package com.hacker.foodOrder;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hacker.foodOrder.beans.Menu;
import com.hacker.foodOrder.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.FileCopyUtils;

import java.nio.charset.StandardCharsets;
import java.util.List;

@SpringBootApplication
public class FoodOrderApplication implements CommandLineRunner {
	@Value("classpath:foodOrder.json")
	private Resource resource;

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderApplication.class, args);
	}
	private JdbcTemplate jdbcTemplate;
	private ObjectMapper objectMapper;
	private MenuRepository menuRepository;
   FoodOrderApplication(JdbcTemplate jdbcTemplate, MenuRepository menuRepository) {
   	this.jdbcTemplate = jdbcTemplate;
   	this.objectMapper = new ObjectMapper();
   	this.menuRepository = menuRepository;
  }
	@Override
	public void run(String... strings) throws Exception {
//		//System.out.println("abcd");
//		//System.out.println(	resource.getInputStream().read());
		try {
////		File resource = new ClassPathResource(
////					"foodOrder.json").getFile();
			//System.out.println(resource.getFile());
			byte[] bdata = FileCopyUtils.copyToByteArray(resource.getInputStream());
			String menuItems = new String(bdata, StandardCharsets.UTF_8);
 			List<Menu> menus = objectMapper.readValue(menuItems, new TypeReference<List<Menu>>() {
			});
////			//System.out.println(menus);

			menuRepository.saveAll(menus);

		} catch (Exception se) {
			se.printStackTrace();
		}
		}
	}

