package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Group implements Mediator {
    private List<Colleague> colleagues;

    public Group() {
        this.colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague colleague) {
        for (Colleague c : colleagues) {
            if (!c.equals(colleague)) {
                c.receive(message);
            }
        }
    }
}

