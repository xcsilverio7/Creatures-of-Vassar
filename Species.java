public class Species {
    String name;
    Integer number_logged;

    public Species(String name) {
        this.name = name;
        this.number_logged = 0;
    }

    public void log (){
        number_logged++;
    }

    @Override
    public String toString() {
        return name + " (logged " + number_logged + " times)";
    }
}
