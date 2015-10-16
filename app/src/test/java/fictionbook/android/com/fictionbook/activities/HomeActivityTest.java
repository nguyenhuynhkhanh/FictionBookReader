package fictionbook.android.com.fictionbook.activities;

import android.os.Build;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java.io.InputStream;

import fictionbook.android.com.fictionbook.BuildConfig;
import fictionbook.android.com.fictionbook.R;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Moon on 9/23/2015.
 */
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class HomeActivityTest{
    private HomeActivity activity;

    // @Before => JUnit 4 annotation that specifies this method should run before each test is run
    // Useful to do setup for objects that are needed in the test
    @Before
    public void setup() {
        // Convenience method to run MainActivity through the Activity Lifecycle methods:
        // onCreate(...) => onStart() => onPostCreate(...) => onResume()
        activity = Robolectric.setupActivity(HomeActivity.class);
    }

    // @Test => JUnit 4 annotation specifying this is a test to be run
    // The test simply checks that our TextView exists and has the text "Hello world!"
    @Test
    public void validateTextViewContent() {
        ListView list = (ListView) activity.findViewById(R.id.recommended_books);
        assertNotNull("TextView could not be found", list);
    }

    @Test
    public void testCanLoadResourceFromResFolder() {
        InputStream inputStream = activity.getResources().openRawResource(R.raw.list_books);
        assertNotNull("The resource should be loaded successfully", inputStream);
    }
}
