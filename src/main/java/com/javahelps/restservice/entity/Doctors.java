package com.javahelps.restservice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Doctors {

    /**
     * 
     */
    @Id
    private String kullaniciadi;
	private String adsoyad;
	private String unvan;
    private String brans;
    private String ceptel;
    
    public String getKullaniciadi() {
		return kullaniciadi;
	}
	public void setKullaniciadi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}
	
	public String getAdsoyad() {
		return adsoyad;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public String getBrans() {
		return brans;
	}
	public void setBrans(String brans) {
		this.brans = brans;
	}
	public String getCeptel() {
		return ceptel;
	}
	public void setCeptel(String ceptel) {
		this.ceptel = ceptel;
	}

	  @Override
	    public String toString() {
	        return "Doctors{"+ "kullaniciadi='" + kullaniciadi + '\'' + "adsoyad='" + adsoyad + '\'' + ", unvan='" + unvan + '\'' + ", brans='" + brans + '\''
	                + ", ceptel='" + ceptel + '\'' + '}';
	    }
}
