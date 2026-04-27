import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> bogieIDs = new ArrayList<>();
        String searchKey = "BG101";

        try {

            if (bogieIDs.isEmpty()) {
                throw new IllegalStateException("Cannot perform search: Train has no bogies.");
            }

            boolean found = false;

            for (String id : bogieIDs) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie ID " + searchKey + " found.");
            } else {
                System.out.println("Bogie ID " + searchKey + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}