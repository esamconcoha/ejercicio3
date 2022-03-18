
package herencia3;


public class Herencia3 {

   
    public static void main(String[] args) {
        
        
        
        // impresion de datos de superclase computer
        Computer computadora= new Computer ("HP", "plateado",520);
        System.out.println(computadora.toString());
       
        //impresión de datos de clase laptop(heredada de computer)
        laptop lap= new laptop(15, "lenovo ideapad", "azul", 120);
        System.out.println(lap.toString());
        
        //impresión de datos de clase smartPhone(heredada de computer)
        smartPhone telefono= new smartPhone("snapdragon", "xiaomi redmi 7", "dorado", 64);
        System.out.println(telefono.toString());
    }
    
}