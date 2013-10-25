/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cata3.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
 public class MailReader {

    public String[] read(String string) throws FileNotFoundException{
        BufferedReader reader= new BufferedReader(new FileReader(new File(string)));
        ArrayList<String> domainList=new ArrayList<>();
        while(true){
            try {
                String line= reader.readLine();
                if(line==null){
                    break;
                }
                domainList.add(line.split("@")[1].toLowerCase());
                
            } catch (IOException ex) {
                break;
            }
        }
        return domainList.toArray(new String [domainList.size()]);
    }
       
}
