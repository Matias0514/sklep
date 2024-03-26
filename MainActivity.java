package com.example.aplikacja_sklep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //zmienne które są by użyć listenera
    ImageView imageView1 = (ImageView) findViewById(R.id.imageView3);
    ImageView imageView2 = (ImageView) findViewById(R.id.imageView);
    ImageView imageView3 = (ImageView) findViewById(R.id.imageView2);
 
    //listener wywołuje funcje która tworzy intent gdzie MainActivityAfter jest to strona docelowa
    imageView1.setOnClickListener(new OnClickListener() {onClickChangeView(MainActivity.this)});
    public void onClickChangeView(View v,MainActivityAfter) {
        Intent intent = new Intent(this,MainActivityAfter.class);
        startActivity(intent);
        CustomIntent.customType(MainActivity.this , "right-to-left");}

}
