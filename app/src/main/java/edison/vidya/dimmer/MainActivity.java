package edison.vidya.dimmer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1= (LinearLayout) findViewById(R.id.l1);
        b1= (Button) findViewById(R.id.b1);
        b2= (Button) findViewById(R.id.b2);

        b3= (Button) findViewById(R.id.b3);
        b4= (Button) findViewById(R.id.b4);
        b5= (Button) findViewById(R.id.b5);
        b6= (Button) findViewById(R.id.b6);
        b7= (Button) findViewById(R.id.b7);
        b8= (Button) findViewById(R.id.b8);
        b9= (Button) findViewById(R.id.b9);


         b1.setVerticalScrollBarEnabled(true);
        b2.setVerticalScrollBarEnabled(true);
        b3.setVerticalScrollBarEnabled(true);
        b4.setVerticalScrollBarEnabled(true);
        b5.setVerticalScrollBarEnabled(true);
        b6.setVerticalScrollBarEnabled(true);
        b7.setVerticalScrollBarEnabled(true);
        b8.setVerticalScrollBarEnabled(true);
        b9.setVerticalScrollBarEnabled(true);

        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a1);
                return false;
            }
        });

        b2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a2);
                return false;
            }
        });


        b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a3);
                return false;
            }
        });

        b4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a4);
                return false;
            }
        });

        b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a5);
                return false;
            }
        });

        b6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a6);
                return false;
            }
        });

        b7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a7);
                return false;
            }
        });

        b8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a8);
                return false;
            }
        });


        b9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                l1.setBackgroundResource(R.drawable.a9);
                return false;
            }
        });

    }
}
