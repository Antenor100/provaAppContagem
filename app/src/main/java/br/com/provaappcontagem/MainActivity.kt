package br.com.provaappcontagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener {
            val valorAtual = (findViewById<TextView>(R.id.contagemTextPlane)).text.toString().toInt()
            contagemTextPlane.setText((valorAtual + 1).toString())
        }

        buttonSub.setOnClickListener {
            val valorAtual = (findViewById<TextView>(R.id.contagemTextPlane)).text.toString().toInt()
            contagemTextPlane.setText((valorAtual - 1).toString())
        }

        buttonClean.setOnClickListener {
            contagemTextPlane.setText("0")
        }
    }
}