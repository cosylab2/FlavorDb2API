package com.example.mongodbapi.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "api.keys")
public class ApiKeyConfig {
    private String admin;
    private String premium;
    private String basic;

    public String getAdmin() { return admin; }
    public void setAdmin(String admin) { this.admin = admin; }

    public String getPremium() { return premium; }
    public void setPremium(String premium) { this.premium = premium; }

    public String getBasic() { return basic; }
    public void setBasic(String basic) { this.basic = basic; }
}
