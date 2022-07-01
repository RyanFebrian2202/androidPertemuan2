package com.example.tugaspertemuan2.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tugaspertemuan2.data.remotes.ContentListItem;
import com.example.tugaspertemuan2.databinding.ItemContentListBinding;

import java.util.List;

public class ContentListAdapter extends RecyclerView.Adapter<ContentListAdapter.ViewHolder> {

    private final List<ContentListItem> contentItems;

    public ContentListAdapter(List<ContentListItem> contentItems) {
        this.contentItems = contentItems;
    }

    OnItemClickCallback mOnItemClickCallback;

    public void setmOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.mOnItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContentListBinding binding = ItemContentListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(contentItems.get(position));
        holder.binding.ibSave.setOnClickListener(view -> {
            mOnItemClickCallback.onInsertClick(contentItems.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return contentItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ItemContentListBinding binding;

        public ViewHolder(@NonNull ItemContentListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(ContentListItem contentListItems) {
            binding.tvContentTitle.setText(contentListItems.getName());
            Glide.with(binding.getRoot()).load(contentListItems.getLogo()).into(binding.ivLogo);
        }
    }

    public interface OnItemClickCallback {
        void onInsertClick(ContentListItem contentListItem);
    }
}
