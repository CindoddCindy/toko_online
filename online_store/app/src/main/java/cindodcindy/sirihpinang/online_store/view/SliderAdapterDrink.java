package cindodcindy.sirihpinang.online_store.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import cindodcindy.sirihpinang.online_store.R;

public class SliderAdapterDrink extends SliderViewAdapter<SliderAdapterDrink.SliderVhDrink> {
    private Context context;

    public SliderAdapterDrink(Context context){
        this.context=context;
    }



    @Override
    public SliderVhDrink onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_minum,null);

        return  new SliderAdapterDrink.SliderVhDrink(inflate);


    }

    @Override
    public void onBindViewHolder(SliderVhDrink viewHolder, int position) {

        switch (position){
            case 0:
                Glide.with(viewHolder.itemView)
                        .load("https://s24193.pcdn.co/wp-content/uploads/2018/05/ENTITY-Academy-healthy-drinks-bethany-allard-.png")
                        .into(viewHolder.imageViewBackground_drink);
                break;

            case 1:
                Glide.with(viewHolder.itemView)
                        .load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRpUGwWMpAh1-NtsrOuKHYXZs7V9eoSZx7SLCib8m__nnZcMkU9&usqp=CAU")
                        .into(viewHolder.imageViewBackground_drink);
                break;

            case 2:
                Glide.with(viewHolder.itemView)
                        .load("https://dailyburn.com/life/wp-content/uploads/2015/03/The-New-Juicing-2.jpg")
                        .into(viewHolder.imageViewBackground_drink);
                break;

            case 3:
                Glide.with(viewHolder.itemView)
                        .load("https://media.mnn.com/assets/images/2017/05/GlassOrangeJuiceHalvedOrangesBlueBackground.jpg.838x0_q80.jpg")
                        .into(viewHolder.imageViewBackground_drink);
                break;

            case 4:
                Glide.with(viewHolder.itemView)
                        .load("https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2016/05/milkshake.jpg?itok=n_3au7e1")
                        .into(viewHolder.imageViewBackground_drink);
                break;
            case 5:
                Glide.with(viewHolder.itemView)
                        .load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT4rdES0fOAmvJTpCY8r9gxGcntWVUr36hxCOkvRL4NqnrcHqpl&usqp=CAU")
                        .into(viewHolder.imageViewBackground_drink);
                break;
            case 6:
                Glide.with(viewHolder.itemView)
                        .load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQEmeyjNeXI-95VPeQHYP36bGpx7KMCtZqWdQuI0gOVbwvf_RNO&usqp=CAU")
                        .into(viewHolder.imageViewBackground_drink);
                break;
            case 7:
                Glide.with(viewHolder.itemView)
                        .load("https://cdn1-production-images-kly.akamaized.net/AQXr7OxPNGsBxFzKXvx43U85KFY=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2846605/original/095930000_1562474255-iStock-544468096.jpg")
                        .into(viewHolder.imageViewBackground_drink);
                break;

            case 8:
                Glide.with(viewHolder.itemView)
                        .load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSSBtGcj29TaCsNXmIMg61Lg_Cc_9ExPWarqjfClKH9vqwVBsHw&usqp=CAU")
                        .into(viewHolder.imageViewBackground_drink);
                break;




            default:
                Glide.with(viewHolder.itemView)
                        .load("https://upload.wikimedia.org/wikipedia/commons/b/b4/Penyajian_Infused_Water.jpg")
                        .into(viewHolder.imageViewBackground_drink);
                break;

        }


    }

    @Override
    public int getCount() {
        return 10;
    }

    public class SliderVhDrink extends SliderViewAdapter.ViewHolder{
        View itemView;
        ImageView imageViewBackground_drink;


        public SliderVhDrink(View itemView) {
            super(itemView);

            imageViewBackground_drink=itemView.findViewById(R.id.iv_auto_image_slider_drink);
            // textViewDescription=itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView=itemView;
        }
    }
}
