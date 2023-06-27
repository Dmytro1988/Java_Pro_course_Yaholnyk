package app;

import app.exception.ProductEmptyException;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductService {

    public static List<Product> gettingAllProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() > 250)
                .collect(Collectors.toList());
    }


    public static List<Product> getDiscountBook(List<Product> products) {

        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .peek(product -> {
                    if (product.isDiscount()) {
                        double discountedPrice = product.getPrice() * product.getDiscountAmount();
                        product.setPrice(discountedPrice);
                    }
                })
                .collect(Collectors.toList());
    }
    public static Product findCheapBook(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new ProductEmptyException("Продукт [категорія: Book] не знайдено"));
    }


    public static List<Product> getLastAddProducts(List<Product> products, int i) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateCreate).reversed())
                .limit(i)
                .collect(Collectors.toList());
    }


    public static double calculateTotalCost(List<Product> products) {

        return products.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 400)
                .filter(product -> product.getDateCreate().getYear() == LocalDate.now().getYear())
                .mapToDouble(Product::getPrice)
                .sum();

    }


    public static Map<String, List<Product>> productsByGroup(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }


}
