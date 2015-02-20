/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskra;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

/**
 *
 * @author Milos
 */
public class Iskra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        org.jsoup.nodes.Document doc = Jsoup.connect("http://misterjung.com/").get();
        String text = doc.body().text();
        int startScan = text.indexOf("Homework");
        int endScan = text.lastIndexOf("Post navigation");
        System.out.println(startScan + " " + endScan);
        String hw = text.substring(startScan, endScan);
        System.out.println(hw); 
        
//        String title = doc.title();
//        System.out.println(title);
    }
    
    public String englishGet(){
        org.jsoup.nodes.Document doc = null;
        try {
            doc = Jsoup.connect("http://misterjung.com/").get();
        } catch (IOException ex) {
            Logger.getLogger(Iskra.class.getName()).log(Level.SEVERE, null, ex);
        }
        String text = doc.body().text();
        int startScan = text.indexOf("Homework");
        int endScan = text.lastIndexOf("Post navigation");
        System.out.println(startScan + " " + endScan);
        String hw = text.substring(startScan, endScan);
        return hw;
    }
    
}
