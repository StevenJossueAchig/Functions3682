/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class Archive {
    public void writeBook(Book news){
        try{
            File file = new File("register.txt");
            FileWriter fileWriter;
            BufferedWriter bufferedWriter;
            
            if(file.exists()){
                fileWriter=new FileWriter(file);
                bufferedWriter=new BufferedWriter(fileWriter);
                bufferedWriter.newLine();
                bufferedWriter.write(news.title+"%"+news.editorial+"%"
                                    +news.autor);
            }else{
                fileWriter=new FileWriter(file);
                bufferedWriter=new BufferedWriter(fileWriter);
                bufferedWriter.write(news.title+"%"+news.editorial+"%"
                                    +news.autor);
            }
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (Exception except){
        }  
    }
}
