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
        String path = "test\\resumen2.txt";
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
        infoObject info = new infoObject();
        String title = null;
        String[] autores = null;
        String summary = null;
        String[] keywords = null;
        int aux = 0;
        if (!"".equals(Text)){
            
            String[] textLineSplit = Text.split("\n");
            for (int i = 0; i < textLineSplit.length; i++) {
                while(!textLineSplit[i].equals("autores")){
                    title += textLineSplit[i];
                    aux = i;
                }
            }
            for (int i = aux; i < textLineSplit.length; i++) {
                while(!textLineSplit[i].equals("Resumen")){
                    for (int j = 0; j < 10; j++) {
                         autores[j] = textLineSplit[i];
                         aux = i;
                    }
                }
            }
            for (int i = aux; i < textLineSplit.length; i++) {
                while(!textLineSplit[i].contains("Palabras claves:")){
                    summary += textLineSplit;
                    aux = i;
                }
            }
            for (int i = aux; i < 10; i++) {
                if (textLineSplit[i].contains("Palabras claves:")) {
                    for (int j = 0; j < 10; j++) {
                        keywords = textLineSplit[i].split(",");
                    }
                }
            }                   
        }
        info.setTitle(title);
        info.setAutores(autores);
        info.setSummary(summary);
        info.setKeywords(keywords);
        
        return info;
    }
       
}
