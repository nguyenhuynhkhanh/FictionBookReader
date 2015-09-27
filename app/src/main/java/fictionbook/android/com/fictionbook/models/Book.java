package fictionbook.android.com.fictionbook.models;

import android.graphics.Bitmap;

import java.net.URL;

/**
 * Created by Moon on 9/23/2015.
 */
public class Book {
    private int mBookId;
    private String mBookTitle;
    private String mBookDetails; // TODO NguyenHuynh: find a better way to store the content of the book
    private URL mBookUrl;
    private Bitmap mThumbImage;
    private int mCurrentChapter;
    private String mBookDescription;
    private String mAuthor;

    public Book(int bookId, String title, String description, Bitmap thumbnail) {
        mBookId = bookId;
        mBookTitle = title;
        mBookDescription = description;
        mThumbImage = thumbnail;
    }

    public int getBookId() {
        return mBookId;
    }

    public String getBookTitle() {
        return mBookTitle;
    }

    public String getBookDescription() {
        return mBookDescription;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public Bitmap getThumbnail() {
        return mThumbImage;
    }
}
