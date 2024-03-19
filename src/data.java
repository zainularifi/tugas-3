/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zainu
 */
public class data {
    public static void main(String[] args) {
        String data[][]={
            {"ABDUL","kediri","085646668991"},
            {"KUSNO","trenggalek","085646668992"},
            {"PONIRAN","Bojonegoro","085646668999"}};
        System.out.println("nama\talamat\t\ttelepon");
        for (int a=0;a<data.length;a++){
            for (int b=0;b<data[a].length;b++){
                 System.out.print(data[a][b]+"\t");
                 if(b==1)
                     System.out.print("\t");
            }
            System.out.println();
        }
    }
    

    }