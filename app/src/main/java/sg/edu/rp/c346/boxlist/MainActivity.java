package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<BoxItem> alBox;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);

        alBox = new ArrayList<>();

        BoxItem b1 = new BoxItem(1);
        BoxItem b2 = new BoxItem(2);
        BoxItem b3 = new BoxItem(3);

        alBox.add(b1);
        alBox.add(b2);
        alBox.add(b3);

        caBox = new CustomAdapter(this, R.layout.box_item, alBox);

        lvBox.setAdapter(caBox);


    }
}
