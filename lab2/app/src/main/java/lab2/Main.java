package lab2;

public class Main {
    public static void main(String args[])
    {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();

        matrix1.MatrixInit(3,2);
        matrix1.setColumn(0, 1,2,3);
        matrix1.setColumn(1, 1,2,3);

        matrix2.MatrixInit(matrix1);

        Matrix column = matrix2.getRow(1);

        String matrix = column.getString();

        System.out.println(matrix);
        if(matrix2.equals(matrix1))
        {
            System.out.println("matrix");
        }

        if(matrix1.hashCode() == matrix2.hashCode())
        {
            System.out.println("matrix");
        }

     
    }

}
