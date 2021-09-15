package Work6.validator;

public class DataValidator {

    public boolean isChoiceCorrect(int choice, int leftBorder, int rightBorder) {
        return choice > leftBorder - 1 && choice < rightBorder + 1;
    }

}
