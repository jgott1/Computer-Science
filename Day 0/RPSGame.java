import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public NPC getOpponent() {
        return opponent;
    }

    public void setOpponent(NPC opponent) {
        this.opponent = opponent;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            String choice = scan.nextLine();
            int num = 0;
            while (validateChoice(choice) == false) {
                num += 1;
                if (num == 3) {
                    choice = generateRandomChoice();
                    System.out.println("Your choice has been made randomly.");
                } else {
                    choice = scan.nextLine();
                    num ++;
                }
            }
            setPlayerValues(name, choice);
            scan.close();

    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);

    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock") && opponent.getChoice().equals("paper")) {
            return false;
        }
        if (player.getChoice().equals("scissors") && opponent.getChoice().equals("rock")) {
            return false;
        }
        if (player.getChoice().equals("paper") && opponent.getChoice().equals("scissors")) {
            return false;
        }
        if (player.getChoice().equals(opponent.getChoice())) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (didPlayerWin() == true) {
            return (player.getName() + "won!\n Congratulations!");
        } else {
            return ("Opponent won!\nBetter luck next time!");
        }
    }

    public String displayResults() {
		String lineOne = "== GAME RESULTS ==\n";
		String lineTwo = player.getName() + "chose " + player.getChoice() + ".";
		String lineThree = "Opponent chose " + opponent.getChoice() + ".";
		String lineFour = toString();
		return (lineOne + lineTwo + lineThree + lineFour);
    }

    public static boolean validateChoice(String choice) {
        if (!choice.equals("rock") && !choice.equals("scissors") && !choice.equals("paper")) {
            return false;
        } else {
            return true;
        }
    }

    public static String generateRandomChoice() {
        int num = (int)(Math.random() * 3) + 1;
        if (num == 1) {
            return "rock";
        }
        if (num == 2) {
            return "paper";
        }
        if (num == 3) {
            return "scissors";
        }
        return "";
    }

    


}
