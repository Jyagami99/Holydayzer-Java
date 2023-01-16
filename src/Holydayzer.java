import java.util.HashMap;
import java.util.Map;

public class Holydayzer {
    Map<String, String> holyday = new HashMap<>();

    public Holydayzer() {
        createHolydays();
    }

    public void getHolyday(String holyday) {
        String getHolyday = this.holyday.get(holyday);

        if (getHolyday == null) {
            System.out.println("Este feriado não existe!");
            return;
        }

        System.out.println("A data " + holyday + " se refere ao feriado de " + getHolyday);
    }

    public void getAllHolydays() {
        holyday.forEach((key, value) -> System.out.println("Data: " + key + ", Feriado de " + value));
    }

    public void createHolydays() {
        holyday.put("01/01/2023", "Confraternização mundial");
        holyday.put("21/02/2023", "Carnaval");
        holyday.put("17/04/2023", "Páscoa");
        holyday.put("21/04/2023", "Tiradentes");
        holyday.put("01/05/2023", "Dia do trabalho");
        holyday.put("08/06/2023", "Corpus Christi");
        holyday.put("07/09/2023", "Independência do Brasil");
        holyday.put("12/10/2023", "Nossa Senhora Aparecida");
        holyday.put("02/11/2023", "Finados");
        holyday.put("15/11/2023", "Proclamação da República");
        holyday.put("25/12/2023", "Natal");
    }
}
