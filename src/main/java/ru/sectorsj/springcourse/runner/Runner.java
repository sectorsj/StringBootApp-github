package ru.sectorsj.springcourse.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.sectorsj.springcourse.pojo.Product;
import ru.sectorsj.springcourse.repo.ProductRepository;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final List<Product> products;

    public Runner (ProductRepository productRepository,
                   List<Product> products) {
        this.productRepository = productRepository;
        this.products = products;
    }

    @Override
    public void run(String... args) throws Exception {

    }

}



