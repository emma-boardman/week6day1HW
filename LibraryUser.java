public class LibraryUser{
 private String name;
 private Book[] loans;
 public LibraryUser(String name){
  this.name = name;
  this.loans = new Book[5];
 }
public String getName(){
  return this.name;
}
public int bookCount(){
  int count = 0;
  for(Book book : loans){
  if(book != null){count++;
  }
}
return count;
}

public void borrow(Book book){
  int bookCount = bookCount();
  loans[bookCount] = salmon;
}

public void returnBooks(){
  for(int i = 0; i < loans.length; i++){
    loans[i] = null;
  }
}



}

