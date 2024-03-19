/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zainu
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
public class JOptionpane {
    public static void main(String[] args) {
        int data[][]={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        String input=JOptionPane.showInputDialog("masukkan index elemen yang di cari");
        int element=Integer.parseInt(input);
        String newInput=JOptionPane.showInputDialog("masukkan angka baru");
        int newValue=Integer.parseInt(newInput);
        boolean found =false;
        for (int a=0;a<data.length;a++){
            for (int b=0;b<data[0].length;b++){
                if (data[a][b]==element) {data[a][b]=newValue;
                found=true;
                break;
                }
            }
            if (found){
                break;
            }
            }
            if (found){
            JOptionPane.showMessageDialog(null,"Nilai elemen"+element +"telah di ganti dengan "+newValue+"\nhasil array setelah penggantian:\n"+Arrays.deepToString(data));
            
            
        }else {
            JOptionPane.showMessageDialog(null ,"elemen"+element+"tidak di temukan dalam array");
        }
    }
    
}
