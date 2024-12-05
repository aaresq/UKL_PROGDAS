/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_sedang_no_1;

/**
 *
 * @author LENOVO
 */
public class UKL_SEDANG_NO_1 {

    public static void main(String[] args) {
       
        int TabunganAwal = 100000;
        int KenaikanPerBulan = 20000;
        int TotalTabungan = 0;

       
        for (int bulan = 1; bulan <= 24; bulan++) {
            
            int tabunganBulanIni = TabunganAwal + (bulan - 1) * KenaikanPerBulan; 
            
            System.out.println("Tabungan bulan ke-" + bulan + ": Rp" + tabunganBulanIni);
            TotalTabungan += tabunganBulanIni; 
        }

        System.out.println("Total tabungan selama 24 bulan: Rp." + TotalTabungan);
    }
}
