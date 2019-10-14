package com.sravan.abrea;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mPhotoPath = new ArrayList<>();
    private ArrayList<String> mMemberName= new ArrayList<>();
    private ArrayList<String> mPhoneNumber= new ArrayList<>();
    private ArrayList<String> mWhatsappNumber= new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mPhotoPath, ArrayList<String> mMemberName, ArrayList<String> mPhoneNumber, ArrayList<String> mWhatsappNumber, Context mContext) {
        this.mPhotoPath = mPhotoPath;
        this.mMemberName = mMemberName;
        this.mPhoneNumber = mPhoneNumber;
        this.mWhatsappNumber = mWhatsappNumber;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        Glide.with(mContext).asBitmap().load(mPhotoPath.get(position)).placeholder(R.drawable.ic_account_circle_24dp).dontAnimate().into(holder.photo);
        holder.name.setText(mMemberName.get(position));
        holder.phone.setText(mPhoneNumber.get(position));
        holder.whatsapp.setText(mWhatsappNumber.get(position));
    }

    @Override
    public int getItemCount() {
        return mPhotoPath.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView photo;
        TextView name;
        TextView   phone;
        TextView whatsapp;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.photo);
            name = itemView.findViewById(R.id.name);
            phone = itemView.findViewById(R.id.phone);
            whatsapp = itemView.findViewById(R.id.whatsapp);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }

}
