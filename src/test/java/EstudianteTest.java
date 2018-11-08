import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EstudianteTest {

    @Test
    public void estudiante(){
        Estudiante estudiante = new Estudiante("Angello", "Valdivia", 5935787, 26);
        Materia materia1 = new Materia("Ingles", "ING1", 90);
        Materia materia2 = new Materia("Lenguajes", "LEN2", 95);
        Materia materia3 = new Materia("Sistemas", "SIS3", 98);
        List<Materia> M = new ArrayList<>();
        M.add(materia1);
        M.add(materia2);
        M.add(materia3);
        System.out.println(estudiante.getMateria("ING1",M));
        Assert.assertEquals(("ING1"+"\n"+"Ingles"+"\n"+90.0),estudiante.getMateria("ING1",M));
        System.out.println(estudiante.getMateria("LEN2",M));
        Assert.assertEquals(("LEN2"+"\n"+"Lenguajes"+"\n"+95.0),estudiante.getMateria("LEN2",M));
        System.out.println(estudiante.getMateria("SIS3",M));
        Assert.assertEquals(("SIS3"+"\n"+"Sistemas"+"\n"+98.0),estudiante.getMateria("SIS3",M));

    }

}