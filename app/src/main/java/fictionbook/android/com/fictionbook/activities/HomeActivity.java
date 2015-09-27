package fictionbook.android.com.fictionbook.activities;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import fictionbook.android.com.fictionbook.R;
import fictionbook.android.com.fictionbook.adapters.ListBookAdapter;
import fictionbook.android.com.fictionbook.models.Book;

public class HomeActivity extends AppCompatActivity {

    //TODO NguyenHuynh: replace this using real data from server
    private ArrayList<Book> mFakedBooks;

    private void createFakedBooks() {
        mFakedBooks = new ArrayList<>();
        for(int i = 1; i < 10; i++) {
            Book book = new Book(i, "Book " + i, "Description", BitmapFactory.decodeResource(getResources(), R.drawable.book_icon));
            mFakedBooks.add(book);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createFakedBooks();

        setContentView(R.layout.activity_home);
        ListView recomendedBooks = (ListView) findViewById(R.id.recommended_books);
        ListBookAdapter adapter = new ListBookAdapter(this, mFakedBooks);
        recomendedBooks.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
