package fictionbook.android.com.fictionbook.helpers;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import fictionbook.android.com.fictionbook.ApplicationController;
import fictionbook.android.com.fictionbook.models.Book;
import fictionbook.android.com.fictionbook.models.Category;

/**
 * Created by Moon on 10/12/2015.
 */
public class HttpBookLoader extends BookLoaderBase implements Response.Listener<JSONArray>, Response.ErrorListener {
    private static final String API_BOOKS_LIST_URL = "http://api.androidhive.info/volley/person_array.json";

    @Override
    public List<Book> getListBooks() {
        return getListBooks(null);
    }

    @Override
    public List<Book> getListBooks(Category category) {
        List<Book> books = new ArrayList<>();
        JsonArrayRequest booksRequest = new JsonArrayRequest(API_BOOKS_LIST_URL, this, this);
        ApplicationController.getInstance().addToRequestQueue(booksRequest);
        notifyBookLoaded();
        return books;
    }

    @Override
    public void onResponse(JSONArray o) {
        System.out.println("responsed");
    }

    @Override
    public void onErrorResponse(VolleyError volleyError) {

    }
}
