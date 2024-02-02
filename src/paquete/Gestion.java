package paquete;
import java.util.Scanner;

public class Gestion {
     public static void main(String[] args){
        Piloto piloto1 = new Piloto(1, "Pete Maverick", "capitan", 10000);
        Piloto piloto2 = new Piloto(2, "Natasha Phoenix", "teniente", 3000);
        Piloto piloto3 = new Piloto(3, "Bradley Rooster", "teniente", 3500);

        Scanner p3 = new Scanner(System.in);
        System.out.println("Escriba el nombre del cuarto piloto:");
        String p3nam = p3.nextLine();
        

        System.out.println("Escriba el cargo del cuarto piloto:");
        String p3carg = p3.nextLine();
       

        System.out.println("Escriba las horas de vuelo del cuarto piloto:");
        int p3hor = p3.nextInt();
        
        Piloto piloto4 = new Piloto(4, p3nam, p3carg, p3hor);
        

        Scanner p6 = new Scanner(System.in);
        System.out.println("Escriba el nombre del quinto piloto:");
        String p4nam = p6.nextLine();
       
        System.out.println("Escriba el cargo del quinto piloto:");
        String p4carg = p6.nextLine();
       

        System.out.println("Escriba las horas de vuelo del quinto piloto:");
        int p4hor = p6.nextInt();

        Piloto piloto5 = new Piloto(5, p4nam, p4carg, p4hor);
        
        piloto1.mostrarPiloto();
        piloto3.mostrarPiloto();
        piloto4.mostrarPiloto();
        piloto5.mostrarPiloto();


        Combate avion1=new Combate(6, "Caza", 5, piloto2, true); 
        Combate avion2=new Combate(7, "Boeing 747", 150, piloto1, false);
        Entrenamiento avion3=new Entrenamiento(8, "Airbus A380", 300, piloto3, true);

        Scanner a3 = new Scanner(System.in);
        System.out.println("Escriba el modelo del cuarto avion:");
        String a3nam = a3.nextLine();
    
        System.out.println("Escriba la capacidad del cuarto avion:");
        int a3carg = a3.nextInt();
       
        System.out.println("Escriba el piloto del cuarto avion(Introduzca número del 1 al 5):");
        int a3pil = a3.nextInt();

        System.out.println("Escriba 0 si no cuenta con doble mando o 1 en caso contrario:");
        Boolean a10doble = a3.nextBoolean();
        Entrenamiento avion4=null;
        
        switch(a3pil){
            case 1:{
                avion4=new Entrenamiento(9, a3nam, a3carg, piloto1, a10doble);
                break;
            }
            case 2:{
                avion4=new Entrenamiento(9, a3nam, a3carg, piloto2, a10doble);
                break;
            }
            case 3:{
                avion4=new Entrenamiento(9, a3nam, a3carg, piloto3, a10doble);        
                break;
            }
            case 4:{
                avion4=new Entrenamiento(9, a3nam, a3carg, piloto4, a10doble);         
                break;
            }
            case 5:{
                avion4=new Entrenamiento(9, a3nam, a3carg, piloto5, a10doble);        
                break;
            }
            default:
            System.out.println("El piloto introducido no se encuentra en el rango");
        }
       
        
        Scanner a6 = new Scanner(System.in);
        System.out.println("Escriba el modelo del cuarto avion:");
        String a6nam = a6.nextLine();
        

    
        System.out.println("Escriba la capacidad del cuarto avion:");
        int a7carg = a6.nextInt();
       
        System.out.println("Escriba el piloto del cuarto avion(Introduzca número del 1 al 5):");
        int a8pil = a6.nextInt();


        System.out.println("Escriba 0 si no cuenta con doble mando o 1 en caso contrario:");
        Boolean a11furtivo = a6.nextBoolean();
       Entrenamiento avion5=null;
       
        switch(a8pil){
            case 1:{
                avion5=new Entrenamiento(9, a6nam, a7carg, piloto1,a11furtivo);
                break;
            }
            case 2:{
                avion5=new Entrenamiento(9, a6nam, a7carg, piloto2,a11furtivo);
                break;
            }
            case 3:{
                avion5=new Entrenamiento(9, a6nam, a7carg, piloto3,a11furtivo);
                break;
            }
            case 4:{
                avion5=new Entrenamiento(9, a6nam, a7carg, piloto4,a11furtivo);
                break;
            }
            case 5:{
                avion5=new Entrenamiento(9, a6nam, a7carg, piloto5,a11furtivo);
                break;
            }
            default:
            System.out.println("El piloto introducido no se encuentra en el rango");
        }
        p3.close();
        p6.close();
        a3.close();
        a6.close();
        

        avion1.mostrarAvion();
        avion1.Furtivo();
        avion2.mostrarAvion();
        avion2.Furtivo();
        avion3.mostrarAvion();
        avion3.Entrena();
        avion4.mostrarAvion();
        avion4.Entrena();
        avion5.mostrarAvion();
        avion5.Entrena();
    }

}
