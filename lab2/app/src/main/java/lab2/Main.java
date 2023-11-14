package lab2;

public class Main {
    public static void main(String args[])
    {
        Matrix matrix = new Matrix(3,3);


        matrix.setColumn(0, 1,2,3);
        matrix.setColumn(1, 1,2,3);
        matrix.setColumn(2, 1,2,3);
        System.out.println(matrix.getString());
        matrix.set(0, 0, -100);
        System.out.println(matrix.getString());
        System.out.println("----------------------------------");


        ImmutableMatrix im = new ImmutableMatrix(matrix);
        System.out.println(im.getString());
        System.out.println("----------------------------------");
        System.out.println(im.getString());
        System.out.println("----------------------------------");
        Matrix m3 = im.add(matrix);
        System.out.println(m3.getString());
        System.out.println("----------------------------------");







     
    }

}
