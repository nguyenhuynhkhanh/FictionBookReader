package fictionbook.android.com.fictionbook.fragments;

import android.support.v4.app.Fragment;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import org.junit.Test;

import fictionbook.android.com.fictionbook.R;
import fictionbook.android.com.fictionbook.activities.HomeActivity;

/**
 * Created by Moon on 9/23/2015.
 */
public class HomePageFragmentTest extends ActivityInstrumentationTestCase2<HomeActivity>{

    public HomePageFragmentTest(){
        super(HomeActivity.class);
    }

    @Test
    public void testHomePageFragment_Contains_A_TextView() {
        Fragment fragment = getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment);
        TextView greetingText = (TextView) fragment.getView().findViewById(R.id.homePageText);

        assertEquals("Fragment should show hellow world", "Hello world!", greetingText.getText());
    }
}
