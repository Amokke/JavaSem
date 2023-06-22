package org.example.lesson3.HomeWork.exes2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Бананы Б", "Бразилия", 10.00, 399.99, 1);
        Product product2 = new Product("Бананы М", "Марокко", 10.00, 299.99, 2);
        Product product3 = new Product("Бананы Н", "Нигерия", 10.00, 199.99, 3);
        Product product4 = new Product("Манго Б", "Бразилия", 15.00, 359.99, 2);
        Product product5 = new Product("Манго М", "Марокко", 15.00, 259.99, 3);
        Product product6 = new Product("Манго Н", "Нигерия", 15.00, 459.99, 1);
        Product product7 = new Product("Мука Р", "Россия", 50.00, 300.00, 1);
        Product product8 = new Product("Мука Б", "Беларусь", 50.00, 350.00, 1);
        Product product9 = new Product("Мука К", "Китай", 50.00, 200.00, 3);
        Product product10 = new Product("Масло К", "Китай", 1.50, 100.00, 2);
        Product product11 = new Product("Масло Р", "Россия", 1.50, 200.00, 1);
        Product product12 = new Product("Масло И", "Индия", 1.50, 150.00, 3);

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
        products.add(product11);
        products.add(product12);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт продукта для поиска: ");
        int n = scanner.nextInt();
        Double minSum = product1.getPrice();
        searchProduct(n, products, minSum);
    }

    private static void searchProduct(int n, ArrayList<Product> products, Double minSum) {
        String priceProduct = "";
        for (Product product: products){
            if (product.getGrade().equals(n)){
                if(minSum > product.getPrice()){
                    minSum = product.getPrice();
                }
            }
        }
        for (Product product: products){
            if (product.getPrice().equals(minSum) && product.getGrade().equals(n)) {
                priceProduct += product.getTitle() + "\n";
            }
        }
        System.out.printf("Минимальная цена продуктов %d сорта: %.2f.%n", n, minSum);
        System.out.printf("Продукты с минимальной ценой:%n%s", priceProduct);
    }
}
