package pl.pjatk.zjazd3application;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "custom")
public class ExampleClass {
    private String loginUrl;
    private Credentials credentials;

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "loginUrl='" + loginUrl + '\'' +
                ", credentials=" + credentials +
                '}';
    }
}
