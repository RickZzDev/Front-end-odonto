package br.senai.sp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import org.jetbrains.anko.doAsync

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCadastrarDentista = findViewById<Button>(R.id.button_cadastrar_dentista)

        doAsync {
            buttonCadastrarDentista.setOnClickListener {
                //Criar um objeto dentista
                val dentista = Dentista()
                dentista.nome = "Dentista do kotlin"
                dentista.cro = "45687987"
                dentista.telefone = "kot@kot.com"

                val URL = "http://10.107.144.3:8080/odonto/dentistas/"

                var json = HttpHelper.post(URL, dentista.toJson())

                
            }
        }
    }
}
