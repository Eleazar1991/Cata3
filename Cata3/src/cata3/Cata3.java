/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cata3;

import cata3.control.HistogramControl;
import cata3.persistence.MailReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Cata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer [] array={1,2,3,1};
        HistogramControl<Integer> control= new HistogramControl<>();
        control.execute(array);
        

        HistogramControl<String> mailcontrol= new HistogramControl<>();
        mailcontrol.execute(getMails("C:\\Users\\usuario\\Documents\\NetBeansProjects\\Cata3\\Cata3\\mails.txt"));
    }

    private static String[] getMails(String filename) {
        MailReader reader=new MailReader();
        try {
           return reader.read(filename);
        } catch (FileNotFoundException ex) {
            return new String[0];
        }
            }
    
}
