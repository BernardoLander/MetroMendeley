package metromendeley;


import java.util.Arrays;
import java.util.Objects;


public class HashTable {
    private infoObject[] table;
    private int tableSize;
    private int itemsInTable;

    public HashTable(int tableSize) {
        this.tableSize = tableSize;
        table  = new infoObject[tableSize];
        Arrays.fill(table, null);
        
        
    }

    public infoObject[] getTable() {
        return table;
    }

    public void setTable(infoObject[] table) {
        this.table = table;
    }

    public int getTableSize() {
        return tableSize;
    }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
    }

    public int getItemsInTable() {
        return itemsInTable;
    }

    public void setItemsInTable(int itemsInTable) {
        this.itemsInTable = itemsInTable;
    }
    
    public void InsertItemMain(infoObject item, HashTable table){

        if (table.getItemsInTable() > table.getTableSize() / 2){
            
            table.doublesize();
            
        }else{
            table.insertInIndex(item);
        }
    }

    private void insertInIndex(infoObject item) {
        item.setId();
        int index = item.getId() % this.getTableSize();
        
        while (true){
            if(this.getTable()[index] == null){
                
                this.getTable()[index] = item;
                this.setItemsInTable(this.getItemsInTable() + 1);
                break;
                
            }else{
                index++;
            }
        }
    }

    private void doublesize() {

        int newSize = this.newSizePrimeCheck(this.getTableSize() * 2);
        HashTable newTable = new HashTable(newSize);
        Arrays.fill(newTable.getTable(), null);
        for (infoObject table1 : this.getTable()) {
            if (table1 != null) {
                newTable.insertInIndex(table1);
            }
        }
        
        this.setTable(newTable.getTable());
        this.setTableSize(newTable.getTableSize());
        
        

    }

    private int newSizePrimeCheck(int initial) {
        
        if (initial%2 == 0){
            initial++;
            return newSizePrimeCheck(initial);
        }else{
            int old  = this.getTableSize();
            int i = 3;
            while (i < old){
                if (initial%i == 0){
                    initial += 2;
                    return newSizePrimeCheck(initial);
                }
                i += 2;
            }
            return initial;
        }
    }
    
    public infoObject searchInTable (String title){
        
        int hash = 5;
        
        hash = 37 * hash + Objects.hashCode(title);
        if (hash < 0){
            hash = hash *-1;
        }
        
        int index = hash % this.getTableSize();
        
        while(true){
            if (this.getTable()[index].getTitle().equals(title)){
                break;
            }
            index++;
        }
        return this.getTable()[index];
    }
}
