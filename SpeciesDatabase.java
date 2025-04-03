import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpeciesDatabase {
    Map<String, Species> all_species;

    public SpeciesDatabase() {
        all_species = new HashMap<String, Species>();
    }

    public Species checkID(String name){
        return all_species.computeIfAbsent(name, Species::new);
        }
    }

