package dam.pmdm.exam20241t

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dam.pmdm.exam20241t.adaptadores.adaptadorListaMunicipios



class Buscador_Fragment : Fragment() {
    private lateinit var recy: RecyclerView
    val adaptadorRecyclerView = adaptadorListaMunicipios()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buscador, container, false)
    }

    private fun busquedaMunicipios() {
    }


    private fun filtrarMunicipios(query: String) {
        adaptadorRecyclerView.filter.filter(query)
    }


}