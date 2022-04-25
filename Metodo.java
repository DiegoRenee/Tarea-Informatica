import java.util.Scanner;

	public class Metodo {
	 	public static void main(String[] args) {
	 		int valor;
	 //Instacias para crear objetos  
			boolean salir = false;
			Scanner leer = new Scanner(System.in);
		
	
	 		while(!salir){
		Operaciones op = new Operaciones();

			System.out.println("Bienvenido al menu de opciones, elige un opcion");
			op.Menu();
		int opcion = leer.nextInt();
           switch(opcion){

               case 1:
               	System.out.println("Ingrese la tabla");
                   int a = leer.nextInt();
				System.out.println("Ingrese el numero hasta donde quiere llegar");
                   int b = leer.nextInt();
				System.out.println("Tabla de multiplicar del " + a);

   			 	for (int i = 1; i <= b; i++) {
       
           		System.out.println(a  + " x " + i + " = " + a*i);
                   	}

                   	break;

               case 2: 
                op.Gg();
               System.out.println("Ingrese el valor maximo de las tablas de multiplicar que deseas: ");
                valor = leer.nextInt();
             
                   break;

               case 3: System.out.println("Hasta luego, vuelva pronto :) ");
               	salir=true;

                   break;

                default:
  			System.out.println("Esta opcion no es valida, porfavor intente con otra opcion ");
  			}
  		}
  	}
}
