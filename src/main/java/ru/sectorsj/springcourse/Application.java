package ru.sectorsj.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.sectorsj.springcourse.pojo.Product;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		List<Product> products = (List<Product>) context.getBean("products");
		System.out.println(products.get(1));

	}

}
