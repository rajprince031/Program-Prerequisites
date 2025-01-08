import java.util.*;

class Book{
    private String Name;
    private String Author;
    private String ISBN;
    public Book(String Name, String Author, String ISBN){
        this.Name = Name;
        this.Author = Author;
        this.ISBN = ISBN;
    }

    public String getName(){
        return (this.Name);
    }
    public String getISBN(){
        return (this.ISBN);

    }
    public String getAuthor(){
       return (this.Author);

    }
  
}

class Library{
    ArrayList<Book> Book_Collection;
    private int size;
    public Library(){
        this.Book_Collection = new ArrayList<>();
        this.size = 0;
    }

    public void addBook(Book book){
        Book_Collection.add(book);
        size++;
    }

    public void getAllBook(){
        for(int i=0;i<Book_Collection.size();i++){
            System.out.println(Book_Collection.get(i).getName());
            System.out.println(Book_Collection.get(i).getAuthor());
            System.out.println(Book_Collection.get(i).getISBN());
            System.out.println();
        }
    }

    public boolean removeBook(String ISBN){
        for(int i=0;i<Book_Collection.size();i++){
            String lib_ISBN = Book_Collection.get(i).getISBN();
            if(lib_ISBN.equals(ISBN.trim())){
                System.out.println(Book_Collection.get(i).getName());
                System.out.println(Book_Collection.get(i).getAuthor());
                System.out.println(Book_Collection.get(i).getISBN());
                System.out.println();
                Book_Collection.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean searchBook(String ISBN){
        for(int i=0;i<Book_Collection.size();i++){
            String lib_ISBN = Book_Collection.get(i).getISBN();
            if(lib_ISBN.equals(ISBN.trim())){
                System.out.println(Book_Collection.get(i).getName());
                System.out.println(Book_Collection.get(i).getAuthor());
                System.out.println(Book_Collection.get(i).getISBN());
                System.out.println();
                return true;
            }
        }
        return false;
    }

    public int total_no_of_book(){
       return this.size;
    }

}

public class Library_Management{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Would you like start the Library : (y/n)");
        String isStart = sc.next();
        while(isStart.equals("y")){
            System.out.println("Choose the options : ");
            System.out.println("1 : Add Book");
            System.out.println("2 : Search Book");
            System.out.println("3 : Remove Book");
            System.out.println("4 : Get all Books");
            System.out.println("5 : Exit Library");
            System.out.println("Enter your Choice :");
            int selected_option = sc.nextInt();
            if(selected_option == 1){
                System.out.println("Enter your Book Name :");
                String name = sc.next();
                System.out.println("Enter your Book Author Name :");
                String author = sc.next();
                System.out.println("Enter your Book ISBN Number :");
                String ISBN = sc.next();
                library.addBook(new Book(name,author,ISBN));
                System.out.println("Book Added Successfully");
            }else if(selected_option == 2){
                System.out.println("Enter Book ISBN Number :");
                String ISBN = sc.next();
                boolean isBook = library.searchBook(ISBN);
                if(!isBook) System.out.println("Book is not available");
            }else if(selected_option == 3){
                System.out.println("Enter Book ISBN Number :");
                String ISBN = sc.next();
                boolean isBook = library.removeBook(ISBN);
                if(isBook) System.out.println("Book is removed successfully");
                else System.out.println("Book is not available");
            }else if(selected_option == 4){
                library.getAllBook();
                System.out.println("Total no. of Books : "+ library.Book_Collection.size());
            }else if(selected_option == 5){
                System.out.println("Thank You !!");
                break;
            }else{
                System.out.println("You choose the wrong option try again");
            }
            System.out.println();

        }
    }
}