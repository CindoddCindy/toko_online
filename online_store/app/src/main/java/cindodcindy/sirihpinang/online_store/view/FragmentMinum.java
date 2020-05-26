package cindodcindy.sirihpinang.online_store.view;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import cindodcindy.sirihpinang.online_store.R;
import cindodcindy.sirihpinang.online_store.model.MakananDuaItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMinum extends Fragment {
    private List<MakananDuaItem> makananDuaItems;
    private RecyclerView rvMakananDua;
    private LinearLayoutManager linearLayoutManager_dua;
    private  MakananDuaAdapter makananDuaAdapter;

    private ImageView imageView_healt, imageView_jus, imageView_tea, imageView_susu;


    public FragmentMinum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view=   inflater.inflate(R.layout.fragment_minum, container, false);

         rvMakananDua =view.findViewById(R.id.rv_makanan_dua);
        rvMakananDua.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));




        imageView_healt=view.findViewById(R.id.img_drink_healty);
        imageView_jus=view.findViewById(R.id.img_drink_juice);
        imageView_tea=view.findViewById(R.id.img_drink_tea);
        imageView_susu=view.findViewById(R.id.img_drink_milk);

        Glide.with(getActivity())
                .load("https://m2fabelio.imgix.net/wysiwyg/Blog/featured-images/Infused_Water_.jpg")
                .into(imageView_healt);

        Glide.with(getActivity())
                .load("https://res.cloudinary.com/grohealth/image/upload/f_auto,fl_lossy,q_auto/v1583836679/DCUK/Content/iStock-821583034.jpg")
                .into(imageView_jus);

        Glide.with(getActivity())
                .load("https://thumbor.forbes.com/thumbor/960x0/https%3A%2F%2Fblogs-images.forbes.com%2Fnomanazish%2Ffiles%2F2018%2F06%2Fteacup-2325722_1280-1200x800.jpg")
                .into(imageView_tea);

        Glide.with(getActivity())
                .load("https://www.sfidn.com/article/lib/upload/images/Artikel/Fitness/sfidn-inilah-sumber-makanan-tinggi-asam-amino-esensial1.jpg")
                .into(imageView_susu);




        makananDuaItems = new ArrayList<>();
        makananDuaItems.add(new MakananDuaItem("Drinks", "Rp.20.000","https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F35%2F2019%2F04%2F16185045%2Forange-juice-healthy-drink.jpg"));
        makananDuaItems.add(new MakananDuaItem("Drinks", "Rp.20.000","https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F35%2F2019%2F04%2F16185044%2Flemonade-healthy-drinks.jpg"));
        makananDuaItems.add(new MakananDuaItem("Fresh Drink", "Rp.20.000","https://en.shafaqna.com/wp-content/uploads/2017/06/infused-water.jpg"));
        makananDuaItems.add(new MakananDuaItem("Ready ", "Rp.20.000","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQWdBmswERco8Aj52uqvQB84O2EmL9y_4DgVphkQhuOrAxtfYmu&usqp=CAU"));
        makananDuaItems.add(new MakananDuaItem("Drink", "Rp.20.000","https://static.toiimg.com/photo/65798330.cms"));
        makananDuaItems.add(new MakananDuaItem("Drink", "Rp.20.000","https://www.sterling-wellness.com/wp-content/uploads/2015/10/healthy-tea.jpg"));
        makananDuaItems.add(new MakananDuaItem("Drink", "Rp.20.000","https://www.couponcodesme.com/blog/wp-content/uploads/48841123467_4a1b2c176b_b.jpg"));
        makananDuaItems.add(new MakananDuaItem("Drink", "Rp.20.000","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSF-ZAgh9HY4xHoOLu3qf4vK6jTCdvO9NLbFU7D2w_pNsdu42pU&usqp=CAU"));
        makananDuaItems.add(new MakananDuaItem("Drink", "Rp.20.000","https://i0.wp.com/www.themamaneedscake.com/wp-content/uploads/2019/01/DSC05558.jpg?fit=708%2C1000&ssl=1"));
        makananDuaItems.add(new MakananDuaItem("Drink", "Rp.20.000","https://asset.kompas.com/crops/zyb6sqzrS-pWbE80kuatYjjmWds=/0x0:1000x667/750x500/data/photo/2020/03/28/5e7eb044aa9a2.jpg"));
        makananDuaItems.add(new MakananDuaItem("Drink", "Rp.20.000","https://cdn-a.william-reed.com/var/wrbm_gb_food_pharma/storage/images/publications/food-beverage-nutrition/nutraingredients.com/news/research/mice-study-green-tea-shows-promise-for-food-allergies/10897991-1-eng-GB/Mice-study-Green-tea-shows-promise-for-food-allergies_wrbm_large.jpg"));

        makananDuaAdapter= new MakananDuaAdapter(getActivity(),makananDuaItems);
        rvMakananDua.setAdapter(makananDuaAdapter);


        SliderView sliderView = view.findViewById(R.id.imageSlider);//as recyclerview

        SliderAdapterDrink adapter = new SliderAdapterDrink(getActivity());//as adapter

        sliderView.setSliderAdapter(adapter);

        //sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();



        return view;
    }
}
