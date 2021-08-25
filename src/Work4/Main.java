package Work4;

public class Main {
    public static void main(String[] args) {
        MatrixCalculator matrixCalculator = new MatrixCalculator();
        matrixCalculator.fillMatrix();
        matrixCalculator.printMatrix();
        matrixCalculator.printResult();
        var matrixTrans = new MatrixTransponder();
        matrixTrans.transMatrix(matrixCalculator.getMatrix());
        matrixCalculator.printMatrix();
    }
}
