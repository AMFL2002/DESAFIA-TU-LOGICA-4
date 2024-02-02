package paquete;

public class Avion {
    public int idAvion;
    public String modAvion;
    public int capAvion;
    public Piloto piloto;

     public Avion( int idAvion, String modAvion, int capAvion, Piloto piloto){
        this.idAvion=idAvion;
        this.modAvion=modAvion;
        this.capAvion=capAvion;
        this.piloto=piloto;

     }
     public int getIdAvion(){
        return idAvion;
     }
     public void setIdAvion( int idAvion)
     {
        this.idAvion=idAvion;
     }
     public String getModAvion(){
        return modAvion;
     }
     public void setModAvion(String modAvion){
        this.modAvion=modAvion;
     }
     public int getCapAvion(){
        return capAvion;
     }
     public void setCapAvion(int capAvion){
        this.capAvion=capAvion;
     }
     public Piloto getPiloto(){
      return piloto;
     } 
      public void setPiloto( Piloto piloto){
      this.piloto=piloto;
     }
     public void mostrarAvion(){
        System.out.println("Identificador avión: " +idAvion);
        System.out.println("Modelo del avión: " +modAvion);
        System.out.println("Capacidad avión: " +capAvion);
        piloto.mostrarPiloto();

        


     }

}
