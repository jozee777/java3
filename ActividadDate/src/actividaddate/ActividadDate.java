package actividaddate;

import java.util.Date;

public class ActividadDate {

    public static void main(String[] args) {

        Date fecha = new Date(120,1,12,15,1);
        System.out.println(fecha);

        System.out.println("Año: " + (fecha.getYear()+1900 ));
        System.out.println("Mes: " + fecha.getMonth());
        System.out.println("Dia: " + fecha.getDate());
        System.out.println("Dia de la semana " + fecha.getDay());
        System.out.println("Hora: " + fecha.getHours());
        System.out.println("Minutos: " + fecha.getMinutes());
        System.out.println("Segundos: " + fecha.getSeconds());

    
    }

}
