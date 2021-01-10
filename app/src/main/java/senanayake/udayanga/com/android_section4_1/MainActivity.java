package senanayake.udayanga.com.android_section4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view){
        ImageView imageView = findViewById(R.id.imageView2);
//        ImageView imageView2 = findViewById(R.id.imageView3);

//        imageView.animate().translationXBy(1000f).setDuration(2000);
//        imageView.animate().translationXBy(-1000f).setDuration(2000);
//        imageView.animate().translationYBy(-1000f).setDuration(2000);
//        imageView.animate().translationYBy(1000f).setDuration(2000);
//        imageView.animate().rotation(180).setDuration(2000);
//        imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        imageView.animate().translationXBy(1000f)
                            .translationYBy(1000f)
                .rotationBy(360)
                .setDuration(2000);


        imageView.animate().alpha(0f).setDuration(2000);
//        imageView2.animate().alpha(1f).setDuration(2000);

    }


}