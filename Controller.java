import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Pin> all_pins;
    List<Pin> liked_pins;
    SpeciesDatabase speciesDatabase;

    public Controller() {
        all_pins = new ArrayList<>();
        liked_pins = new ArrayList<>();
        speciesDatabase = new SpeciesDatabase();
    }

        public void createPin (float[] coords, LocalDateTime time, String author){
            Pin new_pin = new Pin(coords, time, author);
            all_pins.add(new_pin);
        }

        public boolean likePin(int answer){
            Pin pin = all_pins.get(answer);
            if (liked_pins.contains(pin)){
                liked_pins.remove(pin);
                pin.unlike();
                return false;
            }else{
                liked_pins.add(pin);
                pin.like();
                return true;
            }
        }

        public boolean addID(int answer, String id){
            Pin pin = all_pins.get(answer);
            Species species = speciesDatabase.checkID(id);
            return pin.addId(species);
        }


    }