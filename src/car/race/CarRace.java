/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.race;

/**
 *
 * @author 37067
 */
public class CarRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] cars = new int[8];
        int interm = 100;
        boolean doRace = true;
        while (doRace) {
            // kiekviena masina pavaziuoja po random nuo 0 iki 10 km
            for (int i = 0; i < cars.length; i++) {
                cars[i] += Math.random() * 10 + 1;
            }
            boolean printInterm = false;
            int intermWinner = 0;
            int intermWinnerKm = 0;
            for (int i = 0; i < cars.length; i++) {
                if (cars[i] > intermWinnerKm) {
                    intermWinner = i + 1;
                    intermWinnerKm = cars[i];
                }
                // kas simta kilometru ieskome pirmaujancios masinos
                if (cars[i] >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            // spausdiname visu masinu nuvaziuota kelia kas simta kilometru
            if (printInterm) {
              for (int i = 0; i < cars.length; i++) {
                  System.out.print(cars[i] + " km ");
              }
                // spausdiname pirma nuvaziavusia dar 100 km ir jos nuvaziuota distancija
                System.out.println();
                System.out.println("At the moment fist is " + intermWinner + " car. Distance passed: " + intermWinnerKm + " km");
            }
            // nustatome laimetoja
            for (int i = 0; i < cars.length; i++) {
                // jei bent viena masina pasieke 1000 km
                if (cars[i] >= 1000) {
                    System.out.println("The winner is " + (i + 1) + " car!!!");
                    doRace = false;
                    break;
                }
            }    
        }
        // isrikiuojame masyva mazejimo tvarka
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++ ) {
                if (cars[i] < cars[j]) {
                    int temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        // spausdiname masyva isrikiuota mazejimo tvarka
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        
        
//        boolean isFinish = false;
//        while (!isFinish) {
//            for (int i = 0; i < cars.length; i++) {
//                int randomDistance = (int) (Math.random() * 10 + 1);
//                cars[i] += randomDistance;
//                if (cars[i] >= 1000) {
//                    isFinish = true;
//                }
//            }
//        }
//        for (int i = 0; i < cars.length; i++) {
//             /* if it's necessary to sort in descending order */
//            for (int j = i + 1; j < cars.length; j++ ) {
//                if(cars[i] < cars[j]) {
//                    int temp = cars[i];
//                    cars[i] = cars[j];
//                    cars[j] = temp;
//                }      
//            }
//            System.out.println(cars[i]);
//        }
    } 
}
