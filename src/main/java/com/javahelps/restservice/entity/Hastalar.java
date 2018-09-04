package com.javahelps.restservice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Hastalar {
    @Id
    private String hastano;
    private String adsoyad;
	private String kimlikno;
    private String dtarih;
    private String dyer;
    private String meslek;
    private String kangrubu;
    private String ceptel;
    private String adres;
    
    
	public String getHastano() {
		return hastano;
	}
	public void setHastano(String hastano) {
		this.hastano = hastano;
	}
	public String getAdsoyad() {
		return adsoyad;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public String getKimlikno() {
		return kimlikno;
	}
	public void setKimlikno(String kimlikno) {
		this.kimlikno = kimlikno;
	}
	public String getDtarih() {
		return dtarih;
	}
	public void setDtarih(String dtarih) {
		this.dtarih = dtarih;
	}
	public String getDyer() {
		return dyer;
	}
	public void setDyer(String dyer) {
		this.dyer = dyer;
	}
	public String getMeslek() {
		return meslek;
	}
	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}
	public String getKangrubu() {
		return kangrubu;
	}
	public void setKangrubu(String kangrubu) {
		this.kangrubu = kangrubu;
	}
	public String getCeptel() {
		return ceptel;
	}
	public void setCeptel(String ceptel) {
		this.ceptel = ceptel;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
    
	  @Override
	    public String toString() {
	        return "Hastalar{" + "hastano='" + hastano + '\'' 
	        		+ ", adsoyad='" + adsoyad + '\'' 
	        		+ ", kimlikno='" + kimlikno + '\''
	                + ", dtarih='" + dtarih + '\'' 
	                + ", dyer='" + dyer + '\''
	                + ", meslek='" + meslek + '\''
	                + ", kangrubu='" + kangrubu + '\''
	                + ", ceptel='" + ceptel + '\''
	                + ", adres='" + adres + '\''+ '}';
	    }
}
