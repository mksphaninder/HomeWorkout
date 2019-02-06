package edu.udayton.homeworkout;

import android.app.ListActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Convert string array attraction to a list

        List<String> workouts =
                Arrays.asList(getResources().getStringArray(R.array.Workouts));

        //inflate the GUI with the Attractions list

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,
                R.id.exercise, workouts));


    }

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        Intent intent = null;
        TextView description = (TextView)findViewById(R.id.description);
        switch(position)
        {
            case 0:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtPush));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.pushup));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instPush));

                break;
            case 1:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtPlank));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.plank));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instPlank));

                break;
            case 2:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtGlute));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instGlute));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.glutebridge));

                break;
            case 3:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtSpider));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.spiderlunge));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instSpider));
                break;
            case 4:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtPlankTap));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.planktap));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instPlankTap));
                break;
            case 5:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtSquat));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.aquat));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instSquat));
                break;
            case 6:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtside));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.sidelunges));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instSide));
                break;
            case 7:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtsqjump));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.squatjump));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instSqJmp));
                break;
            case 8:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtJumping));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.jumpinglunge));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instJmpLung));
                break;
            case 9:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtSingle));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.singlelegdeadlift));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instSingle));
                break;
            case 10:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtSidePlank));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.sideplank));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instSidePlank));
                break;
            case 11:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtHipRaise));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.hipraise));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instHipRaise));
                break;
            case 12:
                intent = new Intent(MainActivity.this, Picture.class);
                intent.putExtra(Picture.LBL_KEY, getResources().getString(R.string.txtFloorYTIRaises));
                intent.putExtra(Picture.ID_KEY, Integer.toString(R.drawable.floor));
                intent.putExtra(Picture.DES_KEY, getResources().getString(R.string.instFloorYTIRaises));
                break;
            default:
                Toast toast = Toast.makeText(MainActivity.this,
                        "Invalid Choice Mode", Toast.LENGTH_LONG);
                toast.show();
        }//end switch

        //start the activity via intent

        startActivity(intent);
    }//end onListItemClick method
}

