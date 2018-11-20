package ca.massageinhome.massageolly_therapist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ClientsList extends AppCompatActivity {

    RecyclerView recyclerView ;
    private List<Users> usersList = new ArrayList<>();
    private RequestsAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clients_list);

        recyclerView = findViewById(R.id.recyclerView);
        mAdapter = new RequestsAdapter(usersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Users movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        movie = new Users(R.drawable.profile, "Saharsh Pandey", "Just Me", "Swedish (90 Min)","20 May, 2018, Wed, 4:00 PM to 6:30 PM");
        usersList.add(movie);

        mAdapter.notifyDataSetChanged();

    }
}
