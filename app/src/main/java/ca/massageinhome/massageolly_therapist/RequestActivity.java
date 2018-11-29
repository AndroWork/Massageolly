package ca.massageinhome.massageolly_therapist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RequestActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        final LinearLayout linear1 = findViewById(R.id.linear1);
        final LinearLayout linear2 = findViewById(R.id.linear2);

        linear2.setVisibility(View.GONE);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button accept = findViewById(R.id.accept);
        Button decline = findViewById(R.id.decline);

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear1.setVisibility(View.GONE);
                linear2.setVisibility(View.VISIBLE);
            }
        });


    }



}
