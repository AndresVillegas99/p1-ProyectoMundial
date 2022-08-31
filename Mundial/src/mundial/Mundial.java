package mundial;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Mundial {

    public static ArrayList<String> grupo1 = new ArrayList<>();
    public static ArrayList<String> grupo2 = new ArrayList<>();
    public static ArrayList<String> grupo3 = new ArrayList<>();
    public static ArrayList<String> grupo4 = new ArrayList<>();
    public static ArrayList<String> grupo5 = new ArrayList<>();
    public static ArrayList<String> grupo6 = new ArrayList<>();
    public static ArrayList<String> grupo7 = new ArrayList<>();
    public static ArrayList<String> grupo8 = new ArrayList<>();
    public static ArrayList<String> octavos = new ArrayList<>();
    public static ArrayList<Integer> puntaje = new ArrayList<>();
    public static ArrayList<Integer> Ganados = new ArrayList<>();
    public static ArrayList<Integer> perdidos = new ArrayList<>();
    public static ArrayList<Integer> empatados = new ArrayList<>();
    public static ArrayList<ArrayList> puntajeviejo = new ArrayList<>();
    public static ArrayList<Integer> puntajeviejo1 = new ArrayList<>();
    public static ArrayList<Integer> puntajeviejo2 = new ArrayList<>();
    public static ArrayList<Integer> puntajeviejo3 = new ArrayList<>();
    public static ArrayList<Integer> puntajeviejo4 = new ArrayList<>();
    public static ArrayList<Integer> puntajeviejo5 = new ArrayList<>();
    public static ArrayList<Integer> puntajeviejo6 = new ArrayList<>();
    public static ArrayList<Integer> puntajeviejo7 = new ArrayList<>();
    public static ArrayList<Integer> puntajeviejo8 = new ArrayList<>();
    public static ArrayList<ArrayList> cuartos = new ArrayList<>();
    public static ArrayList<String> cuartos1 = new ArrayList<>();
    public static ArrayList<String> cuartos2 = new ArrayList<>();
    public static ArrayList<String> cuartos3 = new ArrayList<>();
    public static ArrayList<String> cuartos4 = new ArrayList<>();
    public static ArrayList<String> cuartos5 = new ArrayList<>();
    public static ArrayList<String> cuartos6 = new ArrayList<>();
    public static ArrayList<String> cuartos7 = new ArrayList<>();
    public static ArrayList<String> cuartos8 = new ArrayList<>();
    public static ArrayList<Integer> puntaje1 = new ArrayList<>();
    public static ArrayList<Integer> puntaje2 = new ArrayList<>();
    public static ArrayList<Integer> puntaje3 = new ArrayList<>();
    public static ArrayList<Integer> puntaje4 = new ArrayList<>();
    public static ArrayList<Integer> puntaje5 = new ArrayList<>();
    public static ArrayList<Integer> puntaje6 = new ArrayList<>();
    public static ArrayList<Integer> puntaje7 = new ArrayList<>();
    public static ArrayList<Integer> puntaje8 = new ArrayList<>();
    public static ArrayList<Integer> CuartosPuntajes = new ArrayList<>();
    public static ArrayList<ArrayList> grupos = new ArrayList<>();
    public static ArrayList<ArrayList> Puntajes = new ArrayList<>();
    public static ArrayList<String> cuartosReales = new ArrayList<>();
    public static ArrayList<String> finalista = new ArrayList<>();

    public static ArrayList<String> pais = new ArrayList<>(
            Arrays.asList(
                    "Costa Rica",
                    "MÃ©xico",
                    "Alemania",
                    "PanamÃ¡",
                    "Uruguay",
                    "EspaÃ±a",
                    "Brasil",
                    "Croacia",
                    "Argentina",
                    "Rusia",
                    "Portugal",
                    "Francia",
                    "Australia",
                    "Corea del Sur",
                    "Egipto",
                    "Inglaterra",
                    "PerÃº",
                    "JapÃ³n",
                    "BÃ©lgica",
                    "Islandia",
                    "Marruecos",
                    "Suiza",
                    "Arabia Saudita",
                    "Serbia",
                    "Nigeria",
                    "Senegal",
                    "Suecia",
                    "Polonia",
                    "Dinamarca",
                    "Colombia",
                    "IrÃ¡n",
                    "Tunez"
            )
    );

    public static ArrayList<String> nameGroup = new ArrayList<>(
            Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H")
    );

    public static void initDB() {
        grupos.add(grupo1);
        grupos.add(grupo2);
        grupos.add(grupo3);
        grupos.add(grupo4);
        grupos.add(grupo5);
        grupos.add(grupo6);
        grupos.add(grupo7);
        grupos.add(grupo8);
        initCT();
        initPG();
        initPGV();

    }

    public static void initCT() {
        cuartos.add(cuartos1);
        cuartos.add(cuartos2);
        cuartos.add(cuartos3);
        cuartos.add(cuartos4);
        cuartos.add(cuartos5);
        cuartos.add(cuartos6);
        cuartos.add(cuartos7);
        cuartos.add(cuartos8);

    }

    public static void initPG() {
        Puntajes.add(puntaje1);
        Puntajes.add(puntaje2);
        Puntajes.add(puntaje3);
        Puntajes.add(puntaje4);
        Puntajes.add(puntaje5);
        Puntajes.add(puntaje6);
        Puntajes.add(puntaje7);
        Puntajes.add(puntaje8);
    }

    public static void initPGV() {
        puntajeviejo.add(puntajeviejo1);
        puntajeviejo.add(puntajeviejo2);
        puntajeviejo.add(puntajeviejo3);
        puntajeviejo.add(puntajeviejo4);
        puntajeviejo.add(puntajeviejo5);
        puntajeviejo.add(puntajeviejo6);
        puntajeviejo.add(puntajeviejo7);
        puntajeviejo.add(puntajeviejo8);

    }

    public static void simulateGroupPhaseRusia2018() {
        int index = 0;

        for (int i = 0; i < pais.size(); i++) {
            if (index > 7) {
                index = 0;
            }

            grupos.get(index).add(pais.get(i));
            index++;
        }
    }

    public static void PuntajesAS() {
        int index = 0;

        for (int i = 0; i < pais.size(); i++) {
            if (index > 7) {
                index = 0;
            }

            grupos.get(index).add(pais.get(i));
            index++;
        }
    }

    public static void mostrarGrupos() {
        puntaje();
        int groupID = 0;
        int s = 0;
        for (ArrayList group : grupos) {
            System.out.println("---- [GRUPO " + nameGroup.get(groupID) + " ] ----");
            System.out.println("\t PG PP PE");

            for (String pais : (ArrayList<String>) group) {

                System.out.println("\t [" + Ganados.get(s) + "] [" + perdidos.get(s) + "] [" + empatados.get(s) + "]: " + pais);
                s++;
            }
            groupID++;

        }
    }

    public static void puntaje() {

        int pass = 3;
        int g = 0;
        int e = 0;

        for (int Equipo = 0; Equipo < pais.size(); Equipo++) {
            int G = 0;
            int P = 0;
            int E = 0;
            int pUnt = 0;

            for (int i = 0; i < pass; i++) {
                int x = (int) (Math.random() * 4);
                if (x == 2) {
                    i--;
                } else {
                    pUnt = pUnt + x;
                    if (x == 0) {
                        P = P + 1;
                    } else if (x == 1) {
                        E = E + 1;
                    } else {
                        G = G + 1;
                    }
                }

                Ganados.add(Equipo, G);
                perdidos.add(Equipo, P);
                empatados.add(Equipo, E);

            }
            System.out.println(grupos.get(g).get(e));
            System.out.println(pUnt);
            puntaje.add(pUnt);
            puntajeviejo.get(g).add(pUnt);
            System.out.println(G + " " + P + " " + E);
            e++;
            if (e >= 4) {
                e = 0;
                g++;
            }
        }
    }

    public static void MatrixPUNTAJES() {
        int index = 0;
        int j = 0;
        for (int w = 0; w < grupos.size(); w++) {  // meter los puntajes en differentes array lists de 4
            for (int i = 0; i < 4; i++) {
                Puntajes.get(index).add(puntaje.get(j));
                j++;
            }
            index++;
        }
    }

    public static void OrdenCuartos2() {
        for (int i = 0; i < pais.size(); i++) {
            for (int j = i + 1; j < puntaje2.size(); j++) {
                if (puntaje2.get(i) < puntaje2.get(j)) {
                    int tmp = puntaje2.get(i);
                    puntaje2.set(i, puntaje2.get(j));
                    puntaje2.set(j, tmp);
                }
            }
        }
    }

    public static void OrdenCuartos3() {
        for (int i = 0; i < pais.size(); i++) {
            for (int j = i + 1; j < puntaje3.size(); j++) {
                if (puntaje3.get(i) < puntaje3.get(j)) {
                    int tmp = puntaje3.get(i);
                    puntaje3.set(i, puntaje3.get(j));
                    puntaje3.set(j, tmp);
                }
            }
        }
    }

    public static void OrdenCuartos4() {
        for (int i = 0; i < pais.size(); i++) {
            for (int j = i + 1; j < puntaje4.size(); j++) {
                if (puntaje4.get(i) < puntaje4.get(j)) {
                    int tmp = puntaje4.get(i);
                    puntaje4.set(i, puntaje4.get(j));
                    puntaje4.set(j, tmp);
                }
            }
        }
    }

    public static void OrdenCuartos5() {
        for (int i = 0; i < pais.size(); i++) {
            for (int j = i + 1; j < puntaje5.size(); j++) {
                if (puntaje5.get(i) < puntaje5.get(j)) {
                    int tmp = puntaje5.get(i);
                    puntaje5.set(i, puntaje5.get(j));
                    puntaje5.set(j, tmp);
                }
            }
        }
    }

    public static void OrdenCuartos6() {
        for (int i = 0; i < pais.size(); i++) {
            for (int j = i + 1; j < puntaje6.size(); j++) {
                if (puntaje6.get(i) < puntaje6.get(j)) {
                    int tmp = puntaje6.get(i);
                    puntaje6.set(i, puntaje6.get(j));
                    puntaje6.set(j, tmp);
                }
            }
        }
    }

    public static void OrdenCuartos7() {
        for (int i = 0; i < pais.size(); i++) {
            for (int j = i + 1; j < puntaje7.size(); j++) {
                if (puntaje7.get(i) < puntaje7.get(j)) {
                    int tmp = puntaje7.get(i);
                    puntaje7.set(i, puntaje7.get(j));
                    puntaje7.set(j, tmp);
                }
            }
        }
    }

    public static void OrdenCuartos8() {
        for (int i = 0; i < pais.size(); i++) {
            for (int j = i + 1; j < puntaje8.size(); j++) {
                if (puntaje8.get(i) < puntaje8.get(j)) {
                    int tmp = puntaje8.get(i);
                    puntaje8.set(i, puntaje8.get(j));
                    puntaje8.set(j, tmp);
                }
            }
        }
    }

    public static void OrdenCuartos() {
        for (int i = 0; i < pais.size(); i++) {
            for (int j = i + 1; j < puntaje1.size(); j++) {
                if (puntaje1.get(i) < puntaje1.get(j)) {
                    int tmp = puntaje1.get(i);
                    puntaje1.set(i, puntaje1.get(j)); // se utiliza .set para igualar 2 valores y que uno de esos venga en un ArrayLists ya que un ArrayList.get(i) = x no funciona
                    puntaje1.set(j, tmp);
                }
            }
        }
        OrdenCuartos2();
        OrdenCuartos3();
        OrdenCuartos4();
        OrdenCuartos5();
        OrdenCuartos6();
        OrdenCuartos7();
        OrdenCuartos8();
    }

    public static void mayorAMenor2() {
        int e = 0;
        int v = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < grupos.get(1).size(); j++) {
                if (e >= grupos.get(1).size()) {
                    e = 0;
                }
                if (v >= grupos.get(1).size()) {
                    v = 0;
                }
                if (puntajeviejo2.get(v) == puntaje2.get(e)) {
                    cuartos.get(1).add(grupo2.get(v));
                    grupo2.remove(v);
                    puntajeviejo2.remove(v);
                    puntaje2.remove(e);
                    v++;
                    e = 0;
                } else {
                    if (puntajeviejo2.get(v) != puntaje2.get(e)) {
                        v++;
                    }
                }
            }
        }
    }

    public static void mayorAMenor3() {

        int e = 0;
        int v = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < grupos.get(2).size(); j++) {
                if (e >= grupos.get(2).size()) {
                    e = 0;
                }
                if (v >= grupos.get(2).size()) {
                    v = 0;
                }
                if (puntajeviejo3.get(v) == puntaje3.get(e)) {
                    cuartos.get(2).add(grupo3.get(v));
                    grupo3.remove(v);
                    puntajeviejo3.remove(v);
                    puntaje3.remove(e);
                    v++;
                    e = 0;
                } else {
                    if (puntajeviejo3.get(v) != puntaje3.get(e)) {
                        v++;
                    }
                }
            }
        }
    }

    public static void mayorAMenor4() {
        int e = 0;
        int v = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < grupos.get(3).size(); j++) {
                if (e >= grupos.get(3).size()) {
                    e = 0;
                }
                if (v >= grupos.get(3).size()) {
                    v = 0;
                }
                if (puntajeviejo4.get(v) == puntaje4.get(e)) {
                    cuartos.get(3).add(grupo4.get(v));
                    grupo4.remove(v);
                    puntajeviejo4.remove(v);
                    puntaje4.remove(e);
                    v++;
                    e = 0;
                } else {
                    if (puntajeviejo4.get(v) != puntaje4.get(e)) {
                        v++;
                    }
                }
            }
        }
    }

    public static void mayorAMenor5() {
        int e = 0;
        int v = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < grupos.get(4).size(); j++) {
                if (e >= grupos.get(4).size()) {
                    e = 0;
                }
                if (v >= grupos.get(4).size()) {
                    v = 0;
                }
                if (puntajeviejo5.get(v) == puntaje5.get(e)) {
                    cuartos.get(4).add(grupo5.get(v));
                    grupo5.remove(v);
                    puntajeviejo5.remove(v);
                    puntaje5.remove(e);
                    v++;
                    e = 0;
                } else {
                    if (puntajeviejo5.get(v) != puntaje5.get(e)) {
                        v++;
                    }
                }
            }
        }
    }

    public static void mayorAMenor6() {
        int e = 0;
        int v = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < grupos.get(5).size(); j++) {
                if (e >= grupos.get(5).size()) {
                    e = 0;
                }
                if (v >= grupos.get(5).size()) {
                    v = 0;
                }
                if (puntajeviejo6.get(v) == puntaje6.get(e)) {
                    cuartos.get(5).add(grupo6.get(v));
                    grupo6.remove(v);
                    puntajeviejo6.remove(v);
                    puntaje6.remove(e);
                    v++;
                    e = 0;
                } else {
                    if (puntajeviejo6.get(v) != puntaje6.get(e)) {
                        v++;
                    }
                }
            }
        }
    }

    public static void mayorAMenor7() {
        int e = 0;
        int v = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < grupos.get(6).size(); j++) {
                if (e >= grupos.get(6).size()) {
                    e = 0;
                }
                if (v >= grupos.get(6).size()) {
                    v = 0;
                }
                if (puntajeviejo7.get(v) == puntaje7.get(e)) {
                    cuartos.get(6).add(grupo7.get(v));
                    grupo7.remove(v);
                    puntajeviejo7.remove(v);
                    puntaje7.remove(e);
                    v++;
                    e = 0;
                } else {
                    if (puntajeviejo7.get(v) != puntaje7.get(e)) {
                        v++;
                    }
                }
            }
        }
    }

    public static void mayorAMenor8() {
        int e = 0;
        int v = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < grupos.get(7).size(); j++) {
                if (e >= grupos.get(7).size()) {
                    e = 0;
                }
                if (v >= grupos.get(7).size()) {
                    v = 0;
                }
                if (puntajeviejo8.get(v) == puntaje8.get(e)) {
                    cuartos.get(7).add(grupo8.get(v));
                    grupo8.remove(v);
                    puntajeviejo8.remove(v);
                    puntaje8.remove(e);
                    v++;
                    e = 0;
                } else {
                    if (puntajeviejo8.get(v) != puntaje8.get(e)) {
                        v++;
                    }
                }
            }
        }
    }

    public static void mayorAMenor() {
        int e = 0;
        int v = 0;
        for (int x = 0; x < grupos.size(); x++) {
            for (int j = 0; j < 2; j++) {
                CuartosPuntajes.add((Integer) Puntajes.get(x).get(j)); // para almacenar los 2 puntajes mas altos de cada grupo
            }
        }
        for (int i = 0; i < 4; i++) { // Para que haga 4 vueltas a las listas y organizar los 4 paises en orden de mayor a menor puntos
            for (int j = 0; j < grupos.get(0).size(); j++) {//para que solo haga las vueltas necesarias ya que el valor de grupos.get(0) va a estar cambiando
                if (e >= grupos.get(0).size()) { //esto ayuda a que el index de e ni de v salga del tamaño del array
                    e = 0;
                }
                if (v >= grupos.get(0).size()) {
                    v = 0;
                }
                if (puntajeviejo1.get(v) == puntaje1.get(e)) { //esto compara el puntaje viejo y el nuevo y determina si es igual
                    cuartos.get(0).add(grupo1.get(v)); // si son iguales dependiendo de la posicion de v se escojera el pais en esa posicion
                    grupo1.remove(v); //se elimina el pais para que no se repita ningun pais
                    puntajeviejo1.remove(v);//se elimina puntaje viejo para que intente agarrar un pais que ya no existe
                    puntaje1.remove(e); //se elimina el puntaje almacenado para que no intente comparar un nuemero que no existe
                    v++;
                    e = 0;
                } else {
                    if (puntajeviejo1.get(v) != puntaje1.get(e)) {
                        v++;
                    }
                }
            }
        }
        mayorAMenor2();
        mayorAMenor3();
        mayorAMenor4();
        mayorAMenor5();
        mayorAMenor6();
        mayorAMenor7();
        mayorAMenor8();
                                        
        for (int i = 0; i < cuartos.size(); i++) {
            cuartos.get(i).remove(2);
            cuartos.get(i).remove(2);
        }

        System.out.println(cuartos);
    }

    public static void SacarOctavosYCuartos() {
        for (int i = 0; i < cuartos.size(); i++) {
            int rand = (int) (Math.random() * 2);
            cuartos.get(i).remove(rand);
        }
        System.out.println(cuartos);
        int tamaño = 7;
        for (int i = 0; i < 4; i++) {
            int rand = (int) (Math.random() * tamaño);
            cuartosReales.add((String) cuartos.get(rand).get(0));
            cuartos.remove(rand).get(0);
            tamaño = tamaño - 1;
        }
        System.out.println(cuartosReales);
        for (int i = 2; i < cuartosReales.size(); i++) {
            int rand = (int) (Math.random() * 4);
            finalista.add(cuartosReales.get(rand));
        }
        System.out.println(finalista);
        int z = 4;
        for (int i = 2; i < cuartosReales.size(); i++) {
            int rand = (int) (Math.random() * z);
            finalista.add(cuartosReales.get(rand));
            cuartosReales.remove(rand);
            z--;

            System.out.println(finalista);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        initDB();
        simulateGroupPhaseRusia2018();
        mostrarGrupos();
        MatrixPUNTAJES();
        OrdenCuartos();
        mayorAMenor();
        SacarOctavosYCuartos();
    }
}
