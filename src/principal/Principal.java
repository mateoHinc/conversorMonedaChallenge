package principal;

import menuOpciones.MenuOpciones;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;


        System.out.println("******************************");
        System.out.println("\n¡Bienvenido al Conversor de Monedas!");
        System.out.println("\n******************************");

        while(opcion !=7){
            try{
                System.out.println("""
                        ***Escriba el número del menú de opciones***
                        1) Dolar ==> Perso Argentino
                        2) Peso Argentino ==> Dolar
                        3) Dolar ==> Real Brasileño
                        4) Real Brasileño ==> Dolar
                        5) Dolar ==> Peso Colombiano
                        6) Peso Colombiano ==> Dolar
                        7) Salir
                        ********************************************
                        """);
                opcion = Integer.parseInt(sc.nextLine());

                if(opcion < 1 || opcion > 7) {
                    System.out.println("Opción no valida, vuelve a ingresar");
                    continue;
                }

                MenuOpciones menuOpciones = new MenuOpciones();
                menuOpciones.opciones(opcion);

            } catch (NumberFormatException e) {
                System.out.println("Numero no valido");
            } catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}
