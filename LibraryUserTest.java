import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryUserTest{
  LibraryUser libraryuser;
  Book book;

  @Before
  public void before() {
    libraryuser = new LibraryUser("Ronnie");
    book = new Book();
  }

  @Test
  public void hasName(){
    assertEquals("Ronnie", libraryuser.getName());
  }

  @Test
  public void loansStartEmpty(){
    assertEquals(0, libraryuser.bookCount());
  }

  @Test
  public void canBorrowBook(){
    libraryuser.borrow(book);
    assertEquals(1, libraryuser.bookCount());
  }

  @Test
  public void cannotBorrowBooksWhenLoansFull(){
    for(int i = 0; i<5; i++){
      libraryuser.borrow(book);
    }
    assertEquals(libraryuser.bookCount(), 5);
  }

  // @Test 
  // public void loansIsFull(){
  //   for(int i=0; i<5; i++){
  //     libraryuser.borrow(book);
  //   }
  //   assertEquals(libraryuser.loansFull(), true);
  // }

//   @Test
//   public void cannotBorrowWhenLoansFull(){
//     for(int i = 0; i<6; i++){
//       libraryuser.borrow(book);
//     }
//     assertEquals(libraryuser.bookCount(), 5)
//   }
}