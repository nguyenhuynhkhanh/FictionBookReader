package fictionbook.android.com.fictionbook.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fictionbook.android.com.fictionbook.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomePageFragment extends Fragment {

    public HomePageFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
