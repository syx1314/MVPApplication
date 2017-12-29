package com.trsoft.app.mvpapplication;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yyj on 2017/12/29.
 */

public class RvAdapter extends BaseRecycleViewAdapter<String> {


    public RvAdapter(List<String> mdatas,@LayoutRes int resLayoutId) {
        super(mdatas,resLayoutId);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setText(R.id.tv_content,"位置"+position);
    }

}
