/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_sulit_n0_2;

import java.util.ArrayList;



/**
 *
 * @author LENOVO
 */
public class UKL_SULIT_N0_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] bil = {1, 2, -3, 4, -6, -4};
        ArrayList<Integer> negativeElements = new ArrayList<>();

        for (int i = 0; i < bil.length; i++) {
            if (bil[i] > 0) {
                negativeElements.add(bil[i]);
            }
        }
        if (negativeElements.isEmpty()) {
            System.out.println("Array tidak mengandung elemen positif.");
        } else {
            System.out.print("Array mengandung elemen positif: ");

        }

        for (int n = 0; n < negativeElements.size(); n++) {
            System.out.print(negativeElements.get(n));
            if (n < negativeElements.size() - 1) {
                System.out.print(", ");
            }

        }
        System.out.println(" ");
    }
}