package practice07_filter_map;

public class Ganancias {

    private Integer ganacias;
    private String date;

    public Ganancias(Integer ganacias, String date) {
        this.ganacias = ganacias;
        this.date = date;
    }

    public Integer getGanacias() {
        return ganacias;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Ganancias{" +
                "ganacias=" + ganacias +
                ", date='" + date + '\'' +
                '}';
    }
}
