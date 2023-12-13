import java.util.Random;
import java.util.StringJoiner;

public class BookStore {
    /*
    id the variable stores the book id and declare it as private (type: int)
    latestId the variable stores the latest id used by the book store object and declares it as private and static (type: int)
    name the variable stores the book name and declare it as private (type: String)
    books the variable stores the books that are available and declared as private (type: Book[])
    size the variable stores the size of bookshelf in the shop and declared as private (type: int)
     */
    private int id;
    private static int latestId;
    private String name;
    private Book[] books;
    private int size;
    /*
    Constructure
    set id as latestId
    increment latestId by 1
    receive the name, and size, then assign them to the instance variable
     */

    public BookStore( String name, int size) {
        this.id = latestId++;
        this.name = name;
        this.size = size;
        this.books = new Book[size];
    }
    //getter id name books

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    addBook(book:Book):boolean randomize the id and check if the id exists in the books array return false,
     otherwise, add the new book at an index from the id you just random
     */
    public boolean addBook(Book book){

        for(int i = 0;i < size;i++){
            if(books[i] != null && books[i].getId() == book.getId()){
                return false;
            }
        }
        Random random1 = new Random();
        int random;

//        do{
//            random = random1.nextInt(size-1);
//        }
//        while(books[random] != null);
//        books[random] = book;
//
//        return true;
        random = random1.nextInt(size-1);
        while(random < size){
            if(books[random] == null){
                books[random] = book;
                return true;
            }
            random = random1.nextInt(size-1);
        }
        return false;
    }
    /*
    sellBook(id:int):boolean remove the book from the books array
     */
    public boolean sellBook(int id){
        for(int i = 0; i < size;i++){
            if(books[i] != null &&books[i].getId() == id) {
              books[i]=null;
              for(int s=size-1;s>=0;s--){
                  if(books[s] != null){
                      books[i] = books[s];
                      books[s] = null;
                      return true;
                  }

              }
            }
        }
        return false;
    }
    /*
    getAllBooks():Book[] return all available books in the store
toString():String
     */
//    public String getAllBooks(){
//        StringJoiner str = new StringJoiner(",");
//        for(int i = 0; i < size;i++){
//            if(books[i] != null){
//                str.add((CharSequence) books[i]);
//            }
//        }
//        return str.toString();
//    }
    public Book[] getAllBooks(){
        Book[] newBooks = new Book[size];
        for(int i = 0; i<size;i++){
            if(books[i] != null){
                Book b = books[i];
                for(int d = 0;d<size;d++){
                    if(newBooks[i] == null){
                        newBooks[i] = b;
                    }
                }
            }

        }
        return newBooks;
    }

}
