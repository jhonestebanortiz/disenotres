package ejercicioDate;

public class Date {
    private int año;
    private int mes;
    private int dia;

    public Date(int año, int mes, int dia) {
        setDate(año, mes, dia);
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setAño(int año) {
        if (año >= 1000 && año <= 9999) {
            this.año = año;
        } else {
            System.out.println("invalido rango de año ");
        }
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Este rango de dias no es valido");
        }
    }

    public void setDate(int año, int mes, int dia) {
        setAño(año);
        setDia(dia);
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Este rango de meses no es valido");
        }
    }

    public String toString() {
        return String.format("%04d-%02d-%02d", año, mes, dia);
    }

    public static void main(String[] args) {
        Date date = new Date(2023, 8, 30);
        System.out.println(date.toString());

        date.setDate(2023, 8, 30); 
}
}