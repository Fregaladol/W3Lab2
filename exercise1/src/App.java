import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);
    
    public static Bicicleta instance1(){
        Bicicleta bike1 = new Bicicleta("Triban", "Gravel12", 90, true, false);

        System.out.println(bike1.toString());

        return bike1;
    }

    public static void showBrandVel(Bicicleta bike){
        System.err.println("Marca: " + bike.getMarca());
        System.out.println("Velocidad Máxima: " + bike.getVelMax());
    }
    
    public static void instance2(){
        Bicicleta bike2 = new Bicicleta();

        bike2.setMarca("Orbea");
        bike2.setModelo("Orca M30");
        bike2.setVelMax(120);
        bike2.setCambios(true);
        bike2.setCarbono(true);

        System.out.println(bike2.toString());
    }



    public static void instanceArray(){

        ArrayList<Bicicleta> bicicletas = new ArrayList<>();

        System.out.print("Ingresa el número de bicicletas a crear ?\n");
        int numBikes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numBikes; i++) {
            System.out.printf("Comenzamos con la Bicicleta %d.\n",i+1);
            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Velocidad máxima: ");
            double velMax = scanner.nextDouble();

            System.out.print("¿Tiene cambios? (true/false): ");
            boolean cambios = scanner.nextBoolean();

            System.out.print("¿Es de carbono? (true/false): ");
            boolean carbono = scanner.nextBoolean();
            scanner.nextLine(); 

            Bicicleta bicicleta = new Bicicleta(marca, modelo, velMax, cambios, carbono);
            bicicletas.add(bicicleta);

            
        }

        bikeShow(bicicletas);
    }

    public static void bikeShow(ArrayList<Bicicleta> bikeList){

        for (Bicicleta bike: bikeList) {

            System.out.println(bike.toString());
        }


    }

    public static void menu(){

        boolean quitProgram = false;
    

        do {

             System.out.println("Escribe el número de opción\n 1.- Ver bicicleta\n 2.- Ver Bicicleta \n 3.- Ver Velocidad y Marca bicicleta 1\n 4.- Agregar y ver bicicletas ");
            int optionKey = scanner.nextInt();
            scanner.nextLine();

            switch (optionKey) {
                case 1:
                    instance1();
                    break;
                case 2:
                    instance2();
                    break;
                case 3:
                    Bicicleta bike = instance1(); 
                    showBrandVel(bike);
                    break;
                case 4:
                    instanceArray();
                    break; 
                default:
                    break;

            
            }

            System.out.println("Deseas continuar si/no");
            String stringContinue = scanner.nextLine();
            
            if (stringContinue.equalsIgnoreCase("no")){
                quitProgram = true;
            
            }
        } while (!quitProgram);

        

        scanner.close();
    }
    
    public static void main(String[] args) throws Exception {
        
                menu();
        
        


    }

}
