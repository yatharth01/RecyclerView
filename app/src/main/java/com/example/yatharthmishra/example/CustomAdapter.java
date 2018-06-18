package com.example.yatharthmishra.example;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    ArrayList personNames;
    Context context;
    ArrayList age;
    ArrayList address;
    ArrayList ID;
    public CustomAdapter(Context context, ArrayList personNames,ArrayList age,ArrayList address,ArrayList ID) {
        this.address = address;
        this.context = context;
        this.personNames = personNames;
        this.age = age;
        this.ID = ID;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final CharSequence message;
        final CharSequence message2;
        holder.name.setText((CharSequence) personNames.get(position));
        holder.age.setText((CharSequence) age.get(position));
        holder.address.setText((CharSequence) address.get(position));
        holder.ID.setText((CharSequence) ID.get(position));

        message = (CharSequence)(personNames.get(position));
        message2 =  (CharSequence)(age.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Toast toast;
                toast = Toast.makeText(context, message  + " , age :" + message2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
    @Override
    public int getItemCount() {
        return personNames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView age;
        TextView address;
        TextView ID;
        public MyViewHolder(View itemView) {
            super(itemView);

            name =  itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            address = itemView.findViewById(R.id.address);
            ID = itemView.findViewById(R.id.ID);

        }
    }
}