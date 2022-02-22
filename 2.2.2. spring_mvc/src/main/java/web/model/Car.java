package web.model;

/**
 * @author Zha_Aibek@mail.com
 */
public class Car {
    private String model;
    private String serial;
    private String color;

    public Car(String model, String serial, String color) {
        this.model = model;
        this.serial = serial;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
