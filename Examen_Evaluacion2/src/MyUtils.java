import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MyUtils {

        public static void escribirFicheros(HashMap<String, GerenteDep> concesionarios){

            for(Map.Entry<String, GerenteDep> entry : concesionarios.entrySet()){

                String nombreArchivo = "./src/resources/" + entry.getKey() + ".dat";

                try(ObjectOutputStream oos =
                            new ObjectOutputStream(new FileOutputStream(nombreArchivo))){

                    oos.writeObject(entry.getValue());

                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

        public static GerenteDep leerGerenteDep(String nombreArchivo){

            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))){

                return (GerenteDep) ois.readObject();

            }catch(IOException | ClassNotFoundException e){
                throw new RuntimeException(e);
            }
        }
    }
