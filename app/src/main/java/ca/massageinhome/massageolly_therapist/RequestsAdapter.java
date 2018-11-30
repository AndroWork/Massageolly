package ca.massageinhome.massageolly_therapist;


<<<<<<< HEAD
=======
import android.app.Activity;
>>>>>>> 49e2216f9e6fc10d5a69d285c05b527c40a7799b
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RequestsAdapter extends RecyclerView.Adapter<RequestsAdapter.MyViewHolder> {

        private List<Users> usersList;
        private Activity activity;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView name, type, category, time;
            public CircleImageView image;

            public MyViewHolder(View view) {
                super(view);
                name = (TextView) view.findViewById(R.id.user_name);
                type = (TextView) view.findViewById(R.id.user_type);
                category = (TextView) view.findViewById(R.id.user_category);
                time = (TextView) view.findViewById(R.id.user_time);
                image = view.findViewById(R.id.user_profile);

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        RequestActivity.linear2State = false;
                        activity.startActivity(new Intent(activity,RequestActivity.class));
                    }
                });
            }
        }


        public RequestsAdapter(List<Users> usersList,Activity activity) {
            this.usersList = usersList;
            this.activity = activity;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.all_request_layout, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Users users = usersList.get(position);
            holder.name.setText(users.getName());
            holder.type.setText(users.getType());
            holder.category.setText(users.getCategory());
            holder.time.setText(users.getTime());
            holder.image.setImageResource(users.getImage());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    
                }
            });
        }

        @Override
        public int getItemCount() {
            return usersList.size();
        }

}
