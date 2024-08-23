package com.nubeero.springwebmvc.utilities;

public record CoreBankingServiceConfig(
        String apiUrl,
        String portNumber,
        String apiUsername,
        String apiPassword) {

}
