package edu.udayton.homeworkout;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Picture extends AppCompatActivity {

    public static final String ID_KEY = "RES_ID", LBL_KEY = "LABEL", DES_KEY = "DESCRIPTION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        //get the extras from the Intent
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras !=null)
        {
            //get the string extra with key = LBL_KEY
            final String res_label = extras.getString(LBL_KEY);
            final String rdes_label = extras.getString(DES_KEY);
            //display the labelString in the titleTextView

            final TextView pictureTitle = (TextView)findViewById(R.id.titleTextView);
            pictureTitle.setText(res_label);
            final TextView pictureDescription = (TextView)findViewById(R.id.descriptionTextView);
            pictureDescription.setText(rdes_label);
            //get the String extra with key = ID_KEY

            String image_id = extras.getString(ID_KEY);

            //Convert the resource ID from String to integer value
            int imageId = Integer.parseInt(image_id);
            /*
                in the pictureImageView;
                    1. Display the image with imageId resource id.
                    2. Change the content description to the res_ label String.
             */
            TextView mTextView = (TextView) findViewById(R.id.description);

            final ImageView picture = (ImageView)findViewById(R.id.pictureImageView);
            picture.setImageResource(imageId);
            picture.setContentDescription(res_label);
            Button butn=(Button)findViewById(R.id.button);
            View.OnClickListener listener=new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent in=null;
                    if(res_label.equals(getString(R.string.txtPush)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=IODxDxX7oi4"));
                    }
                    else if(res_label.equals(getString(R.string.txtPlank)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TvxNkmjdhMM"));
                    }
                    else if(res_label.equals(getString(R.string.txtGlute)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8bbE64NuDTU"));
                    }
                    else if(res_label.equals(getString(R.string.txtSpider)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=vCMOt_8ZSg4"));
                    }
                    else if(res_label.equals(getString(R.string.txtPlankTap)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hEGUul8mWnU"));
                    }
                    else if(res_label.equals(getString(R.string.txtSquat)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mGvzVjuY8SY"));
                    }
                    else if(res_label.equals(getString(R.string.txtside)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=FUX6Pz8vV0s"));
                    }
                    else if(res_label.equals(getString(R.string.txtsqjump)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CVaEhXotL7M"));
                    }
                    else if(res_label.equals(getString(R.string.txtJumping)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=y7Iug7eC0dk"));
                    }
                    else if(res_label.equals(getString(R.string.txtSingle)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5oiKWA-K6-g"));
                    }
                    else if(res_label.equals(getString(R.string.txtSidePlank)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=K2VljzCC16g"));
                    }
                    else if(res_label.equals(getString(R.string.txtHipRaise)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fDP6O_aJpDg"));
                    }
                    else if(res_label.equals(getString(R.string.txtFloorYTIRaises)))
                    {
                        in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xvLm_llzkCE"));
                    }
                    startActivity(in);
                }
            };

            butn.setOnClickListener(listener);
        }
    }//end of onCreate method
}// end of picture class
