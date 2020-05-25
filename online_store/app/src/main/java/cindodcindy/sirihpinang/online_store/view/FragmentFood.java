package cindodcindy.sirihpinang.online_store.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cindodcindy.sirihpinang.online_store.R;
import cindodcindy.sirihpinang.online_store.model.MakananItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFood extends Fragment {
    private List<MakananItem> makananItems;
    private RecyclerView rvMakanPertama;
    private LinearLayoutManager linearLayoutManager;
    private  MakananAdapterSatu makananAdapterSatu;


    public FragmentFood() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view =inflater.inflate(R.layout.fragment_food, container, false);

        rvMakanPertama=view.findViewById(R.id.rv_food_hor);

        //linearLayoutManager = new LinearLayoutManager(getActivity());
        //rvMakanPertama.setLayoutManager(linearLayoutManager);

        rvMakanPertama.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));




        makananItems = new ArrayList<>();
        makananItems.add(new MakananItem(" Vegetable Healthy Fresh", "Rp. 10.000", "https://res.cloudinary.com/dk0z4ums3/image/upload/v1514981705/attached_image/ini-makanan-sehat-yang-perlu-dikonsumsi-setiap-hari.jpg"));
        makananItems.add(new MakananItem("Vegetable Healthy Ready ", "Rp. 18.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTnBGkwFmCYEvP_iI8e2sYgKY7_hxXzG5scdMgqxVGYfn5pnJDV&usqp=CAU"));
        makananItems.add(new MakananItem("Vegetable Healthy Farm", "Rp. 30.000", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT1B80S6-V715YaufSWSn90R2ZUqz5tu0jVPiuM37mQZVOMUP1q&usqp=CAU"));
        makananItems.add(new MakananItem("Vegetable Healthy Nutrition", "Rp. 80.000", "https://bravaradio.com/wp-content/uploads/2016/12/apakah-smoothies-bowl-termasuk-makanan-menyehatkan.jpg"));
        makananItems.add(new MakananItem("Vegetable Healthy Vitamin", "Rp. 16.000", "https://lh3.googleusercontent.com/proxy/xerEb-DTbkpiqg8PZgfKQX_NgPnMM5RpsW1wr6hCpv_LLLROpmZZGCSjI2uPcaTTAbkYwnnpZVzeR0tAsyxJ2i65MqfDW3snuc3fZdj_M2ezOF6inbsqz3frJi0DFTA"));
        makananItems.add(new MakananItem("Vegetable Healthy Fresh", "Rp. 18.000", "https://cdns.klimg.com/merdeka.com/i/w/news/2020/03/27/1160743/540x270/8-makanan-sehat-dan-enak-yang-wajib-dicoba-saat-isolasi-diri.jpg"));
        makananItems.add(new MakananItem("Vegetable Healthy Cheap", "Rp. 18.000", "https://media.suara.com/pictures/970x544/2019/08/22/31943-kreasi-baru-menu-salad-suaracomvessy.jpg"));
        makananItems.add(new MakananItem("Vegetable Healthy Fresh", "Rp. 19.000", "https://d1bpj0tv6vfxyp.cloudfront.net/polamakansehatbisajadiobatdarahtinggihalodoc.jpg"));
        makananItems.add(new MakananItem("Vegetable Healthy Nutrition", "Rp. 17.000", "https://aido.id/storage/articles/November2019/plTaElKk2o9mFtRyb2TG.jpg"));


        makananAdapterSatu = new MakananAdapterSatu(makananItems,getActivity());
        /*masukkan ke recyclerview*/
        rvMakanPertama.setAdapter(makananAdapterSatu);
        return  view;

    }
}
