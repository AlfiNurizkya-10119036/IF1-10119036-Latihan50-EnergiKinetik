/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan50.energikinetik;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Mnghitung Energi Kinetik
 */
public class Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnergiKinetik energiKinetik = new EnergiKinetik(145, 25);
        System.out.println("Massa : " + energiKinetik.getMassa() + " g");
        System.out.println("Kecepatan : "+energiKinetik.getVolume() + " m/s");
        System.out.printf("Energi Kinetik : %.2f joule%n", energiKinetik.hitung());
        System.out.printf("Karena energi kinetik awalnya 0 maka usaha nya  %.2f joule%n", energiKinetik.hitung());
    }
}
