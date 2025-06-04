package com.Autos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Autos.dao.AutosDao;
import com.Autos.dominio.Autos;
import com.Autos.servicio.Imp;

@SpringBootTest
@RunWith(SpringRunner.class)
class AutosApplicationTest {

    @Mock
    AutosDao dao;

    @Mock
    Imp imp;

    Autos autos = new Autos();

    @BeforeEach
    void init() {
        autos.setId(1);
        autos.setMarca("Audi");
        autos.setModelo("Z3");
        autos.setColor("azul");
        autos.setTipo("Deportivo");
        autos.setNum_puertas(2);
        autos.setPrecio(250000.00);

        Mockito.doReturn("autos").when(autos).getMarca();
    }

    // Dominio
    @Test
    void dominioTest() {
        autos = new Autos();
    }

    // Servicio
    @Test
    void listarTest() {
        Assert.assertNotNull(imp.listar());
    }

    @Test
    void listarXMarcaTest() {
        Mockito.doReturn(autos).when(dao).findAll();
        Assert.assertNotNull(imp.listarxMarca(autos));
    }

    @Test
    void guardarTest() {
        Mockito.doReturn(autos).when(dao).save(autos);
        Assert.assertNull(autos);
    }

}
