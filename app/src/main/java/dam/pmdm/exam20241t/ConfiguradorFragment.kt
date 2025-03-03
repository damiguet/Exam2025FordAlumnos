package dam.pmdm.exam20241t

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class ConfiguradorFragment : Fragment() {

    private lateinit var listaProvincias: Array<Provincia>




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_configurador, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       listaProvincias=generadorProvincias()

    }


    private fun generadorProvincias(): Array<Provincia> {
        return arrayOf(
            Provincia("15", "A Coruña"),
            Provincia("03", "Alacant/Alicante"),
            Provincia("02", "Albacete"),
            Provincia("04", "Almería"),
            Provincia("01", "Araba/Álava"),
            Provincia("33", "Asturias"),
            Provincia("05", "Ávila"),
            Provincia("06", "Badajoz"),
            Provincia("08", "Barcelona"),
            Provincia("48", "Bizkaia"),
            Provincia("09", "Burgos"),
            Provincia("10", "Cáceres"),
            Provincia("11", "Cádiz"),
            Provincia("39", "Cantabria"),
            Provincia("12", "Castelló/Castellón"),
            Provincia("51", "Ceuta"),
            Provincia("13", "Ciudad Real"),
            Provincia("14", "Córdoba"),
            Provincia("16", "Cuenca"),
            Provincia("20", "Gipuzkoa"),
            Provincia("17", "Girona"),
            Provincia("18", "Granada"),
            Provincia("19", "Guadalajara"),
            Provincia("21", "Huelva"),
            Provincia("22", "Huesca"),
            Provincia("07", "Illes Balears"),
            Provincia("23", "Jaén"),
            Provincia("26", "La Rioja"),
            Provincia("35", "Las Palmas"),
            Provincia("24", "León"),
            Provincia("25", "Lleida"),
            Provincia("27", "Lugo"),
            Provincia("28", "Madrid"),
            Provincia("29", "Málaga"),
            Provincia("52", "Melilla"),
            Provincia("30", "Murcia"),
            Provincia("31", "Navarra"),
            Provincia("32", "Ourense"),
            Provincia("34", "Palencia"),
            Provincia("36", "Pontevedra"),
            Provincia("37", "Salamanca"),
            Provincia("38", "Santa Cruz de Tenerife"),
            Provincia("40", "Segovia"),
            Provincia("41", "Sevilla"),
            Provincia("42", "Soria"),
            Provincia("43", "Tarragona"),
            Provincia("44", "Teruel"),
            Provincia("45", "Toledo"),
            Provincia("46", "València/Valencia"),
            Provincia("47", "Valladolid"),
            Provincia("49", "Zamora"),
            Provincia("50", "Zaragoza")
        )

    }




}