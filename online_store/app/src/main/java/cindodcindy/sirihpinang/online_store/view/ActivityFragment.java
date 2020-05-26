package cindodcindy.sirihpinang.online_store.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import cindodcindy.sirihpinang.online_store.R;

public class ActivityFragment extends AppCompatActivity {


    private String [] mie ={"","","","","","","","","",""};
    private String [] makanan = {"","","",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        getFragmentPage(new FragmentFood());

        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.makan:
                        fragment = new FragmentFood();
                        break;

                    case R.id.minum:
                        fragment = new FragmentMinum();
                        break;

                    case R.id.profile:
                        fragment = new FrgamentProfile();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });

    }


    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}
