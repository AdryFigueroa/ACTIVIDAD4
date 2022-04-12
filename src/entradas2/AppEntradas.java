package entradas2;

import java.util.Scanner;
import entradas2.Asiento;



public class AppEntradas {
	
	
	
	private static int entradasDisponibles = 100;
    private static int entradasVendidas = 0;
    private static float cantidadRecaudada = 0;
    private static int opcion;

    public final static int OPCION_MENU_ENTRADAS_DISPONIBLES = 1;
    public final static int OPCION_MENU_COMPRAR_ENTRADAS = 2;
    public final static int OPCION_MENU_ENTRADAS_VENDIDAS = 3;
    public final static int OPCION_MENU_CANTIDAD_RECAUDADA = 4;
    public final static int OPCION_MENU_SALIR = 5;

   
	

    public static void main(String[] args) {
            
    do {
            opcion = menu();
                    switch (opcion) {
                    case OPCION_MENU_ENTRADAS_DISPONIBLES:
                            entradasDisponibles();
                            break ;
                    case OPCION_MENU_COMPRAR_ENTRADAS :
                            comprarEntradas();
                            break;         
                    case OPCION_MENU_ENTRADAS_VENDIDAS:
                            entradasVendidas();
                            break;         
                    case OPCION_MENU_CANTIDAD_RECAUDADA:
                            verCantidadRecaudada();
                            break;
                    
                    } 
                                            
            }while (opcion != OPCION_MENU_SALIR);
            
    }

    private static int menu() {
            
    Scanner in = new Scanner(System.in);
    
    System.out.println("------\n MENU EVENTO \n------" );
    System.out.println("[1.] ENTRADAS DISPONIBLES ");
    System.out.println("[2.] COMPRAR ENTRADAS ");
    System.out.println("[3.] ENTRADAS VENDIDAS");
    System.out.println("[4.] CANTIDAD RECAUDADA");
    System.out.println("[5.] SALIR ");
    System.out.println("\n******************************\n");
    System.out.println("[Elija la opción]");
    
    int opcion = in.nextInt();
    
    return opcion;
    
    }

    public static void verCantidadRecaudada() {
        System.out.println("Cantidad Recaudada : " + cantidadRecaudada );
    }

    public static void entradasVendidas() {
            System.out.println("Entradas Vendidas : " + entradasVendidas + " Entradas");
    }

    public static void entradasDisponibles() {
            System.out.println("Entradas Disponibles: " + entradasDisponibles + " Entradas disponibles");
    }

    public static void comprarEntradas() {
            
            Scanner in = new Scanner(System.in);
                    
            float precioPalco= 100000;
            
        	
			System.out.println("ELIGA TIPO DE ASIENTO \n");
			System.out.println("[1] 'Palco:' $100.000");
			System.out.println("[2] 'Platea:' $60.000");
			System.out.println("[3] 'Galeria:' $30.000");
			int asiento = in.nextInt();
			String tipoAsiento = "PALCO";

			switch(asiento) {
				case 1:
					tipoAsiento = "PALCO";
					break;
				case 2:
					tipoAsiento = "PLATEA";
					break;
				case 3:
					tipoAsiento = "GALERIA";
					break;
			}
                    
                    if (entradasDisponibles == 0) {
                            System.out.println("NO HAY ENTRADAS DISPONIBLES");
                    } else {
                            System.out.println("Indique la cantidad de entradas: ");
                            int cantidadEntradas = in.nextInt();
                            if (cantidadEntradas > entradasDisponibles) {
                                    System.out.println("ENTRADAS DISPONIBLES");
                            } else {
                                            precioPalco = (precioPalco * cantidadEntradas);
                                            System.out.println("VENTA REALIZADA. PRECIO FINAL: " + tipoAsiento);
                                    }
                                    entradasDisponibles = entradasDisponibles - cantidadEntradas;
                                    entradasVendidas = entradasVendidas + cantidadEntradas;
                                    cantidadRecaudada = 100000 * entradasVendidas;
                                    
                                    System.out.println("QUEDAN " + entradasDisponibles + " en Palco.");
                                    
                            }
            
                    }

}
