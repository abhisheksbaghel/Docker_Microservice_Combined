//package com.EntryPoint.Api_Gateway.Config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.server.ConfigurableWebServerFactory;
//import org.springframework.boot.web.server.Ssl;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayConfig {
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
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("example", r -> r.path("/example")
//                        .uri("http://example.com"))
//                .build();
//    }
//
//    @Bean
//    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
//        return factory -> {
//            factory.setPort(serverPort);
//            factory.setSsl(getSslProperties());
//        };
//    }
//
//    private Ssl getSslProperties() {
//        Ssl ssl = new Ssl();
//        ssl.setKeyStore(keyStore);
//        ssl.setKeyStorePassword(keyStorePassword);
//        ssl.setKeyAlias(keyAlias);
//        ssl.setTrustStore(trustStore);
//        ssl.setTrustStorePassword(trustStorePassword);
//        return ssl;
//    }
//
//}
//
