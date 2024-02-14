package codewars;

public interface RockPaperScissors {
    static String rps(String p1, String p2) {
        switch (p1) {
            case "scissors":
                return p2.equals("paper") ? "Player 1 won!" : p2.equals("scissors") ? "Draw!" : "Player 2 won!";
            case "paper":
                return p2.equals("rock") ? "Player 1 won!" : p2.equals("paper") ? "Draw!" : "Player 2 won!";
            case "rock":
                return p2.equals("scissors") ? "Player 1 won!" : p2.equals("rock") ? "Draw!" : "Player 2 won!";
            default:
                return "";
        }
    }
}
//"scissors", "paper" --> "Player 1 won!"
//"scissors", "rock" --> "Player 2 won!"
//"paper", "paper" --> "Draw!"