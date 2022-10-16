package sillashead.backend.configs;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import sillashead.backend.entities.Brand;
import sillashead.backend.entities.Category;
import sillashead.backend.entities.Product;
import sillashead.backend.entities.ProductSale;
import sillashead.backend.entities.Sale;
import sillashead.backend.repositories.BrandRepository;
import sillashead.backend.repositories.CategoryRepository;
import sillashead.backend.repositories.ProductRepository;
import sillashead.backend.repositories.ProductSaleRepository;
import sillashead.backend.repositories.SaleRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductSaleRepository productSaleRepository;

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public void run(String... args) throws Exception {

        Brand brand1 = new Brand(null, "Samsung");
        Brand brand2 = new Brand(null, "Apple");

        Category category1 = new Category(null, "Smartphone");
        Category category2 = new Category(null, "Laptop");

        Product product1 = new Product(null, "Galaxy S10", 3000.0, brand1, category1);
        Product product2 = new Product(null, "Galaxy S20", 3000.0, brand1, category1);
        Product product3 = new Product(null, "iPhone 12", 5000.0, brand2, category1);
        Product product4 = new Product(null, "iPhone 11", 3000.0, brand2, category1);
        
        Product product5 = new Product(null, "Galaxy Book2", 5000.0, brand1, category2);
        Product product6 = new Product(null, "Galaxy Book3", 5000.0, brand1, category2);
        Product product7 = new Product(null, "Macbook Pro", 3000.0, brand2, category2);
        Product product8 = new Product(null, "Macbook Air", 5000.0, brand2, category2);


        Sale sale1 = new Sale(null, Instant.parse("2022-01-22T15:21:22Z")); 
        Sale sale2 = new Sale(null, Instant.parse("2022-01-23T15:21:22Z"));
        Sale sale3 = new Sale(null, Instant.parse("2022-01-24T15:21:22Z"));
        Sale sale4 = new Sale(null, Instant.parse("2022-01-24T15:21:22Z"));
        Sale sale5 = new Sale(null, Instant.parse("2022-02-26T15:21:22Z"));
        Sale sale6 = new Sale(null, Instant.parse("2022-02-27T15:21:22Z"));
        Sale sale7 = new Sale(null, Instant.parse("2022-02-28T15:21:22Z"));
        Sale sale8 = new Sale(null, Instant.parse("2022-03-01T15:21:22Z"));
        Sale sale9 = new Sale(null, Instant.parse("2022-03-02T15:21:22Z"));
        Sale sale10 = new Sale(null, Instant.parse("2022-03-03T15:21:22Z"));
        Sale sale11 = new Sale(null, Instant.parse("2022-03-04T15:21:22Z"));
        Sale sale12 = new Sale(null, Instant.parse("2022-03-05T15:21:22Z"));
        Sale sale13 = new Sale(null, Instant.parse("2022-04-06T15:21:22Z"));
        Sale sale14 = new Sale(null, Instant.parse("2022-04-07T15:21:22Z"));
        Sale sale15 = new Sale(null, Instant.parse("2022-04-08T15:21:22Z"));
        Sale sale16 = new Sale(null, Instant.parse("2022-05-09T15:21:22Z"));
        Sale sale17 = new Sale(null, Instant.parse("2022-11-10T15:21:22Z"));
        Sale sale18 = new Sale(null, Instant.parse("2022-10-11T15:21:22Z"));
        Sale sale19 = new Sale(null, Instant.parse("2022-05-12T15:21:22Z"));
        Sale sale20 = new Sale(null, Instant.parse("2022-12-13T15:21:22Z"));
        Sale sale21 = new Sale(null, Instant.parse("2022-06-14T15:21:22Z"));
        Sale sale22 = new Sale(null, Instant.parse("2022-07-15T15:21:22Z"));
        Sale sale23 = new Sale(null, Instant.parse("2022-08-16T15:21:22Z"));
        Sale sale24 = new Sale(null, Instant.parse("2022-09-17T15:21:22Z"));

        ProductSale productSale1 = new ProductSale(sale1, product1, 15);
        ProductSale productSale2 = new ProductSale(sale1, product2, 20);
        ProductSale productSale3 = new ProductSale(sale2, product3, 5);
        ProductSale productSale4 = new ProductSale(sale2, product4, 1);
        ProductSale productSale5 = new ProductSale(sale3, product5, 5);
        ProductSale productSale6 = new ProductSale(sale3, product6, 5);
        ProductSale productSale7 = new ProductSale(sale4, product7, 5);
        ProductSale productSale8 = new ProductSale(sale4, product8, 5);
        ProductSale productSale9 = new ProductSale(sale5, product1, 30);
        ProductSale productSale10 = new ProductSale(sale5, product2, 10);
        ProductSale productSale11 = new ProductSale(sale6, product3, 10);
        ProductSale productSale12 = new ProductSale(sale6, product4, 10);
        ProductSale productSale13 = new ProductSale(sale7, product5, 7);
        ProductSale productSale14 = new ProductSale(sale7, product6, 7);
        ProductSale productSale15 = new ProductSale(sale8, product7, 3);
        ProductSale productSale16 = new ProductSale(sale8, product8, 3);
        ProductSale productSale17 = new ProductSale(sale9, product1, 2);
        ProductSale productSale18 = new ProductSale(sale9, product2, 3);
        ProductSale productSale19 = new ProductSale(sale10, product3, 8);
        ProductSale productSale20 = new ProductSale(sale10, product4, 10);
        ProductSale productSale21 = new ProductSale(sale11, product5, 18);
        ProductSale productSale22 = new ProductSale(sale11, product6, 16);
        ProductSale productSale23 = new ProductSale(sale12, product7, 12);
        ProductSale productSale24 = new ProductSale(sale12, product8, 15);
        ProductSale productSale25 = new ProductSale(sale13, product1, 10);
        ProductSale productSale26 = new ProductSale(sale13, product2, 5);
        ProductSale productSale27 = new ProductSale(sale14, product3, 3);
        ProductSale productSale28 = new ProductSale(sale14, product4, 7);
        ProductSale productSale29 = new ProductSale(sale15, product5, 9);
        ProductSale productSale30 = new ProductSale(sale15, product6, 10);
        ProductSale productSale31 = new ProductSale(sale16, product7, 10);
        ProductSale productSale32 = new ProductSale(sale16, product8, 10);
        ProductSale productSale33 = new ProductSale(sale17, product1, 12);
        ProductSale productSale34 = new ProductSale(sale17, product2, 12);
        ProductSale productSale35 = new ProductSale(sale18, product3, 12);
        ProductSale productSale36 = new ProductSale(sale18, product4, 8);
        ProductSale productSale37 = new ProductSale(sale19, product5, 15);
        ProductSale productSale38 = new ProductSale(sale19, product6, 20);
        ProductSale productSale39 = new ProductSale(sale20, product7, 3);
        ProductSale productSale40 = new ProductSale(sale20, product8, 3);
        ProductSale productSale41 = new ProductSale(sale21, product1, 3);
        ProductSale productSale42 = new ProductSale(sale21, product2, 8);
        ProductSale productSale43 = new ProductSale(sale22, product3, 8);
        ProductSale productSale44 = new ProductSale(sale22, product4, 8);
        ProductSale productSale45 = new ProductSale(sale23, product5, 15);
        ProductSale productSale46 = new ProductSale(sale23, product6, 15);
        ProductSale productSale47 = new ProductSale(sale24, product7, 15);
        ProductSale productSale48 = new ProductSale(sale24, product8, 10);

        brandRepository.saveAll(Arrays.asList(brand1, brand2));
        categoryRepository.saveAll(Arrays.asList(category1, category2));
        productRepository.saveAll(Arrays.asList(
            product1, product2, product3, product4, product5, product6, product7, product8
        ));
        saleRepository.saveAll(Arrays.asList(
            sale1, sale2, sale3, sale4, sale5, sale6, sale7, sale8, sale9, sale10, sale11, sale12, sale13, sale14, sale15, sale16, sale17, 
            sale18, sale19, sale20, sale21, sale22, sale23, sale24
        ));
        productSaleRepository.saveAll(Arrays.asList(
            productSale1, productSale2, productSale3, productSale4, productSale5, productSale6, productSale7, productSale8, productSale9, productSale10, productSale11, productSale12,
            productSale13, productSale14, productSale15, productSale16, productSale17, productSale18, productSale19, productSale20, productSale21, productSale22, productSale23, productSale24,
            productSale25, productSale26, productSale27, productSale28, productSale29, productSale30, productSale31, productSale32, productSale33, productSale34, productSale35, productSale36,
            productSale37, productSale38, productSale39, productSale40, productSale41, productSale42, productSale43, productSale44, productSale45, productSale46, productSale47, productSale48
        ));
    }

}
