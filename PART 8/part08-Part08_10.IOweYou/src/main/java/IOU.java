import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> db;

    public IOU(){
        this.db = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        this.db.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        return this.db.getOrDefault(toWhom, 0.0);
    }

    
}
