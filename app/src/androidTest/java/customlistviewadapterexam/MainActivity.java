package customlistviewadapterexam;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NgocTri on 11/15/2015.
 */
public class MainActivity extends Activity {
    private ListView lvProduct;
    private NoteListAdapter adapter;
    private List<Note> note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProduct = (ListView)findViewById(R.id.listview_product);

        note = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        note .add(new Note(1, "iPhone4", 200, "Apple iPhone4 16GB"));
        note .add(new Note(3, "iPhone4S", 250, "Apple iPhone4S 16GB"));
        note .add(new Note(4, "iPhone5", 300, "Apple iPhone5 16GB"));
        note .add(new Note(5, "iPhone5S", 350, "Apple iPhone5S 16GB"));
        note .add(new Note(6, "iPhone6", 400, "Apple iPhone6 16GB"));
        note .add(new Note(7, "iPhone6S", 450, "Apple iPhone6S 16GB"));
        note .add(new Note(8, "iPhone7", 500, "Apple iPhone7 16GB"));
        note .add(new Note(9, "iPhone7S", 600, "Apple iPhon7S 16GB"));
        note .add(new Note(10, "iPhone8", 700, "Apple iPhone8 16GB"));
        note .add(new Note(11, "iPhone8S", 800, "Apple iPhone8S 16GB"));

        //Init adapter
        adapter = new NoteListAdapter(getApplicationContext(), note);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Do something
                //Ex: display msg with product id get from view.getTag
                Toast.makeText(getApplicationContext(), "Clicked product id =" + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
