package com.api.spring_api.domain.requests;

public record TaskRequest(String name, Boolean complete, String description) {
}
