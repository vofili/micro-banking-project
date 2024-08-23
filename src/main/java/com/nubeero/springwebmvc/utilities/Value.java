package com.nubeero.springwebmvc.utilities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public record Value(int id,String quote) {
}
