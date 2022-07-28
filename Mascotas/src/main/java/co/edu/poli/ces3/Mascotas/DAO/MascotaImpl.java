package co.edu.poli.ces3.Mascotas.DAO;


import co.edu.poli.ces3.Mascotas.Models.Mascota;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional

public class MascotaImpl implements MascotaDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Mascota> getMascotas() {
        String query = "FROM Mascota";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Mascota getMascota(int id) {
        return  entityManager.find(Mascota.class,id);
    }

    @Override
    public Mascota createMascota(Mascota mascota) {
        entityManager.persist(mascota);
        return mascota;
    }

    @Override
    public Mascota updateMascota(int id, Mascota mascota) {
        mascota.setId(id);
        return entityManager.merge(mascota);
    }

    @Override
    public Mascota deleteMascota(int id) {
        Mascota m=entityManager.find(Mascota.class,id);
        entityManager.remove(m);
        return m;
    }
}
