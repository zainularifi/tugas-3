/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg1.pkg2023.pkg57201.pkg017;

/**
 *
 * @author zainu
 */

public class Modul1202357201017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[][]={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        int total=0;
        int count=0;
        int sum=0;
        for (int a=0;a<data.length;a++){
            for (int b=0;b<data[0].length;b++){
             if(b%2!=0){
                    sum+=data[a][b];   
                System.out.print(data[a][b]+" ");
            }
            System.out.print("\n");
            total+=data[a][0];
             count++;
        }
       double average=(double)total/count;
        System.out.println("rata rata adalah:"+average);
        
        
        }
        System.out.println("jumlah elemen pada indeks kolom ganjil:"+sum);
    }
          
} 
