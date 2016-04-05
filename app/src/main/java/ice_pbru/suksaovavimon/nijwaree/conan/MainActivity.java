package ice_pbru.suksaovavimon.nijwaree.conan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind Widget
        bindwidget();

        buttoncon();







    }// Main Method

    private void buttoncon() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://fonaugust.wordpress.com/2014/05/21/"));

                startActivity(intent);

            }
        });

    }

    private void bindwidget() {
        button = (Button) findViewById(R.id.button);


    }
}// Main Class
