package ca.massageinhome.massageolly_therapist;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class IntakeForm extends AppCompatActivity implements IntakeFormOne.OnFragmentInteractionListener,FragIntakeFormTwo.OnFragmentInteractionListener,
FragIntakeFormThree.OnFragmentInteractionListener{

    Fragment intake;;
    Fragment intake2;
    Fragment intake3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intake_form);

        intake = new IntakeFormOne();

        FragmentManager manager = this.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.intake_form_group,intake,"Intake Form One");
        transaction.commit();

    }


    @Override
    public void onFragmentInteraction() {
        intake2 = new FragIntakeFormTwo();
        FragmentManager manager2 = getSupportFragmentManager();
        FragmentTransaction transaction2 = manager2.beginTransaction();
        transaction2.addToBackStack("Intake Form One");
        transaction2.replace(R.id.intake_form_group,intake2,"Intake Form Two");
        transaction2.commit();
    }

    @Override
    public void onFragmentInteraction2() {
        intake3 = new FragIntakeFormThree();
        FragmentManager manager3 = getSupportFragmentManager();
        FragmentTransaction transaction3 = manager3.beginTransaction();
        transaction3.addToBackStack("Intake Form Two");
        transaction3.replace(R.id.intake_form_group,intake3,"Intake Form Three");
        transaction3.commit();
    }

    @Override
    public void onFragmentInteraction3() {
        RequestActivity.linear2State = true;
        startActivity(new Intent(IntakeForm.this,RequestActivity.class));
        finish();
    }
}
