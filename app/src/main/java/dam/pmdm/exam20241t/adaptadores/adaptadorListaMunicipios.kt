package dam.pmdm.exam20241t.adaptadores

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import dam.pmdm.exam20241t.API.Municipio
import dam.pmdm.exam20241t.R

class adaptadorListaMunicipios(
    private var municipios: List<Municipio> = listOf()
) : RecyclerView.Adapter<MunicipioViewHolder>(), Filterable {

    //lista de municpios filtrada por el buscador. Default: igual municipios
    private var listaMunicipiosFiltrada: List<Municipio> = municipios


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MunicipioViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MunicipioViewHolder(layoutInflater.inflate(R.layout.fila_municipios, parent, false))
    }

    override fun getItemCount(): Int = listaMunicipiosFiltrada.size

    override fun onBindViewHolder(holder: MunicipioViewHolder, position: Int) {
    }

    fun changelist(nuevaLista: List<Municipio>) {
        municipios = nuevaLista
        listaMunicipiosFiltrada = nuevaLista
        notifyDataSetChanged()
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filtro = constraint.toString().lowercase().trim()
                listaMunicipiosFiltrada = if (filtro.isEmpty()) {
                    municipios
                } else {
                    municipios.filter { it.NOMBRE.lowercase().contains(filtro) }
                }

                return FilterResults().apply { values = listaMunicipiosFiltrada }
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                listaMunicipiosFiltrada = results?.values as List<Municipio>
                notifyDataSetChanged()
            }
        }
    }
}
