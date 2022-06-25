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
    
}
