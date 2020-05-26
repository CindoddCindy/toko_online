package cindodcindy.sirihpinang.online_store.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import cindodcindy.sirihpinang.online_store.R;
import cindodcindy.sirihpinang.online_store.model.MakananDuaItem;

public class MakananDuaAdapter extends RecyclerView.Adapter<MakananDuaAdapter.ChildMakananDua> {

    Context context;
    List<MakananDuaItem> makananDuaItemList;

    public MakananDuaAdapter(Context context, List<MakananDuaItem> makananDuaItemList){
        this.context=context;
        this.makananDuaItemList=makananDuaItemList;
    }

    @NonNull
    @Override
    public ChildMakananDua onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View views = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_food_2, null);
        ChildMakananDua childMakananDua=new ChildMakananDua(views);
        return childMakananDua;
    }

    @Override
    public void onBindViewHolder(@NonNull ChildMakananDua holder, int position) {
        holder.textView_Nama.setText(makananDuaItemList.get(position).FoodName);
        holder.textView_harga_2.setText(makananDuaItemList.get(position).FoodPrice);
        Glide.with(context)
                .load(makananDuaItemList.get(position).FoodImage)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.imageView_food_2);


    }

    @Override
    public int getItemCount() {
        return makananDuaItemList.size();
    }

    public class ChildMakananDua extends RecyclerView.ViewHolder{
        public TextView textView_Nama, textView_harga_2;
        public ImageView imageView_food_2;

        public ChildMakananDua(@NonNull View itemView) {
            super(itemView);
            imageView_food_2=itemView.findViewById(R.id.img_food_vertical);
            textView_Nama=itemView.findViewById(R.id.foodNameVer);
            textView_harga_2=itemView.findViewById(R.id.FoodPriVer);

        }
    }
}
