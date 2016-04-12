package cirvirlab.androiddynamicallychangefragmentexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Configuration configuration = getResources().getConfiguration();
        if(configuration.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Landscape landscape = new Landscape();
            fragmentTransaction.replace(android.R.id.content,landscape);
        }
        else
        {
            Portrait portrait = new Portrait();
            fragmentTransaction.replace(android.R.id.content,portrait);
        }
        fragmentTransaction.commit();
  //      setContentView(R.layout.activity_main);

    }

}
