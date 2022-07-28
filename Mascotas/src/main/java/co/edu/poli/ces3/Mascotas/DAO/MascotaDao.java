package co.edu.poli.ces3.Mascotas.DAO;

import co.edu.poli.ces3.Mascotas.Models.Mascota;

import java.util.List;

public interface MascotaDao {

    List<Mascota> getMascotas();

    Mascota getMascota(int id);

    Mascota createMascota(Mascota mascota);

    Mascota updateMascota(int id, Mascota mascota);

    Mascota deleteMascota(int id);
}