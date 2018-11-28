public class LLItem {

    // Private data types
    private int id;
    private String name;
    private LLItem nextItem;

    // Start of constructor method for birthday items
    public LLItem(String name, String birth_date, LLItem nextItem)
    {

    }  // end of constructor method for birthday items

    // Start of constructor method for phone number items
    public LLItem(String name, int phone_num, LLItem nextItem)
    {

    }  // end of constructor method for phone number items

    // Start of getNextItem method
    public LLItem getNextItem(LLItem current)
    {
        return current.nextItem;
    }


}  // end of LLItem class
