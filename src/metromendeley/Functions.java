/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author leste
 */
public class Functions {
    
    public String readText() {
        String line;
        String Text = "";
        String path = "test\\resumen1.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        Text += line + "\n";
                    }
                }
                br.close();
                return Text;
            }
        } catch (Exception ex){
            return "";
        } 
        return Text;
    }
    
    //createobjects
    
}
