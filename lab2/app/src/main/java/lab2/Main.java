package lab2;

public class Main {
    public static void main(String args[])
    {
        Matrix matrix1 = new Matrix();
        Matrix m2 = new Matrix();

        matrix1.MatrixInit(2,2);
        matrix1.setColumn(0, 3,4);
        matrix1.setColumn(1, 5,7);

    
       

        Matrix m = matrix1.inverse();


    

        System.out.println(m.getString());
     
    }

}
