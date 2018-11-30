package ca.massageinhome.massageolly_therapist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NewFragment extends Fragment{
    RecyclerView recyclerView ;
    private List<Users> usersList = new ArrayList<>();
    private RequestsAdapter mAdapter;
    public NewFragment()
    {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragmentnew, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);
        mAdapter = new RequestsAdapter(usersList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);


        prepareMovieData();
        return v;
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
