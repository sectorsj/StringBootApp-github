package ru.sectorsj.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sectorsj.springcourse.pojo.Product;
import ru.sectorsj.springcourse.pojo.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ProductRepository productRepository = new ProductRepository();
	}
}
