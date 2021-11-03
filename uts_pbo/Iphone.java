package uts_pbo;

public class Iphone extends Handphone {
	private String Merek;
    private Double Harga;
    private String Series;

    public String getMerek() {
        return Merek;
    }
    public void setMerek(String merek) {
        Merek = merek;
    }
    public Double getHarga() {
        return Harga;
    }
    public void setHarga(Double harga) {
        Harga = harga;
    }
    public String getSeries() {
        return Series;
    }
    public void setSeries(String series) {
        Series = series;
    }

    
}