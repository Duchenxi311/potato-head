package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
    }

    public void check(View view, ImageView img){
        if(view.VISIBLE==img.getVisibility()){
            img.setVisibility(View.GONE);
        }else{
            img.setVisibility(View.VISIBLE);
        }
    }

    public void cbMouth(View view){
        check(view, mouth);
    }
    public void cbArms(View view){
        check(view, arms);
    }
    public void cbEars(View view){
        check(view, ears);
    }
    public void cbEyebrows(View view){
        check(view, eyebrows);
    }
    public void cbEyes(View view){
        check(view, eyes);
    }
    public void cbGlasses(View view){
        check(view, glasses);
    }
    public void cbHat(View view){
        check(view, hat);
    }
    public void cbMustache(View view){
        check(view, mustache);
    }
    public void cbNose(View view){
        check(view, nose);
    }
    public void cbShoes(View view){
        check(view, shoes);
    }

}
