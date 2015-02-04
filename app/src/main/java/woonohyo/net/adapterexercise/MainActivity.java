package woonohyo.net.adapterexercise;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


class MovieData {
    int imgId;
    String movieName;
    String movieActor;

    MovieData(int imgId, String movieName, String movieActor) {
        this.imgId = imgId;
        this.movieName = movieName;
        this.movieActor = movieActor;
    }
}

public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    String[] stringData = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stringData);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.mylist, R.id.textView, stringData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Position: " + position + " " + stringData[position] + " id:" + id, Toast.LENGTH_SHORT).show();
    }
}
