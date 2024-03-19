/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zainu
 */
public class kodedarimodul {
    public static void main(String[] args) {
        int data[][]={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        int total=0;
        int count=0;
        
        for (int a=0;a<data.length;a++){
            for (int b=0;b<data[0].length;b++){
                
                System.out.print(data[a][b]+" ");
            }
            System.out.print("\n");
            total+=data[a][0];
             count++;
        }
       double average=(double)total/count;
        System.out.println("rata rata adalah:"+average);
    
}
}