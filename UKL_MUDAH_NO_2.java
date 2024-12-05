/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_mudah_no_2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class UKL_MUDAH_NO_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = scanner.nextInt();
 
        if (apakahPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }

        scanner.close();
    }

    public static boolean apakahPrima(int angka) {

        if (angka <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }

        return true;
    }
}
