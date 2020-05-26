package cindodcindy.sirihpinang.online_store.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cindodcindy.sirihpinang.online_store.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FrgamentProfile extends Fragment {

    private ImageView img_profile;

    public FrgamentProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view =inflater.inflate(R.layout.fragment_frgament_profile, container, false);
         img_profile=view.findViewById(R.id.img_profile);

        Glide.with(getActivity())
                .load("https://pbs.twimg.com/profile_images/1103659911827939328/3VJCDosU.png")
                .into(img_profile);


        return view;
    }
}
