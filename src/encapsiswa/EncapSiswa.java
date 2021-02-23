/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsiswa;

/**
 *
 * @author MOKLET-2
 */
public class EncapSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TestSiswa siswa = new TestSiswa ();
      siswa.setName ("Julian");
      siswa.setAddress ("Malang");
      siswa.setAge (23);
      
      
        System.out.print("Name : " + siswa.getName());
        System.out.println(" ");
        System.out.print("Address : " +siswa.getAddress());
        System.out.println(" ");
        System.out.print("Absen : " + siswa.getAbsen());
    }

    
    }
   

