import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

public class File {

    public static void saveEmployeesSpecialFormat(List<Employee> employeeList) {
        // vamos a guardar -> flujo de salida
        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream("empleados.txt");

            // necesitamos guardar, vamos a usar un buffer
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            for(Employee e : employeeList) {

                String em = e.toString() + "\n";
                bos.write(em.getBytes());
            }

            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
