package org.example.lesson3.HomeWork.exes1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Мука", 30.5, 2);
        Product product2 = new Product("Соль", 20.99, 2);
        Product product3 = new Product("Сахар", 50.0, 2);
        Product product4 = new Product("Печенье высший вкус", 150.99, 1);
        Product product5 = new Product("Высший вкус мука", 50.45, 1);
        Product product6 = new Product("Соль высший помол", 50.99, 1);
        Product product7 = new Product("Печенье", 100.0, 2);
        Product product8 = new Product("Мука социальная", 25.60, 3);
        Product product9 = new Product("Печенье социальное", 55.0, 3);
        Product product10 = new Product("Яица", 77.0, 3);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
        searchMaxPrice(products);
    }

        public static void searchMaxPrice(ArrayList<Product> products) {
            Double maxSum = 0.0;
            String searchName = "высший";
            String maxPriceProduct = "";
            for (Product product : products) {
                if (product.getName().toLowerCase().contains(searchName) && (product.getGrade() == 1 || product.getGrade() == 2)) {
                    if (maxSum < product.getPrice()) {
                        maxSum = product.getPrice();
                    }
                }
            }
            for (Product product: products) {
                if (product.getName().toLowerCase().contains(searchName) && (product.getGrade() == 1 || product.getGrade() == 2)) {
                    if (product.getPrice().equals(maxSum)) {
                        maxPriceProduct += product.getName() + "\n";
                    }
                }
            }
            System.out.printf("Максимальная цена продуктов 1,2 сорта: %.2f.%n", maxSum);
            System.out.printf("Продукты с максимальной ценой:%n%s", maxPriceProduct);
    }
}
