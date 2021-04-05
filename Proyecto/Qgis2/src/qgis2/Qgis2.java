/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qgis2;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class Qgis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        double Coordinatex1;
        double Coordinatex2;
        double Coordinatey1;
        double Coordinatey2;
        double dist;

        double Sx1;
        double Sx2;
        double Sy1;
        double Sy2;
        double disites;

        int Currentvariable = 0;
        int Oldvariable = 0;
        final int valor = 100;
        float y = 0;

        int mainRivers;
        int wildlifeReserve;
        int riversAndReserves;

        int peopleVisitant = 0;
        int habitants = 0;
        final int value = 100;
        float i = 0;

        String[][] atractivosturisticos = new String[4][3];
        String[] provincias = new String[4];
        
        do {
            ImportantPointsOfTheCountry();
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println(" <-- Insert a coordinatex1 -->");
                    Coordinatex1 = input.nextInt();
                    System.out.println(" <-- Insert a coordinatex2 -->");
                    Coordinatex2 = input.nextInt();
                    System.out.println(" <-- Insert a coordinatey1 -->");
                    Coordinatey1 = input.nextInt();
                    System.out.println(" <-- Insert a coordinatey2 -->");
                    Coordinatey2 = input.nextInt();
                    dist = calculateTheDistanceBetweenTwoEcuatoriansVolcanos(Coordinatex1, Coordinatex2, Coordinatey1, Coordinatey2);
                    System.out.println(" <- dist is -> " + dist);
                    break;

                case 2:
                    System.out.println(" <-- Insert a Sx1 -->");
                    Sx1 = input.nextInt();
                    System.out.println(" <-- Insert a Sx2 -->");
                    Sx2 = input.nextInt();
                    System.out.println(" <-- Insert a Sy1 -->");
                    Sy1 = input.nextInt();
                    System.out.println(" <-- Insert a Sy2 -->");
                    Sy2 = input.nextInt();
                    disites = calculateTheDistanceBetweenTwoPlaces(Sx1, Sx2, Sy1, Sy2);
                    System.out.println(" <- disites is -> " + disites);
                    break;

                case 3:
                    y = calculateThePopulationPercent(Currentvariable, Oldvariable, valor);
                    System.out.println("The percentage is");
                    System.out.println("enter Currentvariable -> ");
                    Currentvariable = input.nextInt();
                    System.out.println("enter Oldvariable -> ");
                    Oldvariable = input.nextInt();
                    y = ((Currentvariable - Oldvariable) / Oldvariable) * valor;
                    y = calculateThePopulationPercent(Currentvariable, Oldvariable, valor);
                    System.out.println(" percentage of" + y + "is equal to ->" + y);
                    break;

                case 4:
                    System.out.println("Enter the amount of rivers -> ");
                    mainRivers = input.nextInt();
                    System.out.println("Enter the amount ofwildlifeReserves -> ");
                    wildlifeReserve = input.nextInt();
                    riversAndReserves = calculateTheNumberOfRiversAndReservesOfEcuador(mainRivers, wildlifeReserve);
                    System.out.println("the total number of wildlife reserves and main rives of the Ecuador is --> " + riversAndReserves);
                    break;

                case 5:
                    y = vistantPercentage(peopleVisitant, habitants, value);
                    System.out.print("The percentage is");
                    System.out.print("enter peopleVisitant -> ");
                    peopleVisitant = input.nextInt();
                    System.out.println("enter habitants -> ");
                    habitants = input.nextInt();
                    i = (peopleVisitant / habitants) * value;
                    i = vistantPercentage(peopleVisitant, habitants, value);
                    System.out.println("percentage of" + i + "is equal to ->" + i);
                    break;

                case 6:
                    Scanner scan = new Scanner(System.in);
                    principalesLugaresTuristicos(provincias, scan, atractivosturisticos);
                    break;
                    
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

                case 7:
                    System.out.println("<<------------ See you later alligators ------------->>");
                    break;
            }

        } while (option != 7);
    }

    private static void ImportantPointsOfTheCountry() {
        System.out.println(" ========= Project =======");
        System.out.println("1. -> distance  volcanos");
        System.out.println("2. -> distance  province");
        System.out.println("3. -> percentage population");
        System.out.println("4. -> number of rivers and reserves");
        System.out.println("5. -> percentage visitan");
        System.out.println("6. -> Turistic places");
        System.out.println("7. -> Exit");
        System.out.println("Enter your menu option --> ");
    }

    public static double calculateTheDistanceBetweenTwoEcuatoriansVolcanos(double Coordinatex1, double Coordinatex2, double Coordinatey1, double Coordinatey2) {
        double dist;
        double first;
        double second;
        first = Math.pow(Coordinatex2 - Coordinatex1, 2);
        second = Math.pow(Coordinatey2 - Coordinatey1, 2);
        dist = (double) Math.sqrt(first + second);
        return (double) dist;

    }

    public static double calculateTheDistanceBetweenTwoPlaces(double Sx1, double Sx2, double Sy1, double Sy2) {
        double disites;
        double place1;
        double place2;
        place1 = Math.pow(Sx2 - Sx1, 2);
        place2 = Math.pow(Sy2 - Sy1, 2);
        disites = (double) Math.sqrt(place1 + place2);
        return (double) disites;
    }

    public static float calculateThePopulationPercent(int Currentvariable, int Oldvariable, int valor) {
        float y = 0.0F;
        y = (((float) Currentvariable - (float) Oldvariable) / (float) Oldvariable) * valor;
        return y;
    }

    public static int calculateTheNumberOfRiversAndReservesOfEcuador(int mainRivers, int wildlifeReserves) {
        int riversAndReserves;
        riversAndReserves = mainRivers + wildlifeReserves;
        return riversAndReserves;
    }

    public static float vistantPercentage(int peopleVisitant, int habitants, int value) {
        float i = 0.0F;
        i = ((float) peopleVisitant / (float) habitants) * value;
        return i;
    }

    private static void principalesLugaresTuristicos(String[] provincias, Scanner scan, String[][] atractivosturisticos) {
        System.out.println("Introduzca el nombre de cuatro provicias de su preferencia.");
        int i = 0;
        int j = 0;
        for (i = 0; i < 4; i++) {
            provincias[i] = scan.nextLine();
        }
        for (i = 0; i < 4; i++) {
            System.out.println("Introduzca los principales atractivos turísticos de " + provincias[i] + ".");
            for (j = 0; j < 3; j++) {
                atractivosturisticos[i][j] = scan.nextLine();
            }
        }
        System.out.print("\nLos provincias y sus principales atractivos intoducidos son los siguientes: \n");
        for (i = 0; i < 4; i++) {
            System.out.print("\n" + provincias[i] + ": \t");
            for (j = 0; j < 3; j++) {
                System.out.print(atractivosturisticos[i][j] + "\t");
            }
        }
    }
}