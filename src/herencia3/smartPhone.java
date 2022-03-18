
package herencia3;


public class smartPhone extends Computer {
    
    private String processor;

    public smartPhone(String processor, String model, String color, int Storage) {
        super(model, color, Storage);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    
     @Override
    public String toString(){
        StringBuilder gg = new StringBuilder();
        gg.append(super.toString());
        gg.append("\nProcesador: ");
        gg.append(processor);
        return gg.toString();
    }
    
}
