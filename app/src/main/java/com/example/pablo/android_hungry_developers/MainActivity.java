package com.example.pablo.android_hungry_developers;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ut0, ut1, ut2, ut3, ut4;
    private ImageView Developer0, Developer1, Developer2, Developer3, Developer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ut0 = findViewById(R.id.spoon_0);
        ut1 = findViewById(R.id.spoon_1);
        ut2 = findViewById(R.id.spoon_2);
       ut3 = findViewById(R.id.spoon_3);
        ut4 = findViewById(R.id.spoon_4);

        Developer0 = findViewById(R.id.dev_0);
        Developer1 = findViewById(R.id.dev_1);
        Developer2 = findViewById(R.id.dev_2);
        Developer3 = findViewById(R.id.dev_3);
        Developer4 = findViewById(R.id.dev_4);


        Spoon spoon1 = new Spoon(1);
        Spoon spoon2 = new Spoon(2);
        Spoon spoon3 = new Spoon(3);
        Spoon spoon4 = new Spoon(4);
        Spoon spoon5 = new Spoon(5);

        Developer dev1 = new Developer(1, spoon0, spoon1);
        new Thread(dev1).start();
        Developer dev2 = new Developer(2, spoon1, spoon2);
        new Thread(dev2).start();
        Developer dev3 = new Developer(3, spoon2, spoon3);
        new Thread(dev3).start();
        Developer dev4 = new Developer(4, spoon3, spoon4);
        new Thread(dev4).start();
        Developer dev0 = new Developer(0, spoon4, spoon0);
        new Thread(dev0).start();
}
}
