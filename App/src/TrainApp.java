public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIDs[mid].compareTo(searchKey);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found using Binary Search.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }

        System.out.println("Program continues...");
    }
}