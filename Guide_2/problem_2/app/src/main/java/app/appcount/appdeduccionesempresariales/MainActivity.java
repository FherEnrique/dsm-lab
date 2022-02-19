package app.appcount.appdeduccionesempresariales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

<<<<<<< HEAD

public class MainActivity extends AppCompatActivity {


=======
public class MainActivity extends AppCompatActivity {

>>>>>>> 092d3cf77150c95af967e7639c3fff864bee3826
    private EditText Nombre;
    private EditText Horas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        Nombre =(EditText)findViewById(R.id.etname);
        Horas =(EditText)findViewById(R.id.ethour);

    }
    public void segundaactividad(View v){
        Intent i = new Intent(this,DetallesSalario.class);
    int hour;
    double ISS=0,AFP=0,Renta=0,neto=0,sueldobase=0;
    hour=Integer.parseInt(Horas.getText().toString());
    sueldobase=hour*8.50;
    ISS=sueldobase*0.02;
    AFP=sueldobase*0.03;
    Renta=sueldobase*0.04;
    neto=sueldobase-ISS-AFP-Renta;
        i.putExtra("txtnombre",Nombre.getText().toString());
        i.putExtra("txtsueldob",String.valueOf(sueldobase));
       i.putExtra("txtISS",String.valueOf(ISS));
        i.putExtra("txtafp",String.valueOf(AFP));
        i.putExtra("txtrenta",String.valueOf(Renta));
        i.putExtra("txtneto",String.valueOf(neto));

        startActivity(i);


=======
        Nombre =findViewById(R.id.etname);
        Horas =findViewById(R.id.ethour);
    }
    public void segundaactividad(View v){
        Intent i = new Intent(this,DetallesSalario.class);
        int hour;
        double ISS=0,AFP=0,Renta=0,neto=0,sueldobase=0;
        hour=Integer.parseInt(Horas.getText().toString());
        sueldobase=hour*8.50;
        ISS=sueldobase*0.02;
        AFP=sueldobase*0.03;
        Renta=sueldobase*0.04;
        neto=sueldobase-ISS-AFP-Renta;
        i.putExtra("txtnombre",Nombre.getText().toString());
        i.putExtra("txtsueldob",String.valueOf(sueldobase));
        i.putExtra("txtISS",String.valueOf(ISS));
        i.putExtra("txtafp",String.valueOf(AFP));
        i.putExtra("txtrenta",String.valueOf(Renta));
        i.putExtra("txtneto",String.valueOf(neto));
        startActivity(i);
>>>>>>> 092d3cf77150c95af967e7639c3fff864bee3826
    }
}