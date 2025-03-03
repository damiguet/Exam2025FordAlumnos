package dam.pmdm.exam20241t.sqlite

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import dam.pmdm.exam20241t.API.Municipio

@Dao
interface FavoritosDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insert(fav: Municipio): Long
    @Delete
    fun delete(fav: Municipio)
}
