package com.yg.yourexhibit.Adapter.Home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.RequestManager;
import com.yg.yourexhibit.Datas.TabGoingData;
import com.yg.yourexhibit.R;

import java.util.ArrayList;

/**
 * Created by 2yg on 2017. 10. 9..
 */

public class TabGoingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<TabGoingData> goingResult;
    private RequestManager requestManager;
    private View.OnClickListener onItemClick = null;

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;



    public TabGoingAdapter(ArrayList<TabGoingData> goingResult, RequestManager requestManager, View.OnClickListener onItemClick) {
        this.goingResult = goingResult;
        this.requestManager = requestManager;
        this.onItemClick = onItemClick;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == TYPE_HEADER) {
            //View itemView = LayoutInflater.from (parent.getContext()).inflate (R.layout.tab_home_items_header, parent, false);
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab_home_items_header, parent,false);
            HomeHeaderViewHolder viewHolder = new HomeHeaderViewHolder(itemView);

            return viewHolder;
        }else if(viewType == TYPE_ITEM){
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tab_home_going_items, parent,false);
            TabGoingViewHolder viewHolder = new TabGoingViewHolder(itemView);

            itemView.setOnClickListener(onItemClick);

            return viewHolder;
        }
        return null;
    }

    public RecyclerView.ViewHolder getViewHolder(View view){
        return new HomeHeaderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if(holder instanceof HomeHeaderViewHolder) {
            HomeHeaderViewHolder headerViewHolder = (HomeHeaderViewHolder) holder;

        }else if(holder instanceof TabGoingViewHolder) {
            TabGoingViewHolder tabGoingViewHolder = (TabGoingViewHolder) holder;
            requestManager
                    .load(goingResult.get(position-1).getExhibitImage())
                    .centerCrop()
                    .into(tabGoingViewHolder.goingItemImage);

            tabGoingViewHolder.goingItemPerioid.setText(goingResult.get(position-1).getExhibitPeriod());
            tabGoingViewHolder.goingItemName.setText(goingResult.get(position-1).getExhibitName());

        }
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0) {
            return TYPE_HEADER;
        }
        return TYPE_ITEM;
    }

    @Override
    public int getItemCount() {
        return (goingResult != null) ? goingResult.size() + 1:0;

    }
}
