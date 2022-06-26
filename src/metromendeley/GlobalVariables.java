/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

/**
 *
 * @author leste
 */
public class GlobalVariables {
    private static HashTable1 table = new HashTable1(1000);
    private static List lista = new List(null);

    /**
     * @return the table
     */
    public static HashTable1 getTable() {
        return table;
    }

    /**
     * @param aTable the table to set
     */
    public static void setTable(HashTable1 aTable) {
        table = aTable;
    }

    /**
     * @return the lista
     */
    public static List getLista() {
        return lista;
    }

    /**
     * @param aLista the lista to set
     */
    public static void setLista(List aLista) {
        lista = aLista;
    }
    
}
