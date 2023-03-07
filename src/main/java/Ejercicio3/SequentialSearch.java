package Ejercicio3;

import java.util.List;

public class SequentialSearch implements SearchStrategy {
    public Cellphone searchByModel(List<Cellphone> phones, String model) {
        for (Cellphone phone : phones) {
            if (phone.getModel().equals(model)) {
                return phone;
            }
        }
        return null;
    }

    public Cellphone searchByPrice(List<Cellphone> phones, double price) {
        for (Cellphone phone : phones) {
            if (phone.getPrice() == price) {
                return phone;
            }
        }
        return null;
    }
}

