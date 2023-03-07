package Ejercicio4;

public class User extends Colleague {
    public User(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " envía el mensaje: " + message);
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " recibe el mensaje: " + message);
    }
}

