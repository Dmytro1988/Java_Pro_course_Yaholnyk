package app;

import app.exception.ProductEmptyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class ProductTest {


    @Test
    void gettingAllProducts() {

        Product product1 = (new Product(1, "Book",200,false, LocalDate.of(2023, 1, 15)));
        Product product2 = (new Product(2, "macBook",1000,false, LocalDate.of(2023, 1, 10)));
        Product product3 = (new Product(3, "iPhone",800,false, LocalDate.of(2023, 1, 8)));
        Product product4 = (new Product(4, "Book",400,true, LocalDate.of(2023, 1, 12)));

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        List<Product> allProducts = ProductService.gettingAllProducts(products);

        assertEquals(1, allProducts.size());
        assertEquals("Book", allProducts.get(0).getType());
        assertEquals(400,allProducts.get(0).getPrice());


           }
    @Test
    void getDiscountBook() {

        Product product1 = (new Product(1, "Book",200,false, LocalDate.of(2023, 1, 15)));
        Product product2 = (new Product(2, "macBook",1000,false, LocalDate.of(2023, 1, 10)));
        Product product3 = (new Product(3, "iPhone",800,false, LocalDate.of(2023, 1, 8)));
        Product product4 = (new Product(4, "Book",400,true, LocalDate.of(2023, 1, 12)));

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        List<Product> discountBook = ProductService.getDiscountBook(products);


        assertEquals(200, discountBook.get(0).getPrice());
        assertEquals(360, discountBook.get(1).getPrice());



    }

    @Test
    void findCheapBook() {
        Product product1 = (new Product(1, "Book",200,false, LocalDate.of(2023, 1, 15)));
        Product product2 = (new Product(2, "macBook",1000,false, LocalDate.of(2023, 1, 10)));
        Product product3 = (new Product(3, "iPhone",800,false, LocalDate.of(2023, 1, 8)));
        Product product4 = (new Product(4, "Book",400,true, LocalDate.of(2023, 1, 12)));

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        Product cheapBook = ProductService.findCheapBook(products);


            assertEquals(200, cheapBook.getPrice());
            assertEquals("Book", cheapBook.getType());

    }

    @Test
    void findCheapBookException() {
       // Product product1 = (new Product(1, "Book",200,false, LocalDate.of(2023, 1, 15)));
        Product product2 = (new Product(2, "macBook",1000,false, LocalDate.of(2023, 1, 10)));
        Product product3 = (new Product(3, "iPhone",800,false, LocalDate.of(2023, 1, 8)));
       // Product product4 = (new Product(4, "Book",400,true, LocalDate.of(2023, 1, 12)));

        List<Product> products = new ArrayList<>();
       // products.add(product1);
        products.add(product2);
        products.add(product3);
        //products.add(product4);

        Assertions.assertThrows(ProductEmptyException.class, () -> ProductService.findCheapBook(products));


    }


    @Test
    void getLastAddProducts() {
        Product product1 = (new Product(1, "Book",200,false, LocalDate.of(2023, 1, 15)));
        Product product2 = (new Product(2, "macBook",1000,false, LocalDate.of(2023, 1, 10)));
        Product product3 = (new Product(3, "iPhone",800,false, LocalDate.of(2023, 1, 8)));
        Product product4 = (new Product(4, "Book",400,true, LocalDate.of(2023, 1, 12)));

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        List<Product> lastAddedProducts = ProductService.getLastAddProducts(products, 3);
        assertEquals(3, lastAddedProducts.size());
        assertEquals(product1, lastAddedProducts.get(0));
        assertEquals(product2, lastAddedProducts.get(2));
        assertEquals(product4, lastAddedProducts.get(1));

    }

    @Test
    void calculateTotalCost() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Book",200,false, LocalDate.of(2023, 1, 15)));
        products.add(new Product(2, "macBook",1000,false, LocalDate.of(2023, 1, 10)));
        products.add(new Product(3, "iPhone",800,false, LocalDate.of(2023, 1, 8)));
        products.add(new Product(4, "Book",400,true, LocalDate.of(2023, 1, 12)));

        double totalCost = ProductService.calculateTotalCost(products);
        assertEquals(600.0,totalCost);



    }

    @Test
    void productsByGroup() {
        Product product1 = (new Product(1, "Book",200,false, LocalDate.of(2023, 1, 15)));
        Product product2 = (new Product(2, "macBook",1000,false, LocalDate.of(2023, 1, 10)));
        Product product3 = (new Product(3, "iPhone",800,false, LocalDate.of(2023, 1, 8)));
        Product product4 = (new Product(4, "Book",400,true, LocalDate.of(2023, 1, 12)));

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        Map<String, List<Product>> productsByGroup = ProductService.productsByGroup(products);

        assertEquals(3, productsByGroup.size());
        Assertions.assertTrue(productsByGroup.containsKey("Book"));
        Assertions.assertTrue(productsByGroup.containsKey("iPhone"));
        Assertions.assertTrue(productsByGroup.containsKey("macBook"));

        List<Product> bookProducts = productsByGroup.get("Book");
        assertEquals(2, bookProducts.size());
        Assertions.assertTrue(bookProducts.contains(product1));
        Assertions.assertTrue(bookProducts.contains(product4));


    }
}












