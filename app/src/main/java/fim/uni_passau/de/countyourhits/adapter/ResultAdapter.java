package fim.uni_passau.de.countyourhits.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import fim.uni_passau.de.countyourhits.R;
import fim.uni_passau.de.countyourhits.model.ResultResponse;

/**
 * Created by Nahid 002345 on 6/21/2017.
 */

public class ResultAdapter extends  RecyclerView.Adapter<ResultAdapter.ViewHolder>  {
    private List<ResultResponse> data;

    public ResultAdapter(List<ResultResponse> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_result_data, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        /*Glide.with(holder.itemView.getContext())
                .load(Helper.stringToBitmap(data.get(position).getImgBlob()))
                .into(holder.image);*/

        Glide.with(holder.itemView.getContext())
                .load(R.drawable.ic_launcher)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}