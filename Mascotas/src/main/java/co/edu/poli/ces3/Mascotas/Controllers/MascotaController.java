package co.edu.poli.ces3.Mascotas.Controllers;

import co.edu.poli.ces3.Mascotas.DAO.MascotaDao;
import co.edu.poli.ces3.Mascotas.Models.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private MascotaDao mascotaDao;

    @RequestMapping(value = "test")
    public String test(){
        return "Hola Spring Boot";
    }

    @RequestMapping(value = "api/mascotas", method = RequestMethod.GET)
    public List<Mascota> getMascotas(){

        return mascotaDao.getMascotas();
    }
    @RequestMapping(value = "api/mascota/{id}", method = RequestMethod.GET)
    public Mascota getMascota(@PathVariable("id") int id){
        return mascotaDao.getMascota(id);
    }

    @RequestMapping(value = "api/mascota", method = RequestMethod.POST)
    public Mascota createMascota(@RequestBody Mascota e){
        return mascotaDao.createMascota(e);
    }

    @RequestMapping(value = "api/mascota/{id}", method = RequestMethod.PUT)
    public Mascota updateEmployee(@PathVariable("id") int id, @RequestBody Mascota m){
        return mascotaDao.updateMascota(id, m);
    }

    @RequestMapping(value = "api/mascota/{id}", method = RequestMethod.DELETE)
    public Mascota deleteMascota(@PathVariable("id") int id){
        return mascotaDao.deleteMascota(id);
    }


}
