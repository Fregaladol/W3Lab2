import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class App {
    
    public static void instance1(){
        Bicicleta bike1 = new Bicicleta("Triban", "Gravel12", 90, true, false);

        System.out.println(bike1.toString());
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
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();

        bikeShow(bicicletas);
    }

    public static void bikeShow(ArrayList<Bicicleta> bikeList){

        for (Bicicleta bike: bikeList) {

            System.out.println(bike.toString());
        }


    }
    
    public static void main(String[] args) throws Exception {
        
        instance1();        
        instance2();
        instanceArray();


    }
}
