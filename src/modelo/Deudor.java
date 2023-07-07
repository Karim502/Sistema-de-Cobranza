package modelo;

public class Deudor extends Persona{
    String idDeudor;
    int numeroDeudaTotal;
    double totalAdeudado;
    int estado;

    public String getIdDeudor() {
        return idDeudor;
    }

    public int getNumeroDeudaTotal() {
        return numeroDeudaTotal;
    }

    public double getTotalAdeudado() {
        return totalAdeudado;
    }
}
