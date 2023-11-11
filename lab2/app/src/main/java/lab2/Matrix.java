/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab2;


public class Matrix {
    private  double[][] values;
    private Config config = new Config();

    // Matrix initialization
    public void MatrixInit()
    {
        config.setConfig(0,0);
    }

    public void MatrixInit(int rows, int columns)
    {
        if (rows < 0 || columns < 0)
        {
            throw new NumberFormatException("Invalid columns or rows input, must be at least 0");
        }
        values = new double[rows][columns];
        config.setConfig(rows, columns);
    }

    public void MatrixInit(Matrix matrix)
    {
        
        config.setConfig(matrix.config.Rows, matrix.config.Columns);
        values = new double[config.Rows][config.Columns];
        for (int indexOfRow = 0; indexOfRow < getNumberOfRows(); indexOfRow++) 
        {
            System.arraycopy(matrix.values[indexOfRow], 0, values[indexOfRow], 0, getNumberOfColumns());
        }
    }

    public static Matrix createDiagonalMatrix(double... diagonal)
    {
        return null;
    }

    public static Matrix createIdentityMatrix(int rows, int columns)
    {
        return null;
    }
    //Funcions that helps us get something
    public Config getMatrixConfiguration()
    {
        return config;
    }

    public int getNumberOfRows()
    {
        return config.Rows;
    }

    public int getNumberOfColumns()
    {
        return config.Columns;
    }

    public double get(int indexOfRow, int indexOfColumn)
    {
        Compability(indexOfRow, indexOfColumn);     
        return values[indexOfRow][indexOfColumn];
    }

    public Matrix getRow(int indexOfRow)
    {
        Compability(indexOfRow, 0);
        Matrix row = new Matrix();
        row.MatrixInit(1, config.Columns);
        System.arraycopy(values[indexOfRow], 0, row.values[0], 0, config.Columns);
        return row;
    }

    public Matrix getColumn(int indexOfColumn)
    {
        Compability(0, indexOfColumn);
        Matrix column = new Matrix();
        column.MatrixInit(config.Rows, 1);
        for (int indexOfRow = 0; indexOfRow < getNumberOfRows(); indexOfRow++) 
        {
            column.values[indexOfRow][0] = values[indexOfRow][indexOfColumn];
        }
        return column;
    }
    //Seting functions
    public void set(int indexOfRow, int indexOfColumn, double value)
    {
        Compability(indexOfRow, indexOfColumn);
        values[indexOfRow][indexOfColumn] = value;
    }

    public void setRow(int indexOfRow,  double... row)
    {
        Compability(indexOfRow, 0);
        if (getNumberOfColumns() != row.length) 
        {
            throw new NumberFormatException("Wrong Input");
        }
        System.arraycopy(row, 0, values[indexOfRow], 0, getNumberOfColumns());
    }

    public void setColumn(int indexOfColumn, double... column)
    {
        Compability(0, indexOfColumn);
        if (getNumberOfRows() != column.length) 
        {
            throw new NumberFormatException("Wrong Input");
        }
        for (int indexOfRow = 0; indexOfRow < getNumberOfRows(); indexOfRow++) {
            values[indexOfRow][indexOfColumn] = column[indexOfRow];
        }
    }
    //Equals and hasCode
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
    //Functions that do some math`s action
    public Matrix add(Matrix matrix)
    {
        return null;
    }

    public Matrix multiply(double scalar) 
    {
        return null;
    }

    public Matrix multiply(Matrix matrix) 
    {
        return null;
    }

    public Matrix transposeMatrix()
    {
        return null;
    }

    public Matrix inverse()
    {
        return null;
    }

    //Matrix visualization

    public void getString()
    {
        for(int i = 0; i <getNumberOfRows(); i ++)
        {
            for(int j = 0; j <getNumberOfColumns(); j ++) 
            {
                System.out.println(values[i][j]);
            }
            
        }
    }
    // check for bonds
    private void Compability(int row, int column) 
    {
        if (row < 0 || row >= getNumberOfRows() || column < 0 || column >= getNumberOfColumns()) 
        {
            throw new NumberFormatException("Wrong Input");
        }
    }
}
    

