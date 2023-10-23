package baseball.controller;

import baseball.model.BaseballGameCounts;
import baseball.model.BaseballGameCountsMessage;
import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.view.GameView;

public class BaseballGame {
    private final ComputerNumber computer;

    protected BaseballGame() {
        this.computer = new ComputerNumber();
    }

    public static BaseballGame createBaseballGame() {
        return new BaseballGame();
    }

    public void run() {

        GameView.printGameStartMessage();

        while (true) {
            UserNumber user = new UserNumber(GameView.getUserInput());

            BaseballGameCounts baseballGameCounts = new BaseballGameCounts(computer, user);

            GameView.printBaseballGameCountsMessage(new BaseballGameCountsMessage(baseballGameCounts));

            if (baseballGameCounts.isWinCondition()) {
                GameView.printGameWinMessage();
                return;
            }

            baseballGameCounts.resetCounts();

            user.resetUserNumber();
        }
    }
}