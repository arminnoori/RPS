import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RPS {



   static List<String> inputs = List.of("sang", "kaghaz", "ghaichi");

    public static void main(String[] args) {

        String player1, player2;

        player1 = checkInputs("1");

        player2 = checkInputs("2");

        if (player1.equals(player2)) {
            System.out.println("mosaavi");
            return;
        }

        switch (player1) {
            case "sang" -> {
                if (player2.equals("ghaichi")) {
                    System.out.println("bazikone 1 barande ");
                    return;
                }
                System.out.println("bazikone 2 barande ");
            }
            case "kaghaz" -> {
                if (player2.equals("ssang") ) {
                    System.out.println("bazikone 1 barande ");
                    return;
                }
                System.out.println("bazikone 2 barande ");
            }
            case "ghaichi" -> {
                if (player2.equals("kaghaz") ) {
                    System.out.println("bazikone 1 barande ");
                    return;
                }
                System.out.println("bazikone 2 barande ");
            }
            default -> System.out.println("vorodi eshtebah ast");
        }
    }

    private static String checkInputs(String playerNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("baazikone " + playerNum + " ,entekhab kon  (sang,kaghaz, or ghaichi):");
        String value = scanner.nextLine().toLowerCase();
        if (inputs.contains(value))
            return value;

        System.out.println("vorodi nadorost ast");
        return checkInputs(playerNum);
    }
}