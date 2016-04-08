package ice_pbru.suksaovavimon.nijwaree.conan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private Button button;

    private ListView conanListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind Widget
        bindwidget();

        buttoncon();

        creatlistView();







    }// Main Method

    private void creatlistView() {
        final int [] intIcon = {R.drawable.cudo,R.drawable.conan,R.drawable.morirun,R.drawable.mori,R.drawable.heyji,R.drawable.kasiha,R.drawable.arumi,R.drawable.hibara,R.drawable.mishihiko,R.drawable.kenta,R.drawable.akasa,R.drawable.kids,R.drawable.sonoko,R.drawable.mengure,R.drawable.sato,R.drawable.jody,R.drawable.usaku,R.drawable.ukiko,R.drawable.belmot,R.drawable.kisaki};

        final String[] titleString = new String[20];
        titleString[0] = "Jimmy Kudo";
        titleString[1] = "Conan Edogawa";
        titleString[2] = "Rachel Moore";
        titleString[3] = "Richard Moore";
        titleString[4] = "Harley Hartwell";
        titleString[5] = "Kirsten Thomas";
        titleString[6] = "Amy Yeager";
        titleString[7] = "Anita Hailey";
        titleString[8] = "Mitch Tennison";
        titleString[9] = "George Kaminski";
        titleString[10] = "Herschel Agasa";
        titleString[11] = "Phantom Thief Kid";
        titleString[12] = "Serena Sebastian";
        titleString[13] = "Joseph Meguire";
        titleString[14] = "Sato Miwako";
        titleString[15] = "Jodie Starling";
        titleString[16] = "Booker Kudo";
        titleString[17] = "Vivian Kudo";
        titleString[18] = "Vermouth";
        titleString[19] = "Eva Kadan";


        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleString, detailStrings);
        conanListView.setAdapter(myAdapter);

    }

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
        conanListView = (ListView) findViewById(R.id.listView);




    }
}// Main Class
