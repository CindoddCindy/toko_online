package cindodcindy.sirihpinang.online_store.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cindodcindy.sirihpinang.online_store.R;
import cindodcindy.sirihpinang.online_store.model.MakananItem;

public class MakananAdapterSatu extends RecyclerView.Adapter<MakananAdapterSatu.MakananSatuChild> {

    private List<MakananItem> makananItems;
    private Context context;
    public MakananAdapterSatu(List<MakananItem> makananItems,Context context){
        this.makananItems=makananItems;
        this.context=context;

    }

    public MakananAdapterSatu(FragmentActivity activity, List<MakananItem> makananItems) {

    }

    @NonNull
    @Override
    public MakananSatuChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.makanan_adapter, null);
        MakananSatuChild makananSatuChild=new MakananSatuChild(view);
        return makananSatuChild;

        }

    @Override
    public void onBindViewHolder(@NonNull MakananSatuChild holder, int position) {
        holder.textView_nama.setText(makananItems.get(position).strNama);
        holder.textView_harga.setText(makananItems.get(position).strHarga);
        Glide.with(context)
                .load(makananItems.get(position).strgambar)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.imageView_makanan);


    }

    @Override
    public int getItemCount() {
        return makananItems.size();
    }

    public class MakananSatuChild extends RecyclerView.ViewHolder{
        public TextView textView_nama, textView_harga;
        public ImageView imageView_makanan;

        public MakananSatuChild(@NonNull View itemView) {
            super(itemView);
            textView_nama=itemView.findViewById(R.id.nama_makanan_satu);
            textView_harga=itemView.findViewById(R.id.harga_makanan_satu);
            imageView_makanan=itemView.findViewById(R.id.img_food_horizontal);
        }
    }
}
