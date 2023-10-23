package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    private final List<Integer> computerNumber = new ArrayList<>();

    public ComputerNumber() {
        while (computerNumber.size() < 3) {
            generateRandomNumber(computerNumber);
        }
    }

    private void generateRandomNumber(List<Integer> computerNumber) {
        int randomNumber = Randoms.pickNumberInRange(1, 9);
        if (!computerNumber.contains(randomNumber)) {
            computerNumber.add(randomNumber);
        }
    }

    public List<Integer> getComputerNumber() {
        return this.computerNumber;
    }
}
