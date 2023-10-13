/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab1;
import java.util.*;




public class StringCalculator
{
    public static int add(String numbers)
    {
        if(numbers.isEmpty())
        {
            return 0; 
        }
        String[] modified_numbers = get_numbers_string(numbers);
        Integer result = sum(modified_numbers);
        return result;
    }

    private static String[] get_numbers_string(String numbers)
    {
        String delemiter = ",";
        String custom_delemiter = ""; 
        if(numbers.startsWith("//"))
        {
            String[] tokens = numbers.split("\n", 2);
            numbers = tokens[1];
            custom_delemiter = get_custom_delemiters(tokens[0]);
        }
        if(numbers.endsWith("\n")||numbers.endsWith(delemiter)||numbers.endsWith(custom_delemiter))
        {
            numbers += "!";
            return numbers.split("\n");
        }

        numbers = numbers.replace(custom_delemiter, delemiter);
        return numbers.replace("\n", delemiter).split(delemiter);

    }
    private static int sum(String[] modified_numbers)
    {
        try
        {
            Integer sum = 0;
            Integer number = 0;
            List<Integer> integer_list = new ArrayList<Integer>();
            List<Integer> non_valid_integer = new ArrayList<Integer>();
            for (String i: modified_numbers)
            {
                number = Integer.valueOf(i);
                if (number < 0)
                {
                    non_valid_integer.add(number);
                    continue;
                }
                integer_list.add(number);
            }
            if (non_valid_integer.isEmpty())
            {
                for (Integer i:  integer_list)
                {
                    sum += i;
                    System.out.println("Result : " + sum);
                    return sum;
                }
            }
            System.out.println("There is negative number(s):");
            for(Integer i: non_valid_integer)
            {
                System.out.println(i);
            }
            throw new NumberFormatException();      
        }
        catch (NumberFormatException ex)
        {
            ex.printStackTrace();
            return -1;
        }
    }

    private static String get_custom_delemiters(String delemiter)
    {
        
        delemiter = delemiter.replace("//", "");
        delemiter = delemiter.replace("\n", "");
        return delemiter;
    }

    public static void main(String[] args) 
    {
       add("//!\n1!-22!-3");
    }
}
