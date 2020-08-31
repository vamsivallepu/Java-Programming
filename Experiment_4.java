class Book{
    private String name;
    private String ISBN;
    private String author;
    private String publisher;
    public Book(String name, String isbn, String author, String publisher){
        this.name= name;
        this.ISBN= isbn;
        this.author= author;
        this.publisher= publisher;
    }
    public void modifyName(String new_name){
        this.name=new_name;
    }
    public void modifyIsbn(String new_isbn){
        this.ISBN=new_isbn;
    }
    public void modifyAuthor(String new_author){
        this.author=new_author;
    }
    public void modifyPublisher(String new_publisher){
        this.publisher=new_publisher;
    }
    public String getName(){
        return this.name;
    }
    public String getIsbn(){
        return this.ISBN;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public String getBookInfo(){
        return "The details of book :\nName : "+this.name+"\nISBN : "+this.ISBN+"\nAuthor : "+this.author+"\nPublisher : "+this.publisher;
        }
}

class Experiment_4{
    public static void main(String[] args) {
        // Book b1=new Book("Head first java","987-182-143","Kathy Sierra","Oreilly");
        // System.out.println(b1.getBookInfo());
        Book BookTest[]=new Book[30];
        BookTest[0]=new Book("Head first java","987182143","Kathy Sierra","Oreilly");
        //mutating
        BookTest[0].modifyIsbn("8173666024");
        System.out.println(BookTest[0].getBookInfo());
        //similarly we can create other 29 objects which will store in an array BookTest[]
    }
}





















