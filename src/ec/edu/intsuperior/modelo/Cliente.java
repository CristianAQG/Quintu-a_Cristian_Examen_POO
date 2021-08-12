
package ec.edu.intsuperior.modelo;

public class Cliente {
  private  String tlf;

    public Cliente() {
    }

    public Cliente(String tlf) {
        this.tlf = tlf;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
       @Override //sobreescribir
    public String toString() {
        return "Telefono: "+ getTlf();
    }
}
