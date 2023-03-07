package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cellphone> phones = new ArrayList<>();
        phones.add(new Cellphone("Galaxy S21", "Samsung", "Alta gama", 1299));
        phones.add(new Cellphone("iPhone 12", "Apple", "Alta gama", 1099));
        phones.add(new Cellphone("Redmi Note 10", "Xiaomi", "Media gama", 249));
        phones.add(new Cellphone("Moto E7 Plus", "Motorola", "Baja gama", 149));
        phones.add(new Cellphone("Nokia 3.4", "Nokia", "Media gama", 199));

        SearchStrategy searchStrategy;
        if (phones.size() > 100) {
            searchStrategy = new BinarySearch();
        } else {
            searchStrategy = new SequentialSearch();
        }

        String modelToSearch = "iPhone 12";
        double priceToSearch = 1099;
        Cellphone result = searchStrategy.searchByModel(phones, modelToSearch);
        if (result != null) {
            System.out.println("El celular " + modelToSearch + " existe en la tienda.");
        } else {
            System.out.println("El celular " + modelToSearch + " no existe en la tienda.");
        }
        result = searchStrategy.searchByPrice(phones, priceToSearch);
        if (result != null) {
            System.out.println("El celular con precio $" + priceToSearch + " existe en la tienda.");
        } else {
            System.out.println("El celular con precio $" + priceToSearch + " no existe en la tienda.");
        }
    }
}

