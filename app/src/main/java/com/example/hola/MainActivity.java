package com.example.hola;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    ImageButton arriba,abajo,izquierda,derecha;
   /* FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference firebaseBDD = database.getReference("message");*/
    private DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arriba = (ImageButton) findViewById(R.id.BotonArriba);
        abajo = (ImageButton) findViewById(R.id.BotonAbajo);
        izquierda = (ImageButton) findViewById(R.id.BotonIzquierda);
        derecha = (ImageButton) findViewById(R.id.BotonDerecha);

        arriba.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== MotionEvent.ACTION_DOWN)
                {
                    Log.d("MainActivity","DOWN");
                    myRef = FirebaseDatabase.getInstance().getReference();
                    myRef.child("controlink").child("jugadoruno").child("arriba").setValue("1");
                }
                else if (event.getAction()== MotionEvent.ACTION_UP)
                {
                    Log.d("MainActivity","UP");
                    myRef = FirebaseDatabase.getInstance().getReference();
                    myRef.child("controlink").child("jugadoruno").child("arriba").setValue("0");
                }
                return false;
            }
        });
        abajo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== MotionEvent.ACTION_DOWN)
                {
                    myRef = FirebaseDatabase.getInstance().getReference();
                    myRef.child("controlink").child("jugadoruno").child("abajo").setValue("1");
                }
                else if (event.getAction()== MotionEvent.ACTION_UP)
                {
                    myRef = FirebaseDatabase.getInstance().getReference();
                    myRef.child("controlink").child("jugadoruno").child("abajo").setValue("0");
                }
                return false;
            }
        });
        izquierda.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== MotionEvent.ACTION_DOWN)
                {
                    myRef = FirebaseDatabase.getInstance().getReference();
                    myRef.child("controlink").child("jugadoruno").child("izquierda").setValue("1");
                }
                else if (event.getAction()== MotionEvent.ACTION_UP)
                {
                    myRef = FirebaseDatabase.getInstance().getReference();
                    myRef.child("controlink").child("jugadoruno").child("izquierda").setValue("0");
                }
                return false;
            }
        });
        derecha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()== MotionEvent.ACTION_DOWN)
                {
                    myRef = FirebaseDatabase.getInstance().getReference();
                    myRef.child("controlink").child("jugadoruno").child("derecha").setValue("1");
                }
                else if (event.getAction()== MotionEvent.ACTION_UP)
                {
                    myRef = FirebaseDatabase.getInstance().getReference();
                    myRef.child("controlink").child("jugadoruno").child("derecha").setValue("0");
                }
                return false;
            }
        });

    }






}