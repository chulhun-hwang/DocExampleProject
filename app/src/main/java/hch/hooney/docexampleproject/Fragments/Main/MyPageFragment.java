package hch.hooney.docexampleproject.Fragments.Main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hch.hooney.docexampleproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyPageFragment extends Fragment {
    private final String TAG = MyPageFragment.class.getSimpleName();
    private View view;


    public MyPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_my_page, container, false);
        return view;
    }

}
