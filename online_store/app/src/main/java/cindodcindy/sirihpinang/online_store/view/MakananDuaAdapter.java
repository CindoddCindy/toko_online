package cindodcindy.sirihpinang.online_store.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import cindodcindy.sirihpinang.online_store.R;

public class MakananDuaAdapter extends RecyclerView.Adapter<MakananDuaAdapter.ChildMakananDua> {

    @NonNull
    @Override
    public ChildMakananDua onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ChildMakananDua holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ChildMakananDua extends RecyclerView.ViewHolder{
        public TextView textView_Nama, textView_harga;
        public ImageView imageView_food;

        public ChildMakananDua(@NonNull View itemView) {
            super(itemView);
            imageView_food=itemView.findViewById(R.id.img_food_vertical);
            textView_Nama=itemView.findViewById(R.id.)

        }
    }
}
