package dam.pmdm.exam20241t.adaptadores

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import dam.pmdm.exam20241t.Buscador_Fragment
import dam.pmdm.exam20241t.ConfiguradorFragment


class ViewPagerAdapter (activity: AppCompatActivity, var itemsCount: Int) :
    FragmentStateAdapter(activity) {
    private val f1= ConfiguradorFragment()
    private val f2= Buscador_Fragment()

    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment {

        return when(position) {
            0-> f1
            1-> f2
            else -> ConfiguradorFragment()
        }
    }
    fun getFragment(i: Int): Fragment {
        if(i==0)
        return   f1
        else if(i==1)
            return f2
        else
            return f1
    }
}