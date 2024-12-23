/*
create a book for a library system

1. instance variables : title,author,isbn.
2. static variables : totalBooks (a counter for total number of book instances)
3. instance methods : borrowBook(),returnBook().
4. static method : getTotalBooks() (to get the total number of books in library)

 */

class book{
    // static variable 
    static int totalNoOfBooks;

    // instance  variables 
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    
    //  static code block 

    static{
        totalNoOfBooks =0;
    }
    
    // object intializer 
    {
        totalNoOfBooks++;
    }
    
    //  parameterized constructor 
    book(String isbn,String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    
    book(String isbn){
        this(isbn, "unknown" , "unknown");
    }
    
    //  static method 
    static int getTotalBooks(){
        return totalNoOfBooks;
    }
    // instance method 

    void borrowBook(){
        if(isBorrowed){
            System.out.println("book is alreasy borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        } 
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed please leave a review");
        }else{
            System.out.println("this book is already in the library");
        }
    }

    public static void main(String[] args) {
        book design = new book("1", "design","james");
        book framing = new book("2");
        System.out.println(book.getTotalBooks());
        design.borrowBook();
        framing.borrowBook();
        design.borrowBook();
        design.returnBook();
        design.returnBook();
    }
}



