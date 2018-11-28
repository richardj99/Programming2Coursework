public class LinkedList {
    private LLItem head;

    // Start of Constructor method
    public LinkedList()
    {
        head=null;
    }  // end of constructor method

    // Start of addToHead Method
    public void addToHead(String name, String birth_date)
    {
        head = new LLItem(name, birth_date, head);
    }  // end of addToHead method
}
