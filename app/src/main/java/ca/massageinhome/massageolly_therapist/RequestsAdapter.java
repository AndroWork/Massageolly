package ca.massageinhome.massageolly_therapist;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RequestsAdapter extends RecyclerView.Adapter<RequestsAdapter.MyViewHolder> {

        private List<Users> usersList;

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
            }
        }


        public RequestsAdapter(List<Users> usersList) {
            this.usersList = usersList;
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
        }

        @Override
        public int getItemCount() {
            return usersList.size();
        }

}
