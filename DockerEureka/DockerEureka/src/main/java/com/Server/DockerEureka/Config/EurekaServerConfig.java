//package com.Server.DockerEureka.Config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.netflix.eureka.server.EurekaServerConfigBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class EurekaServerConfig {
//
//    @Value("${server.port}")
//    private int serverPort;
//
//    @Value("${ssl.key-store}")
//    private String keyStore;
//
//    @Value("${ssl.key-store-password}")
//    private String keyStorePassword;
//
//    @Value("${ssl.key-alias}")
//    private String keyAlias;
//
//    @Value("${ssl.trust-store}")
//    private String trustStore;
//
//    @Value("${ssl.trust-store-password}")
//    private String trustStorePassword;
//
//    @Bean
//    public EurekaServerConfigBean eurekaServerConfig() {
//        EurekaServerConfigBean eurekaServerConfig = new EurekaServerConfigBean();
//        eurekaServerConfig.setSecurePortEnabled(true);
//        eurekaServerConfig.setSecurePort(serverPort);
//        eurekaServerConfig.setKeystoreFile(keyStore);
//        eurekaServerConfig.setKeystorePassword(keyStorePassword);
//        eurekaServerConfig.setKeyAlias(keyAlias);
//        eurekaServerConfig.setTrustStoreFile(trustStore);
//        eurekaServerConfig.setTrustStorePassword(trustStorePassword);
//        eurekaServerConfig.setClientAuth("need");
//        return eurekaServerConfig;
//    }
//
//}
