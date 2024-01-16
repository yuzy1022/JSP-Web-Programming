package dao;
import java.util.ArrayList;
import dto.Book;

public class BookRepository {
    ArrayList<Book>listOfBooks=new ArrayList<Book>();
    
    public BookRepository(){
        
        Book book1=new Book("Num1","HTML5+CSS",15000);
        book1.setDescription("���峪 PPT������ ����� �ֳ���? �׷��� ���� �����ϴ�. ���� �ٷ� ���������� �����ϼ���.");
        book1.setCategory("Hello Coding");
        book1.setPublisher("�Ѻ��̵��");
        book1.setAuthor("Ȳ��ȣ");
        
        Book book2=new Book("Num2","���� ���� �ڹ� ���α׷���",27000);
        book2.setDescription("��ü ������ �ٽɰ� �ڹ��� ������ ����� �ٷ�鼭 �ʺ��ڰ� ���� �н��� �� �ֽ��ϴ�.");
        book2.setCategory("IT�����");
        book2.setPublisher("�Ѻ���ī����");
        book2.setAuthor("������");
        
        Book book3=new Book("Num3","������4 �Թ�",27000);
        book3.setDescription("�������� �ܼ��� ��� ����� �����°ͺ��� ��Ű���ĸ� �����ϴ°� �߿��մϴ�!");
        book3.setCategory("IT�����");
        book3.setPublisher("�Ѻ��̵��");
        book3.setAuthor("�ϼ����� ����ġ,������ ��Ÿ��,��Ű ������(����ö,���μ�)");
        
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }
    public ArrayList<Book> getAllProducts(){
        return listOfBooks;
    }
}