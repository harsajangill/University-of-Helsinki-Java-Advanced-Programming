import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> listAbbreviations;

    public Abbreviations(){
        this.listAbbreviations = new HashMap<>();
    }


    public static  String stringSanitazion(String word){
        if (word == null){
            word = "";
        }

        word = word.toLowerCase();
        return word.trim();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviation = stringSanitazion(abbreviation);
        this.listAbbreviations.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        abbreviation = stringSanitazion(abbreviation);

        if(this.listAbbreviations.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        abbreviation = stringSanitazion(abbreviation);
        if(this.listAbbreviations.containsKey(abbreviation)){
            return this.listAbbreviations.get(abbreviation);
        } 
        return null;
    }

}
