/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        printTableMapping();
        char[][] gameTable = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        if (new Random().nextBoolean()) {
            makeComputerMove(gameTable);
            printGameTable(gameTable);
        }
        while (true) {
            makeUserMove(gameTable);
            printGameTable(gameTable);
            if (isUserWin(gameTable)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            makeComputerMove(gameTable);
            printGameTable(gameTable);
            if (isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }

}
