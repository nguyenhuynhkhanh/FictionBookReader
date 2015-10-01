package fictionbook.android.com.fictionbook.activities;

import android.test.ActivityInstrumentationTestCase2;
import android.util.JsonReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import fictionbook.android.com.fictionbook.R;
import fictionbook.android.com.fictionbook.TestHelper;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by Moon on 9/23/2015.
 */
public class HomeActivityTest extends ActivityInstrumentationTestCase2<HomeActivity>{
    public HomeActivityTest(){
        super(HomeActivity.class);
    }

    public void testHomeActivity_Contains_HomeFragment(){
        //TODO NguyenHuynh: need to update the code

        assertEquals("Home activity should contains the home fragment", true, false);
    }

    public void testCanLoadResourceFromResFolder() {
        InputStream inputStream = getActivity().getResources().openRawResource(R.raw.list_books);
        assertNotNull("The resource should be loaded successfully", inputStream);
    }
}
