package com.example.bookstoremvc;

import com.example.bookstoremvc.dao.AuthorDao;
import com.example.bookstoremvc.dao.BookDao;
import com.example.bookstoremvc.dao.CategoryDao;
import com.example.bookstoremvc.entity.Author;
import com.example.bookstoremvc.entity.Book;
import com.example.bookstoremvc.entity.BookStatus;
import com.example.bookstoremvc.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
public class BookStoreMvcApplication {
    private final CategoryDao categoryDao;
    private final AuthorDao authorDao;
    private final BookDao bookDao;
    @Bean @Transactional
    public ApplicationRunner runner(){
        return r -> {
            //for BestSellers
            Category category=new Category();
            category.setCategoryName("Programming");

            Author author1=new Author("Robert.C","Martin","martin@gmail.com",
                    LocalDate.of(1952,12,5),
                    "Uncle Bob is a living legend in the software industry " +
                            "and his work has had a profound impact on the way " +
                            "that software is developed today. He is a mentor to many " +
                            "and is always willing to share his knowledge and expertise." +
                            " He is a true inspiration to all software engineers.",
                    "uncle_bob");

            Book book1=new Book("Clean Code",40.5,LocalDate.of(2008,3,11),
                    "Pearson", BookStatus.BESTSELLERS,"clean_code");


            Category category2=new Category();
            category2.setCategoryName("Science");

            Author author2=new Author("Stephan","Hawking",
                    "stephan@gmail.com",LocalDate.of(1942,1,8),
                    "He was a theoretical physicist, cosmologist, and author" +
                            " who made significant contributions to " +
                            "our understanding of black holes and the Big Bang.",
                    "hawking");

            Book book2=new Book("A Brief History of Time",
                    18.99,LocalDate.of(1988,1,1),"Bantam Dell"
                    ,BookStatus.BESTSELLERS,
                    "history_of_time");

            Category category3=new Category();
            category3.setCategoryName("Programming");

            Author author3=new Author("Joshua","Bloch","bloch@gmail.com",
                    LocalDate.of(1961,8,28),
                    "a software engineer and author who was involved in " +
                            "the design and implementation of" +
                            " numerous Java platform features.","bloch");

            Book book3=new Book("Effective Java",55.2,LocalDate.of(2017,12,27),
                    "Addison-Wesley",
                    BookStatus.BESTSELLERS,
                    "effective_java");

          //Eh

            Category category4=new Category();
            category4.setCategoryName("Novel");

            Category category5 = new Category();
            category5.setCategoryName("Fantasy");

            Category category6=new Category();
            category6.setCategoryName("Romance");

            Author author4=new Author("Thomas","Hardy","thomas@gmail.com",
                    LocalDate.of(1840,6,2),
                    "His novels are often characterized by their tragic plots and their exploration of themes such as love, loss, and fate.",
                    "hardy");

            Book book4=new Book("Far From the",32.5,LocalDate.of(1874,1,1),
                    "Collins",BookStatus.BESTSELLERS,"far");

            Author author5=new Author("Yasunari","Kawabata","kawabata@gmail.com",
                    LocalDate.of(1899,1,1),
                    "he soon developed his own unique style, which was characterized by its simplicity, its focus on the inner lives of his characters, and its use of symbolism.",
                    "kawabata");
            Book book5=new Book("Snow Country",
                    20.5,LocalDate.of(1948,1,1),
                    "Pole Star",BookStatus.BESTSELLERS,
                    "snow");

            Author author6=new Author("Charles","Dickens","charles@gmail.com",LocalDate.of(1812,2,7),
                    "Charles Dickens, in full Charles John Huffam Dickens, (born February 7, 1812, Portsmouth, Ham…\n" +
                            "Dickens enjoyed a wider popularity during his lifetime than had any previous author." +
                            " Much in his work could appeal to the simple",
                    "charles");

            Author author7=new Author("Jane","Austen",
                    "james@gmail.com",LocalDate.of(1965,7,31),
                    "He published several pieces by his brother Henry, and Day speculated that he may have published one piece by his teenage sister Jane.[3] Day says the satirical pieces in The Loiterer resembled the unpublished juvenilia the teenage Jane wrote for her family.",
                    "jane");

            Author author8=new Author("Joanne","Rowling","joanne@gmail.com",LocalDate.of(1775,12,16),
                    "Rowling has won many accolades for her work. She has received an OBE and made a Companion of Honour for services to literature and philanthropy. Harry Potter brought her wealth and recognition," +
                            " which she has used to advance philanthropic endeavours and political causes.",
                    "rowling");

            Author author9=new Author("Robert","Baden-Powell","robert@gmail.com",
                    LocalDate.of(1857,2,22),
                    "Baden-Powell returned to South Africa before the Second Boer War. Although instructed to maintain a mobile mounted force on the frontier with the Boer Republics, " +
                            "Baden-Powell amassed stores and established a garrison at Mafeking. ",
                    "robert");

            Author author10=new Author("Colleen ","Hoover","hoover@gmail.com",
                    LocalDate.of(1979,12,11),
                    "Hoover began writing her debut novel, Slammed, with no intention of getting published. She was inspired by a lyric, \"decide what to be and go be it,” from an Avett Brothers song, \"Head Full of Doubt/Road Full of Promise,\" " +
                            "and she incorporated Avett Brothers lyrics throughout the story.",
                    "hoover");

            Book book6 = new Book("David Copperfield",35.5,LocalDate.of(1850,1,12),
                    "Amazon",BookStatus.RECOMMENDED,"david");

            Book book7 = new Book("Great Expectations",40.3,
                    LocalDate.of(1861,1,1),"Amazon",
                    BookStatus.RECOMMENDED,"great");

            Book book8 = new Book("Oliver Twist",33.5,
                    LocalDate.of(1838,1,1),"Sun",
                    BookStatus.RECOMMENDED,"oliver");

            Book book9 = new Book("Pride and Prejudice",30.5,
                    LocalDate.of(2008,5,16),"Amazon",
                    BookStatus.RECOMMENDED,"pride");

            Book book10 = new Book("Emma",30.5,
                    LocalDate.of(2003,5,6),"Amazon",
                    BookStatus.RECOMMENDED,"emma");

            Book book11 = new Book("Harry Potter",20.5,
                    LocalDate.of(1997,6,26),"Bloomsbury",
                    BookStatus.NEW,"harry");

            Book book12 = new Book("Scouting for Boys",35.5,
                    LocalDate.of(1908,1,24),"Horace Cox",
                    BookStatus.NEW,"boys");

            Book book13 = new Book("My Adventures as a Spy",33.29,
                    LocalDate.of(2013,12,3),"Courier Corporation",
                    BookStatus.NEW,"spy");

            Book book14 = new Book("It Ends with Us",25.34,
                    LocalDate.of(2016,8,2),"Atria Books",
                    BookStatus.NEW,"ends");

            Book book15 = new Book("Ugly Love",33.29,
                    LocalDate.of(2022,2,2),"Amazon",
                    BookStatus.NEW,"love");



            category.addBook(book1);
            author1.addBook(book1);

            category2.addBook(book2);
            author2.addBook(book2);

            category3.addBook(book3);
            author3.addBook(book3);



            category4.addBook(book4);
            author4.addBook(book4);

            category4.addBook(book5);
            author5.addBook(book5);

            category4.addBook(book6);
            category4.addBook(book7);
            category4.addBook(book8);
            category4.addBook(book9);
            category4.addBook(book10);

            category5.addBook(book11);
            category5.addBook(book12);
            category5.addBook(book13);

            category6.addBook(book14);
            category6.addBook(book15);

            author6.addBook(book6);
            author6.addBook(book7);
            author6.addBook(book8);

            author7.addBook(book9);
            author7.addBook(book10);

            author8.addBook(book11);

            author9.addBook(book12);
            author9.addBook(book13);

            author10.addBook(book14);
            author10.addBook(book15);



            categoryDao.save(category);
            categoryDao.save(category2);
            categoryDao.save(category3);
            categoryDao.save(category4);
            categoryDao.save(category5);
            categoryDao.save(category6);

            authorDao.save(author1);
            authorDao.save(author2);
            authorDao.save(author3);
            authorDao.save(author4);
            authorDao.save(author5);
            authorDao.save(author6);
            authorDao.save(author7);
            authorDao.save(author8);
            authorDao.save(author9);
            authorDao.save(author10);

            bookDao.save(book1);
            bookDao.save(book2);
            bookDao.save(book3);
            bookDao.save(book4);
            bookDao.save(book5);
            bookDao.save(book6);
            bookDao.save(book7);
            bookDao.save(book8);
            bookDao.save(book9);
            bookDao.save(book10);
            bookDao.save(book11);
            bookDao.save(book12);
            bookDao.save(book13);
            bookDao.save(book14);
            bookDao.save(book15);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(BookStoreMvcApplication.class, args);
    }

}
