
package herencia3;


public class Computer {
    
    private String model;
    private String color;
    private int Storage;
    
    
// creación de constructor
    public Computer(String model, String color, int Storage) {
        this.model = model;
        this.color = color;
        this.Storage = Storage;
    }

    public Computer() {
    }
    
    // creación de getters y setter

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int Storage) {
        this.Storage = Storage;
    }
    
    
    // traducción a codigo el metodo toString(): string
    
     @Override
    public String toString(){
        StringBuilder cp = new StringBuilder();
        cp.append("\nModel del equipo: ");
        cp.append(model);
        cp.append("\nColor : ");
        cp.append(color);
        cp.append("\nCapacidad de almacenamiento (en megabytes) : ");
        cp.append(Storage+" mb");
        return cp.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
}
