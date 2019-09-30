package de.fschlosser.wortliste;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Word> wordList = Collections.emptyList();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class WordViewHolder extends RecyclerView.ViewHolder{

        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
