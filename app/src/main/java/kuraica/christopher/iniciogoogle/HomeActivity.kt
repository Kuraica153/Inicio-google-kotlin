package kuraica.christopher.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bundle = intent.extras

        val nombre = bundle?.getString("nombre")
        val email = bundle?.getString("email")

        val tvNombre = findViewById<TextView>(R.id.display_name)
        val tvEmail = findViewById<TextView>(R.id.email)

        tvNombre.text = nombre
        tvEmail.text = email

        val sign_out_button = findViewById<Button>(R.id.sign_out_button)

        sign_out_button.setOnClickListener {
            finish()
        }

    }
}