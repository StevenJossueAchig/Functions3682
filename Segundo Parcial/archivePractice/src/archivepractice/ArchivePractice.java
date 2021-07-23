/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivepractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class ArchivePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("Archive.txt"));
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("Archive.txt",true))
            ){
            bufferedWriter.write("\nHello my name is Steven");
            bufferedWriter.newLine();
            bufferedWriter.write("Godd bay");
            bufferedWriter.flush();
            
            String line;
            while((line =bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error E/S"+e);
        }
    }
    
}
