package co.edu.unab.leal.jakson.ruletapp;
import co.edu.unab.leal.jakson.ruletapp.controlador.ControladorNumeroEnJuego;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private static int contNumEnJuego = 1;
    private static int numEnJuego;
    private String separador = "|";
    public static TextView grupo1;
    public static TextView grupo2;
    public static TextView grupo3;
    private TextView contador;
    private TextView listaEnJuego;
    private TextView queNumJuega;
    private Button enviar;
    private EditText obtenerNumero;
    private ArrayList<Integer> enJuego = new ArrayList<>();
    private ControladorNumeroEnJuego objContN = new ControladorNumeroEnJuego();

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.contador = findViewById(R.id.tvContJuego);
        this.listaEnJuego = findViewById(R.id.tvListEnJuego);
        this.queNumJuega = findViewById(R.id.tvCualNum);
        this.obtenerNumero = findViewById(R.id.editText);
        this.enviar = findViewById(R.id.btnEnviar);
        this.grupo1 = findViewById(R.id.tvSet1);
        this.grupo2 = findViewById(R.id.tvSet2);
        this.grupo3 = findViewById(R.id.tvSet3);

        this.queNumJuega.setText("¿Que número esta jugando?");
        this.enviar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String obj = MainActivity.this.obtenerNumero.getText().toString();
                String str = BuildConfig.FLAVOR;
                if (!obj.equals(str)) {
                    numEnJuego = Integer.valueOf(MainActivity.this.obtenerNumero.getText().toString()).intValue();
                    MainActivity.this.mostrarApuesta(MainActivity.numEnJuego);
                    MainActivity.this.obtenerNumero.setText(str);
                    contNumEnJuego++;
                }
            }
        });
    }

    public void mostrarApuesta(int numEnJuego2) {
        this.enJuego.add(Integer.valueOf(numEnJuego2));
        TextView textView = this.contador;
        StringBuilder sb = new StringBuilder();
        sb.append("juego: ");
        sb.append(contNumEnJuego);
        textView.setText(sb.toString());
        String str = "|";
        if (this.enJuego.size() < 9) {
            if (this.enJuego.size() > 1) {
                ControladorNumeroEnJuego controladorNumeroEnJuego = this.objContN;
                ArrayList<Integer> arrayList = this.enJuego;
                controladorNumeroEnJuego.llenarPrimerNumero(( arrayList.get(arrayList.size() - 1)).intValue());
                ControladorNumeroEnJuego controladorNumeroEnJuego2 = this.objContN;
                ArrayList<Integer> arrayList2 = this.enJuego;
                controladorNumeroEnJuego2.llenarSegundoNumero(( arrayList2.get(arrayList2.size() - 2)).intValue());
                if (this.enJuego.size() == 9) {
                    this.objContN.llenarUltimoNumero(( this.enJuego.get(0)).intValue());
                }
            } else {
                ControladorNumeroEnJuego controladorNumeroEnJuego3 = this.objContN;
                ArrayList<Integer> arrayList3 = this.enJuego;
                controladorNumeroEnJuego3.llenarPrimerNumero(( arrayList3.get(arrayList3.size() - 1)).intValue());
            }
            for (int i = 0; i < this.enJuego.size(); i++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(separador);
                sb2.append(this.enJuego.get(i));
                sb2.append(str);
                separador = sb2.toString();
            }
            this.listaEnJuego.setText(separador);
        } else {
            this.objContN.llenarPrimerNumero(( this.enJuego.get(8)).intValue());
            this.objContN.llenarSegundoNumero(( this.enJuego.get(7)).intValue());
            this.objContN.llenarUltimoNumero(( this.enJuego.get(0)).intValue());
            for (int i2 = 0; i2 < this.enJuego.size(); i2++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(separador);
                sb3.append(this.enJuego.get(i2));
                sb3.append(str);
                separador = sb3.toString();
            }
            this.listaEnJuego.setText(separador);
            this.enJuego.remove(0);
        }
        separador = str;
        Collections.sort(ControladorNumeroEnJuego.listaFinal);
        this.objContN.posibilidadDeApuesta(ControladorNumeroEnJuego.listaFinal);
        ControladorNumeroEnJuego.listaFinal.clear();
    }

}
