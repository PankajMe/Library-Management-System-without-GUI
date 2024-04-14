
public class Item {

    private String id;
    private String bookName;

    //Constructer
    public Item(String id,String bookName){
        this.id=id;
        this.bookName=bookName;
    }

    //Setter
    public void setId(String id){
        this.id=id;
    }
    public void setBookName(String bookname){
        this.bookName=bookname;
    }

    //getter 
    public String getId(){
        return id;
    }
    public String getBookName(){
        return bookName;
    }

    //ToString

    public String ToString(){
        return "User Id == "+id+"\n"+"Book Name == "+bookName;
    }
    
}
