package assignments3;

class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int row, int column, int value) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            elements[row][column] = value;
        } else {
            System.out.println("Invalid position. Please provide valid row and column numbers.");
        }
    }

    public void add(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            System.out.println("Matrices cannot be added. They must have the same dimensions.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.elements[i][j] += other.elements[i][j];
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        System.out.println("Matrix 1:");
        matrix1.display();
        System.out.println("Matrix 2:");
        matrix2.display();

        System.out.println("Adding Matrix 1 and Matrix 2:");
        matrix1.add(matrix2);
        matrix1.display();
    }
}
