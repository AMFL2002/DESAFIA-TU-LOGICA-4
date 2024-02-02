package paquete;

public class Combate extends Avion {
    public boolean esFurtivo;

    public Combate(int idAvion, String modAvion, int capAvion,Piloto piloto, boolean esFurtivo){
        super(idAvion, modAvion, capAvion, piloto);
        this.esFurtivo=esFurtivo;
    }
    public boolean getEsFurtivo(){
        return esFurtivo;
    }
    public void setEsFurtivo(boolean esFurtivo){
        this.esFurtivo=esFurtivo;
    }
    public void Furtivo(){
        if (esFurtivo)
        {
            System.out.println("El avión cuenta con tecnología furtiva para minimizar la visibilidad de radares.");
        }
        else
        System.out.println("No cuenta con tecnología furtiva.");
    }
}
