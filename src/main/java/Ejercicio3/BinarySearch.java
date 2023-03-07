package Ejercicio3;

import java.util.List;

public class BinarySearch implements SearchStrategy {
    public Cellphone searchByModel(List<Cellphone> phones, String model) {
        int low = 0;
        int high = phones.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Cellphone phone = phones.get(mid);

            if (phone.getModel().equals(model)) {
                return phone;
            } else if (phone.getModel().compareTo(model) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public Cellphone searchByPrice(List<Cellphone> phones, double price) {
        int low = 0;
        int high = phones.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Cellphone phone = phones.get(mid);

            if (phone.getPrice() == price) {
                return phone;
            } else if (phone.getPrice() < price) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}

