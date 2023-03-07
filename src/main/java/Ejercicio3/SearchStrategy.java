package Ejercicio3;

import java.util.List;

public interface SearchStrategy {
    Cellphone searchByModel(List<Cellphone> phones, String model);
    Cellphone searchByPrice(List<Cellphone> phones, double price);
}
