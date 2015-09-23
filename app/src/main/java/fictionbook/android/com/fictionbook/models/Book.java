package fictionbook.android.com.fictionbook.models;

import android.graphics.Bitmap;

import java.net.URL;

/**
 * Created by Moon on 9/23/2015.
 */
public class Book {
    private String mBookName;
    private String mBookDetails; // TODO NguyenHuynh: find a better way to store the content of the book
    private URL mBookUrl;
    private Bitmap mThumbImage;
    private int mCurrentChapter;
    //TODO NguyenHuynh: get/set methods
}
