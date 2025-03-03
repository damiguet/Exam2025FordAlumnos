package dam.pmdm.exam20241t

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetalleMunicipioActivity : AppCompatActivity() {

    private lateinit var cielo: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_municipio)
    }



    private fun recopilarInfoMunicipio(municipioCodigo: String?) {

    }

    private fun cargarImagenes() {
        if (cielo.text.contains("Tormenta", ignoreCase = true)) {

        } else if (cielo.text.contains(
                "Nuboso",
                ignoreCase = true
            ) || cielo.text.contains("Cubierto", ignoreCase = true)
        ) {

        } else if (cielo.text.contains("lluvia", ignoreCase = true)) {

        } else {
            //sol
        }
    }
}