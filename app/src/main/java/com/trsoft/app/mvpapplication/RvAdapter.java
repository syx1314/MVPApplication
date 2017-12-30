package com.trsoft.app.mvpapplication;

import android.support.annotation.LayoutRes;

import com.trsoft.app.lib.view.recycleview.ViewHolder;
import com.trsoft.app.lib.view.recycleview.adapter.BaseRecycleViewAdapter;

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
