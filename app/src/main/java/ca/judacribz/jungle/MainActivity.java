package ca.judacribz.jungle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Jungle jungle = new Jungle(100, 3, 2);
        for (int i = 0; i < 100; i++) {
            jungle.randomActivity();
        }
    }
}
