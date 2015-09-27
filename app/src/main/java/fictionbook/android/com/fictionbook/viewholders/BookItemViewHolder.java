package fictionbook.android.com.fictionbook.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fictionbook.android.com.fictionbook.R;
import fictionbook.android.com.fictionbook.models.Book;

/**
 * Created by Moon on 9/27/2015.
 */
public class BookItemViewHolder {
    private ImageView mThumbnail;
    private TextView mTitle;
    private TextView mAuthor;
    private TextView mDescription;

    public BookItemViewHolder(View view) {
        mTitle = (TextView) view.findViewById(R.id.book_title);
        mAuthor = (TextView) view.findViewById(R.id.book_author);
        mDescription = (TextView) view.findViewById(R.id.book_description);
        mThumbnail = (ImageView) view.findViewById(R.id.book_thumbnail);
    }

    public void updateView(Book book) {
        mTitle.setText(book.getBookTitle());
        mDescription.setText(book.getBookDescription());
        mAuthor.setText(book.getAuthor());
        mThumbnail.setImageBitmap(book.getThumbnail());
    }
}
