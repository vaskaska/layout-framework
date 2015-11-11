package com.statravel.qa.config;

import com.statravel.qa.domain.POS;

import java.util.HashMap;
import java.util.Properties;


public class Configuration {
	
	private String seleniumHost;

	private String seleniumPort;

	private Boolean remote;
	
	private String url_uk;
	
	private String url_us;
	
	private String url_au;
	
	private String url_nz;
	
	private String url_sg;
	
	private String url_fr;
	
	private String url_de;
	
	private String url_at;
	
	private String url_za;
	
	private String url_th;
	
	private HashMap<String, Properties> posConfiguration;
	
	public String getSeleniumHost() {
		return seleniumHost;
	}

	public void setSeleniumHost(String seleniumHost) {
		this.seleniumHost = seleniumHost;
	}

	public String getSeleniumPort() {
		return seleniumPort;
	}

	public void setSeleniumPort(String seleniumPort) {
		this.seleniumPort = seleniumPort;
	}

	public Boolean getRemote() {
		return remote;
	}

	public void setRemote(Boolean remote) {
		this.remote = remote;
	}

	public String getUrl_uk() {
		return url_uk;
	}

	public void setUrl_uk(String url_uk) {
		this.url_uk = url_uk;
	}

	public String getUrl_us() {
		return url_us;
	}

	public void setUrl_us(String url_us) {
		this.url_us = url_us;
	}

	public String getUrl_au() {
		return url_au;
	}

	public void setUrl_au(String url_au) {
		this.url_au = url_au;
	}

	public String getUrl_nz() {
		return url_nz;
	}

	public void setUrl_nz(String url_nz) {
		this.url_nz = url_nz;
	}

	public String getUrl_sg() {
		return url_sg;
	}

	public void setUrl_sg(String url_sg) {
		this.url_sg = url_sg;
	}
	
	public String getUrl_fr() {
		return url_fr;
	}

	public void setUrl_fr(String url_fr) {
		this.url_fr = url_fr;
	}

	public String getUrl_de() {
		return url_de;
	}

	public void setUrl_de(String url_de) {
		this.url_de = url_de;
	}
	
	public String getUrl_za() {
		return url_za;
	}
	
	public void setUrl_za(String url_za) {
		this.url_za = url_za;
	}
	
	public String getUrl_th() {
		return url_th;
	}

	public void setUrl_th(String url_th) {
		this.url_th = url_th;
	}

	public String getUrl_at() {
		return url_at;
	}

	public void setUrl_at(String url_at) {
		this.url_at = url_at;
	}
	
	public HashMap<String, Properties> getPosConfiguration() {
		return posConfiguration;
	}

	public void setPosConfiguration(HashMap<String, Properties> posConfiguration) {
		this.posConfiguration = posConfiguration;
	}
	
	public String getPosConfigurationProperty(POS pos, String property){
		String posStr = pos.toString();
		Properties posProperties = posConfiguration.get(posStr);
		return posProperties.getProperty(property);
	}
}

