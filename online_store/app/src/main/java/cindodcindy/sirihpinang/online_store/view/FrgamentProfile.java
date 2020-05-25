package cindodcindy.sirihpinang.online_store.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cindodcindy.sirihpinang.online_store.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FrgamentProfile extends Fragment {

    public FrgamentProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frgament_profile, container, false);
    }
}
