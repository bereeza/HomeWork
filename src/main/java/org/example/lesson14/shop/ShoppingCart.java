package org.example.lesson14.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.lesson14.exception.NoSuchProductException;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class ShoppingCart {
    private List<Product> list;
    private static final float DISCOUNT = 0.9F;

    public List<Product> getBooksLessThanNum() {
        return list.stream()
                .filter(x -> x.getType().equals(Type.Book) && x.getPrice() > 250)
                .toList();
    }

    public List<Product> discountBooks() {
        return list.stream()
                .filter(x -> x.getType().equals(Type.Book) && x.isDiscount())
                .peek(p -> p.setPrice(p.getPrice() * DISCOUNT))
                .toList();
    }

    public Product getCheaperBook() {
        return list.stream()
                .filter(product -> product.getType().equals(Type.Book))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new NoSuchProductException("Продукт [категорія: BOOK] не знайдено"));
    }

    public List<Product> getThreeLastProductsByTime() {
        return list.stream()
                .sorted((p1, p2) -> p2.getDate().compareTo(p1.getDate()))
                .limit(3)
                .toList();
    }

    public double calculatePrice() {
        return list.stream()
                .filter(product -> product.getDate().getYear() == LocalDate.now().getYear() &&
                        product.getType() == Type.Book &&
                        product.getPrice() <= 75.0
                ).mapToDouble(Product::getPrice)
                .sum();
    }

    public Map<Type, List<Product>> getHashProductCollection() {
        return list.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
