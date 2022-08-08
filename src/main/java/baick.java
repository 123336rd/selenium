public class baick extends vehicle {
    String model;
    int hp;
    int service;




    public bick(String make, int wheels, String color, String model, int hp, int service) {
        super(make, wheels, color);
        this.model = model;
        this.hp = hp;
        this.service = service;
    }

    @Override
    void go() {
        super.go();
        System.out.println("voooom");
    }

    @Override
    void brake() {
        System.out.println("braking");
    }

    @Override
    public String toString() {
        return "baick{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                ", service=" + service +
                '}';
    }
}
}

