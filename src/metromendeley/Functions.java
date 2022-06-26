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
        String path = GlobalVariables.getPath();
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
    
    public infoObject createObjects(String Text){  
        
        //Crea los objetos que compone el resumen entero 
        
        infoObject info = new infoObject();
        String title = "";
        String autor = "";
        String summary = "";
        String keyword = "";
        int aux = 0;
        if (!"".equals(Text)){   
            String[] textLineSplit = Text.split("\n");           
            for (int i = 0; i < textLineSplit.length; i++) {
                if (textLineSplit[i].equals("Autores")) {
                    break;
                }   
                aux += 1;
                title += " "+textLineSplit[i];  // se crea el titulo
            }
            title = title.replace("\n", " ").trim();
            
            for (int i = aux + 1; i < textLineSplit.length; i++) { 
                if (textLineSplit[i].equals("Resumen")) {
                    break;
                }  
                aux += 1;
                autor += textLineSplit[i] + ",";   // se crean los autores string                      
               } 
 
            for (int i = aux + 1 ; i < textLineSplit.length; i++) { // pendiente con el +1 del aux
                if (textLineSplit[i].contains("Palabras claves:") || textLineSplit[i].contains("Palabras Claves:")) {
                    break;
                }  
                aux += 1;
                summary += " "+textLineSplit[i];     //  se crea el resumen               
               }
            summary = summary.replace("Resumen", "").trim();
            
            
            for (int i = aux + 1; i < textLineSplit.length; i++){ 
                keyword += textLineSplit[i];
                }
            }
            if (keyword.contains("Palabras claves:") || keyword.contains("Palabras Claves:")) {
                    keyword = keyword.replace("Palabras claves: ", "").replace("y", ",").replace(".", "").replace(", ", ",");
                    keyword = keyword.replace("Palabras Claves: ", "").replace("y", ",").replace(".", "").replace(", ", ",");
                }  
            String[] keywords = keyword.split(","); // se crean palabras claves string[]
           
               
        String[] autores = autor.split(",");
        
        info.setTitle(title);
        info.setAutores(autores);
        info.setSummary(summary);
        info.setKeywords(keywords);
        
        return info;
    }
       
}
