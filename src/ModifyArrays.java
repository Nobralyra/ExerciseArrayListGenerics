public class ModifyArrays
{
    /**
     * ArrayList that have defined the generics type to Integer
     */
    OnlyArrayList<Integer> onlyArrayList = new OnlyArrayList();

    public void GetListArrays()
    {
        onlyArrayList.get(0);
        System.out.println("Here is the array: " + onlyArrayList.toString());
    }

    public void ModifyAddListArrays()
    {
        onlyArrayList.add(1);
        onlyArrayList.add(2);
        onlyArrayList.add(4);
        onlyArrayList.add(8);
        System.out.println("Add value 1, 2, 4, 8 to the index 1, 2, 3, 4 in the array: " + onlyArrayList.toString());
    }

    public void ModifyRemoveListArrays()
    {
        onlyArrayList.remove(3);
        System.out.println("Remove value 4 at index 3: " + onlyArrayList.toString());
    }

    public void SeeSizeListArray()
    {
        System.out.println("What size is the array? " + onlyArrayList.size());
    }

}