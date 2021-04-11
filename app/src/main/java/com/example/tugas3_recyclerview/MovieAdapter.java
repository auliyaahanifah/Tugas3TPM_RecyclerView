package com.example.tugas3_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private ArrayList<Movie> movies;
    private  Context context;

    public MovieAdapter(ArrayList<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_movie, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Movie movie = movies.get(position);

        Glide.with(holder.itemView.getContext())
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.ivPhoto);
        holder.tv_title.setText(movie.getTitle());
        holder.tv_desc.setText(movie.getDesc());
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send."+ movies.get(holder.getAdapterPosition()).getDesc());
                sendIntent.setType("text/plain");

                context.startActivity(Intent.createChooser(sendIntent,"send to"));
            }
        });

        holder.cvCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent(context, MovieDetail.class);
                sendIntent.putExtra("Movie Title", movie.getTitle());
                sendIntent.putExtra("Director", movie.getDirector());
                sendIntent.putExtra("Release Date", movie.getRelease());
                sendIntent.putExtra("Running Time", movie.getRuningt());
                sendIntent.putExtra("Desc", movie.getDesc());
                sendIntent.putExtra("photo", movie.getPhoto());
                context.startActivity(sendIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title,tv_desc;
        ImageView ivPhoto;
        CardView cvCardView;
        RelativeLayout relativeLayout;
        ImageButton share;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_name);
            tv_desc = itemView.findViewById(R.id.tv_detail);
            ivPhoto = itemView.findViewById(R.id.imgPhoto);
            cvCardView = itemView.findViewById(R.id.cv_cardView);
            relativeLayout = itemView.findViewById(R.id.rRelative);
            share = itemView.findViewById(R.id.Btnshare);
        }
    }
}

