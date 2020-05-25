package cindodcindy.sirihpinang.online_store.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import cindodcindy.sirihpinang.online_store.R;

public class ActivityFragment extends AppCompatActivity {


    private String [] mie ={"https://awsimages.detik.net.id/community/media/visual/2017/10/09/c699ee52-da4d-49cb-bbd5-206c02badb64.jpg?a=1","https://lh3.googleusercontent.com/proxy/_LFOGJrYe7nGAqATl4G9C_cxgE8_VL8CvY5nQ_Mg5letmxt2xwb-OMXJrABMA8LdRsr2aIMpPHERer5zzMZKpHLfAyI9NawcazW-LsUJsvAvaWXPzBcorAJq","https://majalahayah.com/wp-content/uploads/2020/01/mie-goreng-saus-tiram.jpg","https://i2.wp.com/resepkoki.id/wp-content/uploads/2020/03/Resep-Mie-Setan.jpg?fit=1079%2C1214&ssl=1","https://gudeg.net/cni-content/uploads/modules/posts/20180503042939.jpg","https://selerasa.com/wp-content/uploads/2015/11/images_Aneka_Sayur_sup-jagung-wortel.jpg","https://cherryberryweb.files.wordpress.com/2016/08/urap-1.jpg?w=816","https://www.pantau.com/uploads/news/image/2839-benarkah-makan-sayuran-rebus-bikin-tubuh-makin-sehat-1-1024-768.jpg","https://static.republika.co.id/uploads/images/inpicture_slide/memasak-dengan-sayuran-_180325095654-388.jpg","https://asset-a.grid.id/crop/0x0:0x0/x/photo/2020/01/13/1533613903.jpg"};
    private String [] makanan = {"https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRfZe4SaFmW8aIFZVw_W2yNMgmFEH1C-tYwD70uhKK6NdwAC--F&usqp=CAU","","",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        getFragmentPage(new FragmentMinum());

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
