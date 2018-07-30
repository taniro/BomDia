package br.ufrn.eaj.tads.bomdia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = findViewById(R.id.texto);
        texto.setText("Bom dia!");

        EditText palavra = findViewById(R.id.palavra);
        palavra.setText("Edit");

        texto.setText(palavra.getText().toString());

        Button btLogin = findViewById(R.id.button);

        /**********************************************
        * MANEIRA 1
         */
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implementar
            }
        });
        /**********************************************

        /********************************************
         * MANEIRA 2
         */
        //btLogin.setOnClickListener(meuListener);

        /*********************************************/

        

    }

    /********************************************
     * MANEIRA 2
     */
    private View.OnClickListener meuListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //implementar
        }
    };
    /*********************************************/


}
