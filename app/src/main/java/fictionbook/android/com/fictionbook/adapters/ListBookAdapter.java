package fictionbook.android.com.fictionbook.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import fictionbook.android.com.fictionbook.R;
import fictionbook.android.com.fictionbook.models.Book;
import fictionbook.android.com.fictionbook.viewholders.BookItemViewHolder;

/**
 * Created by Moon on 9/27/2015.
 */
public class ListBookAdapter extends BaseAdapter {
    private List<Book> mBooks;
    private Context mContext;

    public ListBookAdapter(Context context, List<Book> books) {
        mContext = context;
        mBooks = new ArrayList<>(books);
    }

    @Override
    public int getCount() {
        return mBooks.size();
    }

    @Override
    public Object getItem(int position) {
        return mBooks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mBooks.get(position).getBookId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BookItemViewHolder viewHolder = null;

        if (viewHolder == null) {
            convertView = createBookItemView();
        }

        viewHolder = (BookItemViewHolder) convertView.getTag();
        viewHolder.updateView(mBooks.get(position));
        return convertView;
    }

    private View createBookItemView() {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.book_item, null);
        BookItemViewHolder viewHolder = new BookItemViewHolder(itemView);

        itemView.setTag(viewHolder);
        return itemView;
    }
}
