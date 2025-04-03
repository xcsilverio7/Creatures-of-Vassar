import java.util.Arrays;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
public class Pin {
    float[] coords;
    LocalDateTime time;
    int likes;
    String author;
    Species id;


    public Pin(float[] c, LocalDateTime t, String a) {
        coords = c;
        time = t;
        author = a;
        likes = 0;
        id = null;
    }

    @Override
    public String toString() {
        if(id == null){
            return "\nCoords: " + Arrays.toString(coords) + "\nTime: " + time + "\nAuthor: " + author + "\nLikes: " + likes + "\nID: none";
        }
        return "\nCoords: " + Arrays.toString(coords) + "\nTime: " + time + "\nAuthor: " + author + "\nLikes: " + likes + "\nID: " + id.toString();
    }

    public void like(){
        likes++;
    }

    public void unlike(){
        likes--;
    }

    public boolean addId(Species species){
        if(id == null){
            id = species;
            species.log();
            return true;
        }
        return false;
    }
}