package ice_pbru.suksaovavimon.nijwaree.conan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Activity extends AppCompatActivity {

    private TextView titleTextView, detailTextView;
    private ImageView conanImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);

        // bind widget
        bindWidget();

        // Show view
        showView();


    }

    private void showView() {
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.cudo);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(strTitle);
        conanImageView.setImageResource(intIcon);

        String[] srtDetail = getResources().getStringArray(R.array.conan_detail);
        detailTextView.setText(srtDetail[intIndex]);


    }// show view

    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        conanImageView = (ImageView) findViewById(R.id.imageView2);

    }// bind widget
}// main class
