import java.util.Arrays;

/**
 * Generics class that can take every element type <E>
 * @param <E>
 */
public class OnlyArrayList<E>
{
    /**
     * Private empty Object with Arrays
     */
    private Object[] listOfNumbers = new Object[0];
    private Object[] listOfNumbers2 = new Object[0];

    /**
     * Default constructer
     */
    public OnlyArrayList()
    {
    }

    /**
     * Public get method that is called by GetListArrays() and returns the specific element from array
     * @param index
     * @return listOfNumbers
     */
    public E get(int index)
    {
        E element = null;

        for (int i = 0; i < listOfNumbers.length; i++)
        {
            if (i == index)
            {
                element = (E) listOfNumbers[i]; //Downcasting
            }
        }
        return element;
    }

    /**
     * Public add method that adds an element to the array.
     * You need to make a new array with an extra index and
     * copy the old array with elements + the new element to the new array
     * @param element
     */
    public void add(E element)
    {
        Object[] listOfNumbers2 = new Object[listOfNumbers.length + 1];
        for(int i = 0; i < listOfNumbers.length; i++)
        {
            listOfNumbers2[i] = listOfNumbers[i];
        }

        listOfNumbers2[listOfNumbers2.length - 1] = element;
        listOfNumbers = listOfNumbers2;
    }

    /**
     * Public remove method that removes a specific index from the array.
     * You need to make a new array that do not have that specific index and
     * copy the old array with elements - the element that should be removed to the new array.
     * There needs to be a try-catch around if there would be asked to remove an index that do
     * not exist in the old array
     * @param index
     */
    public void remove(int index)
    {
        listOfNumbers2 = new Object[listOfNumbers.length - 1];
        int newIndex = 0;

        try
        {
            for(int i = 0; i < listOfNumbers.length; i++)
            {
                if (index != i)
                {
                    listOfNumbers2[newIndex] = listOfNumbers[i];
                    newIndex++;
                }
            }
            listOfNumbers = listOfNumbers2;
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
    }

    /**
     * Array has length() that do the same as ArrayList size()
     * https://www.geeksforgeeks.org/difference-between-length-of-array-and-size-of-arraylist-in-java/
     * @return listOfNumbers.length
     */
    public int size()
    {
        return listOfNumbers.length;
    }

    @Override
    public String toString()
    {
        return listOfNumbers.length + Arrays.toString(listOfNumbers);
    }
}