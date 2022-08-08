public class vehicle {
    String make;
    int wheels;
    String color;

    public vehicle(String make, int wheels, String color) {

        this.make = make;
        this.wheels = wheels;
        this.color = color;


    }
        void go () {
    }
        void brake () {

    }
        @Override
        public String toString () {
        return "vehicle{" +
                "make='" + make + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
    }
