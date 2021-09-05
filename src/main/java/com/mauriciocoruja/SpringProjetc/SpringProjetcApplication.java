package com.mauriciocoruja.SpringProjetc;

import com.mauriciocoruja.SpringProjetc.entities.Category;
import com.mauriciocoruja.SpringProjetc.entities.Product;
import com.mauriciocoruja.SpringProjetc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjetcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringProjetcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category category1 = new Category(1L,"Eletronics");
		Category category2 = new Category(2L,"Clothes");
		Category category3 = new Category(3L,"Books");
		Category category4 = new Category(4L,"Toys");
		Category category5 = new Category(5L,"Groceries");

		categoryRepository.save(category1);
		categoryRepository.save(category2);
		categoryRepository.save(category3);
		categoryRepository.save(category4);
		categoryRepository.save(category5);
	}
}
