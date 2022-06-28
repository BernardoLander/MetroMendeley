/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metromendeley;

import javax.swing.JOptionPane;


/**
 *
 * @author dario
 */

public class HashTable2 {
    KeyWordObject tabla[];  //array de nodos
    int size; //número primo (se tomó 10111)
    
    public HashTable2(int size){
        this.size = size; 
        this.tabla = new KeyWordObject[size]; 
        for (int i = 0; i < size; i++) {
            this.tabla[i] = null; 
        }
    }
    
    /**
     * 
     * @param title [String]: va a hacer las funciones
     *          de clave del objeto guardado en la tabla. 
     * 
     * @return index [int]: índice del objeto en el arreglo de nodos
     *          para la HashTable; es la posición del elemento en
     *          ese array. 
     */
    public int hashingkeyword(String keyword){
        
        int valor = 0;  
        //valor de la clave (nombre del animal) en 
        //código ASCII a ser modificado.
        
        int posicion = 1; 
        
        for (int i = 0; i < keyword.length(); i++) {
            
            
            if (keyword.codePointAt(i) == 32){
                valor += 0; 
                //En este caso no se suma nada, porque el código 
                //ASCII 32 hace referencia a un espacio (" "). 
                
            } else if (keyword.codePointAt(i) >= 48 && keyword.codePointAt(i) <= 57){
                valor += ((keyword.codePointAt(i) - 47) * posicion);
                
            } else if (keyword.codePointAt(i) >= 65 && keyword.codePointAt(i)<= 90){
                valor += ((keyword.codePointAt(i) - 54) * posicion);
                
            } else if (keyword.codePointAt(i) >= 97 && keyword.codePointAt(i) <= 122){
                valor += ((keyword.codePointAt(i) - 60) * posicion);
                
            }
            posicion++; 
        }
        
        
        int index = valor % size;
        /**
         * Index se refiere al índice del array del elemento.
         * De esta manera adaptamos el valor del nombre del animal 
         * según código ASCII al tamaño de la tabla. 
         */
        return index; 
    }
    
    public void insertar(KeyWordObject keytitlepair){
        int posicion = hashingkeyword(keytitlepair.getTitle());  
        
        while(posicion < this.tabla.length){
            if (this.tabla[posicion] == null){
                this.tabla[posicion] = keytitlepair;  
                System.out.println("    Añadimos: " + keytitlepair);
                System.out.println("        En posición: " + posicion);
                break;
            }else{
                posicion++;
            }
        }
        posicion = 0;
        
        while(posicion < this.tabla.length){
            if (this.tabla[posicion] == null){
                this.tabla[posicion] = keytitlepair;  
                System.out.println("    Añadimos: " + keytitlepair);
                System.out.println("        En posición: " + posicion);
                break;
            }else{
                posicion++;
            }
        }
}
    
    public KeyWordObject buscarKeyWord(String key){
        int index = hashingkeyword(key);
        while (index < this.tabla.length){
            
            if (this.tabla[index].getKeyword().equals(key)){
                
                System.out.println("Conseguido" + key);
                System.out.println("Indice" + index);
                return this.tabla[index];   
            }
            index ++;
        }
        return null;
    }
    public ListKeywordOBJ buscarAutor(String key){
        int index = hashingkeyword(key);
        ListKeywordOBJ autorRepetido = new ListKeywordOBJ();
        
        while (index < this.tabla.length){
            
            if (this.tabla[index].getKeyword().equals(key)){
                
                while(this.tabla[index].getKeyword().equals(key)){
                    System.out.println("Conseguido" + key);
                    System.out.println("Indice" + index);
                    NodeKeywordOBJ element = new NodeKeywordOBJ(this.tabla[index]);
                    autorRepetido.insertEnd(element);
                    index++;
                }
                return autorRepetido;
            }
            index ++;
        }
        return null;
    }
}