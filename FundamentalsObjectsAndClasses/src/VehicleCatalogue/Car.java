package VehicleCatalogue;

public class Car {
    private String type;
    private String model;
    private String color;
    private int horsePower;


    public Car(String type, String model, String color, int horsePower) {
        this.type = "Car";
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }


    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                "Model: %s\n" +
                "Color: %s\n" +
                "Horsepower: %d",this.type,this.model, this.color, this.horsePower);
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

}
