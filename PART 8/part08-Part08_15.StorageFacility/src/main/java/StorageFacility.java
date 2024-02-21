import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String> > storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        //create new list for new unit
        this.storage.putIfAbsent(unit,new ArrayList<>());
        //retrieve list and add item
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item){
        this.storage.get(storageUnit).remove(item);
        if(this.storage.get(storageUnit).isEmpty()){
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> storages = new ArrayList<>();
        for(String storageName : this.storage.keySet()) {
            if(!this.storage.get(storageName).isEmpty()){
                storages.add(storageName);
            }
        }
        return storages;
    }

}
