package fictionbook.android.com.fictionbook.interfaces;

import java.util.List;

import fictionbook.android.com.fictionbook.models.Book;
import fictionbook.android.com.fictionbook.models.Category;

/**
 * Created by Moon on 10/12/2015.
 */
public interface IBookLoader {
    List<Book> getListBooks();
    List<Book> getListBooks(Category category);
}
