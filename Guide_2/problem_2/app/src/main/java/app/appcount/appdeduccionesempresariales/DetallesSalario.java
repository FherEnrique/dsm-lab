package app.appcount.appdeduccionesempresariales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetallesSalario extends AppCompatActivity {
<<<<<<< HEAD
private TextView nombre,sueldobase,ISS,AFP,RENTA,NETO;

=======
    private TextView nombre,sueldobase,ISS,AFP,RENTA,NETO;
>>>>>>> 092d3cf77150c95af967e7639c3fff864bee3826
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_salario);
<<<<<<< HEAD
       nombre=( TextView )findViewById(R.id.txtnombre);
=======
        nombre=( TextView )findViewById(R.id.txtnombre);
>>>>>>> 092d3cf77150c95af967e7639c3fff864bee3826
        sueldobase=(TextView)findViewById(R.id.txsalbase);
        ISS=(TextView)findViewById(R.id.txisss);
        AFP=(TextView)findViewById(R.id.txafp);
        RENTA=(TextView)findViewById(R.id.txrenta);
        NETO=(TextView)findViewById(R.id.txsuelneto);
        Bundle bundle= getIntent().getExtras();
<<<<<<< HEAD
      nombre.setText("nombre :"+bundle.getString("txtnombre"));
       sueldobase.setText("Sueldo Base: $"+bundle.getString("txtsueldob"));
         ISS.setText("ISSS: $"+bundle.getString("txtISS"));
=======
        nombre.setText("Nombre: "+bundle.getString("txtnombre"));
        sueldobase.setText("Sueldo Base: $"+bundle.getString("txtsueldob"));
        ISS.setText("ISSS: $"+bundle.getString("txtISS"));
>>>>>>> 092d3cf77150c95af967e7639c3fff864bee3826
        AFP.setText("AFP: $"+bundle.getString("txtafp"));
        RENTA.setText("RENTA: $"+bundle.getString("txtrenta"));
        NETO.setText("Sueldo neto: $"+bundle.getString("txtneto"));
    }
    public void regresar(View view){
        Intent o = new Intent(this,MainActivity.class);
        startActivity(o);
    }
}