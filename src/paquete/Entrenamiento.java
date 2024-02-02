package paquete;

public class Entrenamiento extends Avion {
    public boolean tieneDobleMando;

    public Entrenamiento(int idAvion,String modAvion,int capAvion,Piloto piloto ,boolean tieneDobleMando){
        super(idAvion, modAvion, capAvion, piloto);    
        this.tieneDobleMando=tieneDobleMando;
    }

    public boolean getEntrenamiento(){
        return tieneDobleMando;
    }
    public void setEntrenamiento(boolean tieneDobleMando){
        this.tieneDobleMando=tieneDobleMando;
    }
    public void Entrena(){
        if(tieneDobleMando)
        {
            System.out.println("Permite al instructor tomar el control en caso necesario.");
        }
        else
        System.out.println("No permite al instructor tomar el control en caso necesario.");
    }


}
