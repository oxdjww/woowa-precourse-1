package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    private final List<Integer> computerNumber = new ArrayList<>();

    public ComputerNumber() {
        while (computerNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumber.contains(randomNumber)) {
                computerNumber.add(randomNumber);
            }
        }
    }

    public List<Integer> getComputerNumber() {
        return this.computerNumber;
    }

    private void validateComputerNumber(Integer digit) {
        if (!this.computerNumber.contains(digit)) {
            this.computerNumber.add(digit);
        }
    }
}
