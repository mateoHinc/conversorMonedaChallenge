package menuOpciones;

import apis.ConsultarMoneda;

import java.util.Locale;
import java.util.Scanner;

public class MenuOpciones {
    public void opciones(int opcion) {

        ConsultarMoneda consulta = new ConsultarMoneda();
        switch (opcion) {
            case 1:

                try {
                    System.out.println("Pasar dolares a pesos argentinos");
                    System.out.println("Ingresa el valor de Dolares a pesos Argentinos: ");
                    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                    double valorDolar_A_Arg = sc.nextDouble();
                    double tasaDolar_A_Arg = consulta.obtenerTasaCambio("USD", "ARS");
                    double resultadoDolar_A_Arg = consulta.convertir(valorDolar_A_Arg, tasaDolar_A_Arg);
                    System.out.println("El resultado de la conversión es: " + resultadoDolar_A_Arg);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Valor no válido.");
                }

                break;
            case 2:

                try {
                    System.out.println("Pasar pesos argentinos a dolares");
                    System.out.println("Ingresa el valor de pesos argentinos a dolares: ");
                    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                    double valorArg_A_Dolar = sc.nextDouble();
                    double tasaArg_A_Dolar = consulta.obtenerTasaCambio("ARS", "USD");
                    double resultadoArg_A_Dolar = consulta.convertir(valorArg_A_Dolar, tasaArg_A_Dolar);
                    System.out.println("El resultado de la conversión es: " + resultadoArg_A_Dolar);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Valor no válido.");
                }

                break;
            case 3:

                try {
                    System.out.println("Pasar dolares a reales brasileños");
                    System.out.println("Ingresa el valor de Dolares a Reales Brasileños: ");
                    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                    double valorDolar_A_Real = sc.nextDouble();
                    double tasaDolar_A_Real = consulta.obtenerTasaCambio("USD", "BRL");
                    double resultadoDolar_A_Real = consulta.convertir(valorDolar_A_Real, tasaDolar_A_Real);
                    System.out.println("El resultado de la conversión es: " + resultadoDolar_A_Real);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Valor no válido.");
                }

                break;
            case 4:

                try {
                    System.out.println("Pasar reales brasileños a dolares");
                    System.out.println("Ingresa el valor de Reales Brasileños a Dolares: ");
                    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                    double valorReal_A_Dolar = sc.nextDouble();
                    double tasaReal_A_Dolar = consulta.obtenerTasaCambio("BRL", "USD");
                    double resultadoReal_A_Dolar = consulta.convertir(valorReal_A_Dolar, tasaReal_A_Dolar);
                    System.out.println("El resultado de la conversión es: " + resultadoReal_A_Dolar);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Valor no válido.");
                }

                break;
            case 5:

                try {
                    System.out.println("Pasar dolares a pesos colombianos");
                    System.out.println("Ingresa el valor de Dolares a Pesos Colombianos: ");
                    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                    double valorDolar_A_Cop = sc.nextDouble();
                    double tasaDolar_A_Cop = consulta.obtenerTasaCambio("USD", "COP");
                    double resultadoDolar_A_Cop = consulta.convertir(valorDolar_A_Cop, tasaDolar_A_Cop);
                    System.out.println("El resultado de la conversión es: " + resultadoDolar_A_Cop);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Valor no válido.");
                }

                break;
            case 6:

                try {
                    System.out.println("Pasar pesos colombianos a dolares");
                    System.out.println("Ingresa el valor de Pesos Colombianos a Dolares: ");
                    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                    double valorCop_A_Dolar = sc.nextDouble();
                    double tasaCop_A_Dolar = consulta.obtenerTasaCambio("COP", "USD");
                    double resultadoCop_A_Dolar = consulta.convertir(valorCop_A_Dolar, tasaCop_A_Dolar);
                    System.out.println("El resultado de la conversión es: " + resultadoCop_A_Dolar);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Valor no válido.");
                }

                break;
        }
    }
}
