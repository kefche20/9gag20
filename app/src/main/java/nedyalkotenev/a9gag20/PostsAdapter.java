package nedyalkotenev.a9gag20;

/**
 * Created by kefch_000 on 3/11/2018.
 */

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class PostsAdapter extends RecyclerView.Adapter<ItemViewholder> {

    private List<Post> data;

    public PostsAdapter(List<Post> data) {
        this.data = data;
    }

    @Override
    public ItemViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.posts_view, parent, false);
        ItemViewholder vh = new ItemViewholder(view);
        return vh;
//        RecyclerView.ViewHolder vh = new RecyclerView.ViewHolder() {
//        }
        //return null;
    }


    @Override
    public void onBindViewHolder(ItemViewholder holder, int position) {
        Post item = data.get(position);
        // holder.title.setText(item.getTitle());
        holder.setData(item);
        // ((TextView) holder.itemView.findViewById(R.id.title)).setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
