package cindodcindy.sirihpinang.online_store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import cindodcindy.sirihpinang.online_store.view.ActivityFragment;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView_splash_screen;
     private  int waktu_loading= 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_splash_screen=findViewById(R.id.img_awal);
        Glide.with(MainActivity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.tampil_awal)
                .into(imageView_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, ActivityFragment.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);

    }
}
