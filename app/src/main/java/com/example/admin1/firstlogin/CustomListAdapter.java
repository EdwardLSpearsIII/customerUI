package com.example.admin1.firstlogin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter<activity_customer_home> {

    Context mCtx;
    int resource;
    List<activity_customer_home> list;
    public CustomListAdapter (Context mCtx, int resource, List<activity_customer_home> list) {
        super(mCtx, resource, list);

        this.mCtx = mCtx;
        this.resource = resource;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);

        View view = inflater.inflate(resource, null);
        View v = convertView;

        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in );
        view.startAnimation(animation);

        TextView name = view.findViewById(R.id.name);
        TextView number = view.findViewById(R.id.number);
        TextView email_address = view.findViewById(R.id.email_address);
        ImageView logo = view.findViewById(R.id.logo);

        activity_customer_home activity_customer_home = list.get(position);

        name.setText(activity_customer_home.getName());
        number.setText(activity_customer_home.getNumber());
        email_address.setText(activity_customer_home.getEmail_address());
        logo.setImageDrawable(mCtx.getResources().getDrawable(activity_customer_home.getImage()));

        return view;
    }
}
