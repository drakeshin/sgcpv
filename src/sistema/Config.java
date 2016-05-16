/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Drake Shin
 */
public class Config {
    private static FileInputStream stream;
    
    public static void loadSell() throws FileNotFoundException, IOException{
        
        Properties prop = new Properties();
        
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File folder = new File(path+"SGVPC - System");
        if(!folder.exists()){
            try{
                folder.mkdirs();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        File file1 = new File(folder+"sellControl.data");
        
        
        if(!file1.exists()){
            try{
                PrintWriter writer = new PrintWriter(file1);
                
                writer.print("");
                
                writer.close();
                
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        stream = new FileInputStream(file1);
        prop.load(stream);
        
    }
    
    public static void loadClient() throws FileNotFoundException, IOException{
        
        
        Properties prop2 = new Properties();
        
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File folder = new File(path+"SGVPC - System");
        if(!folder.exists()){
            try{
                folder.mkdirs();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        
        File file2 = new File(folder+"clientControl.data");
        
        
        if( !file2.exists()){
            try{
                
                PrintWriter writer2 = new PrintWriter(file2);
                
                
                writer2.print("");
               
               
                writer2.close();
                
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        stream = new FileInputStream(file2);
        prop2.load(stream);
    }
    
    public static void loadProduct() throws FileNotFoundException, IOException{
        
        
        Properties prop3 = new Properties();
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File folder = new File(path+"SGVPC - System");
        if(!folder.exists()){
            try{
                folder.mkdirs();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        
        File file3 = new File(folder+"productControl.data");
        
        if(file3.exists()){
            try{
                
                PrintWriter writer3 = new PrintWriter(file3);
                
                writer3.print("");
                
                writer3.close();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        stream = new FileInputStream(file3);
        prop3.load(stream);
    }
}
