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
        boolean isFinish = false;
        while (!isFinish) {
            for (int i = 0; i < cars.length; i++) {
                int randomDistance = (int) (Math.random() * 10 + 1);
                cars[i] += randomDistance;
                if (cars[i] > 100) {
                    isFinish = true;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            // if it's necessary to sort in descending order
//            for (int j = i + 1; j < cars.length; j++ ) {
//                if(cars[i] < cars[j]) {
//                    int temp = cars[i];
//                    cars[i] = cars[j];
//                    cars[j] = temp;
//                }
//                    
//            }
            System.out.println(cars[i]);
        }
    }
    
}
