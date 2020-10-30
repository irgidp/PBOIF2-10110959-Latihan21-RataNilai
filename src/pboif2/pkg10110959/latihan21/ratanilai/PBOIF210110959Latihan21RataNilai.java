/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan nilai rata-rata
 */
package pboif2.pkg10110959.latihan21.ratanilai;

import java.util.Scanner;

public class PBOIF210110959Latihan21RataNilai {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
            int i, n;
            float jum, x, rata;
            System.out.print ("Masukkan banyaknya Mahasiswa: ");
            n = input.nextInt();
            jum=0;
            i=1;
            while (i<=n){
                    System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                    x=input.nextFloat ();
                    jum += x;
                    i++;
            }
            rata = jum / n;
            System.out.println ("Rata-rata: "+rata);
            
        }
            
    }
