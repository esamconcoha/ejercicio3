
package herencia3;


public class laptop extends Computer {
    
    private int screenSize;

    public laptop(int screenSize, String model, String color, int Storage) {
        super(model, color, Storage);
        
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    

    
     @Override
    public String toString(){
        StringBuilder cp = new StringBuilder();
        cp.append(super.toString());
        cp.append("\nTamaño de la pantalla(en pulgadas): ");
        cp.append(screenSize+"pulgadas");
        return cp.toString();
    }
    
}
