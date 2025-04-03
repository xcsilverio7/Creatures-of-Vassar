import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class UI {
    Controller controller;

    public UI(){
        controller = new Controller();
    }

    public void onStart() {
        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            System.out.println("What would you like to do?:");

            String action = scanner.nextLine();

            switch (action) {
                case "add pin":

                    float lat = 0;
                    float lon = 0;
                    while (true) {
                        System.out.println("Enter Latitude");
                        lat = scanner.nextFloat();
                        if (lat > 41.656 && lat < 41.693) {
                            break;
                        } else {
                            System.out.println("Latitude not in vassar, try again");
                        }
                    }

                    while (true) {
                        System.out.println("Enter Longitude");
                        lon = scanner.nextFloat();
                        if (lon > -73.908 && lon < -73.880) {
                            break;
                        } else {
                            System.out.println("Latitude not in vassar, try again");
                        }
                    }

                    System.out.println("Enter name");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    LocalDateTime time_stamp = LocalDateTime.now();
                    float[] coords = {lat, lon};
                    addPin(coords, time_stamp, name);

                    break;
                case "display map":
                    if (controller.all_pins.isEmpty()){
                        System.out.println("No pins on map to display");
                        break;
                    }
                    displayMap();
                    System.out.println("Would you like to like/unlike a pin, add ID, or go back?");
                    String answer = scanner.nextLine();
                    if (answer.equals("like pin")) {
                        likePin(scanner);
                    } else if (answer.equals("add ID")) {
                        addID(scanner);
                    }
                    break;
                case "quit":
                    break label;
                case null:
                default:
                    System.out.println("Invalid action");
                    break;
            }
        }
    }

    public void addPin(float[] coords, LocalDateTime time, String author){
        controller.createPin(coords, time, author);
    }

    public void displayMap(){
        for (int i = 0; i < controller.all_pins.size(); i++) {
            System.out.println(controller.all_pins.get(i).toString());
            System.out.println("\n");
        }
    }

    public void likePin(Scanner scanner){
        int answer = 0;
        while (true) {
            System.out.println("Select pin to like: 1 - " + controller.all_pins.size());
            answer = scanner.nextInt() - 1;
            if (answer < 0 || answer > (controller.all_pins.size())) {
                System.out.println("Invalid pin, try again");
            }else{
                break;
            }
        }
        boolean result = controller.likePin(answer);
        if (result){
            System.out.println("Pin successfully liked");
        } else{
            System.out.println("Pin successfully unliked");
        }
        scanner.nextLine();
    }

    public void addID(Scanner scanner){
        int answer = 0;
        while (true) {
            System.out.println("Select pin to ID: 1 - " + controller.all_pins.size());
            answer = scanner.nextInt() - 1;
            if (answer < 0 || answer > (controller.all_pins.size())) {
                System.out.println("Invalid pin, try again");
            }else{
                break;
            }
        }
        scanner.nextLine();
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();
        boolean result = controller.addID(answer, id);
        if(result){
            System.out.println("ID successfully added");
        }else{
            System.out.println("Pin already has ID");
        }
    }
}