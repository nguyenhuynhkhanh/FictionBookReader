package fictionbook.android.com.fictionbook.helpers;

import java.util.List;

import fictionbook.android.com.fictionbook.listeners.DataLoaderListener;
import fictionbook.android.com.fictionbook.models.Book;
import fictionbook.android.com.fictionbook.models.Category;

/**
 * Created by Moon on 10/12/2015.
 */
public abstract class BookLoaderBase {
    private DataLoaderListener mBookLoaderListener;

    public abstract List<Book> getListBooks();

    public abstract List<Book> getListBooks(Category category);

    public void setBookLoaderListener(DataLoaderListener listener) {
        mBookLoaderListener = listener;
    }

    protected void notifyBookLoaded() {
        if (mBookLoaderListener != null) {
            mBookLoaderListener.onDataLoaded();
        }
    }
}
