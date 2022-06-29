package com.example.tugaspertemuan2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugaspertemuan2.databinding.ItemContentListBinding;

import java.util.List;

public class ContentListAdapter extends RecyclerView.Adapter<ContentListAdapter.ViewHolder> {

    private final List<String> contentItems;

    public ContentListAdapter(List<String> contentItems) {
        this.contentItems = contentItems;
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

        void bind(String contentListItems) {
            binding.tvContentTitle.setText(contentListItems);
        }
    }
}
