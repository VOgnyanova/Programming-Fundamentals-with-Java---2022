package vehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;


    public String getType() {
        return type;
    }


    public String getModel() {
        return model;

    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }


    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;

    }

    @Override
    public String toString() {
        String typeVehicle = type.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVehicle + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsePower;

    }
}
