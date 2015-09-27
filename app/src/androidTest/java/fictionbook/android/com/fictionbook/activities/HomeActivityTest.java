package fictionbook.android.com.fictionbook.activities;

import android.support.v4.app.Fragment;
import android.test.ActivityInstrumentationTestCase2;
import junit.framework.Assert.*;
import junit.framework.Assert;

import fictionbook.android.com.fictionbook.R;

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
}
