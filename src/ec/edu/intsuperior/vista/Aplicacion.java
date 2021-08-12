
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;



public class Aplicacion {
    public static void main(String[] args) {
  Persona p1 = new Persona();
  Cliente c1= new Cliente();
        
       
        
        p1.setNombre("Andres");
        p1.setEdad(25);
        c1.setTlf("0987654321");
 
       System.out.println(p1.toString()+"\n"+
               "Telefono:"+c1.getTlf() );

        
    
    }
    
}
