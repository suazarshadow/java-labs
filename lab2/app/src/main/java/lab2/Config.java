package lab2;

import java.util.Objects;

public class Config {
    public int Rows;
    public int Columns;


    public void setConfig(int rows, int columns)
    {
        Rows = rows;
        Columns = columns;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } 

        Config objectConfig = (Config) obj;
        return Rows == objectConfig.Rows && Columns == objectConfig.Columns;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(Rows, Columns);
    }

}
