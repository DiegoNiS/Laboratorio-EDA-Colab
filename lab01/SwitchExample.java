public class SwitchExample {
    public static void main(String[] args) {
        int day = 2;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Lunes";
                break;
            case 2:
                dayName = "Martes";
                break;
            case 3:
                dayName = "Miércoles";
                break;
            case 4:
                dayName = "Jueves";
                break;
            case 5:
                dayName = "Viernes";
                break;
            case 6:
                dayName = "Sábado";
                break;
            case 7:
                dayName = "Domingo";
                break;
            default:
                dayName = "Día inválido";
        }
        System.out.println("El día de la semana es " + dayName);
    }
}

