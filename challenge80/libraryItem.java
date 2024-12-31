package challenge80;
/*
start with a base class libraryItem that includes common attributes like itemID,title, and author, and methods like checkout() and returnItem().create subclasses such as Book,Magazine, and DVD,each inheriting from libraryItem.Add unique attributes to each subclass , like ISBN for book,issueNumber for Magazine, and duration for DVD
 */
public class libraryItem {
    private String itemId;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("checkout");
    }

    public void returnItem(){
        System.out.println("Returning the item");
    }
}
