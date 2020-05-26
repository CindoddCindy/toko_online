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
import cindodcindy.sirihpinang.online_store.model.MakananItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFood extends Fragment {
    private List<MakananItem> makananItems;
    private RecyclerView rvMakanPertama;
    private LinearLayoutManager linearLayoutManager;
    private  MakananAdapterSatu makananAdapterSatu;

    private ImageView imageView_pagi, imageView_siang, imageView_sore, imageView_malam;


    public FragmentFood() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view =inflater.inflate(R.layout.fragment_food, container, false);

         imageView_pagi=view.findViewById(R.id.img_food_makan_pagi);
         imageView_siang=view.findViewById(R.id.img_food_lunch);
         imageView_sore=view.findViewById(R.id.img_food_afternoon);
         imageView_malam=view.findViewById(R.id.img_food_dinner);

        Glide.with(getActivity())
                .load("https://www.bbcgoodfood.com/sites/default/files/recipe-collections/collection-image/2013/05/healthy_porridge_bowl.jpg")
                .into(imageView_pagi);

        Glide.with(getActivity())
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRbsotHMhNhTLZiCJoqvlfLiertuc8WLaxZ3eVsq6Ip0aIno1YD&usqp=CAU")
                .into(imageView_siang);

        Glide.with(getActivity())
                .load("https://cambridgefoodtour.com/wp-content/uploads/2016/01/cambridge-food-tour-afternoon-tour-smoke-and-ales-1024x768.jpg")
                .into(imageView_sore);

        Glide.with(getActivity())
                .load("https://img.taste.com.au/SN4APRsT/w720-h480-cfill-q80/taste/2017/05/steak-diane-dinner-bowl-126170-2.jpg")
                .into(imageView_malam);



        rvMakanPertama=view.findViewById(R.id.rv_food_hor);

        //linearLayoutManager = new LinearLayoutManager(getActivity());
        //rvMakanPertama.setLayoutManager(linearLayoutManager);

        rvMakanPertama.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));



        makananItems = new ArrayList<>();
        makananItems.add(new MakananItem("Healthy Fresh", "Rp. 10.000", "https://res.cloudinary.com/dk0z4ums3/image/upload/v1514981705/attached_image/ini-makanan-sehat-yang-perlu-dikonsumsi-setiap-hari.jpg"));
        makananItems.add(new MakananItem("Healthy Ready ", "Rp. 18.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTnBGkwFmCYEvP_iI8e2sYgKY7_hxXzG5scdMgqxVGYfn5pnJDV&usqp=CAU"));
        makananItems.add(new MakananItem("Healthy Farm", "Rp. 30.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT1B80S6-V715YaufSWSn90R2ZUqz5tu0jVPiuM37mQZVOMUP1q&usqp=CAU"));
        makananItems.add(new MakananItem("Healthy Nutrition", "Rp. 80.000", "https://bravaradio.com/wp-content/uploads/2016/12/apakah-smoothies-bowl-termasuk-makanan-menyehatkan.jpg"));
        makananItems.add(new MakananItem("Healthy Vitamin", "Rp. 16.000", "https://aseasyasapplepie.com/wp-content/uploads/2018/01/healthy-breakfast-bowl-480x270.jpg"));
        makananItems.add(new MakananItem("Healthy Fresh", "Rp. 18.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRzjE0j5Cp5sN6u137Hv01NKpfsb66W4g1wGMJcxlZeHIfGd1Wm&usqp=CAU"));
        makananItems.add(new MakananItem("Healthy Cheap", "Rp. 18.000", "https://media.suara.com/pictures/970x544/2019/08/22/31943-kreasi-baru-menu-salad-suaracomvessy.jpg"));
        makananItems.add(new MakananItem("Healthy Fresh", "Rp. 19.000", "https://d1bpj0tv6vfxyp.cloudfront.net/polamakansehatbisajadiobatdarahtinggihalodoc.jpg"));
        makananItems.add(new MakananItem("Healthy Nutrition", "Rp. 17.000", "https://aido.id/storage/articles/November2019/plTaElKk2o9mFtRyb2TG.jpg"));
/*
        makananDuaItems = new ArrayList<>();
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));
        makananDuaItems.add(new MakananDuaItem("Food For Lunch", "Rp.20.000",""));

*/
        makananAdapterSatu = new MakananAdapterSatu(makananItems,getActivity());


        /*masukkan ke recyclerview*/
        rvMakanPertama.setAdapter(makananAdapterSatu);

        SliderView sliderView = view.findViewById(R.id.imageSlider);//as recyclerview

        SliderAdapterExample adapter = new SliderAdapterExample(getActivity());//as adapter

        sliderView.setSliderAdapter(adapter);

        //sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();



        return  view;

    }
}
