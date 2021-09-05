package com.mauriciocoruja.SpringProject;

import com.mauriciocoruja.SpringProject.entities.Category;
import com.mauriciocoruja.SpringProject.entities.Product;
import com.mauriciocoruja.SpringProject.repositories.CategoryRepository;
import com.mauriciocoruja.SpringProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringProjetcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;


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

		Product p1 = new Product(1L, "RTX 3080 Asus TUF", 8500.0, category1);
		Product p2 = new Product(2L, "Calça Preta Jeans", 85.0, category2);
		Product p3 = new Product(3L, "Código Limpo", 55.0, category3);
		Product p4 = new Product(4L, "Funko POP Alloy - Horizon Zero Dawn", 150.0, category4);
		Product p5 = new Product(5L, "Paçoca - Paçoquiita", 8.50, category5);
		Product p6 = new Product(5L, "Maria Mole - Paçoquiita", 18.50, category5);

		category1.getProducts().add(p1);
		category2.getProducts().add(p2);
		category3.getProducts().add(p3);
		category4.getProducts().add(p4);
		category5.getProducts().addAll(Arrays.asList(p5, p6));

		categoryRepository.save(category1);
		categoryRepository.save(category2);
		categoryRepository.save(category3);
		categoryRepository.save(category4);
		categoryRepository.save(category5);

		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		productRepository.save(p6);
	}
}
