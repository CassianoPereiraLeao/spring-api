package com.api.spring_api.domain.requests;

public record UserRequest(String name, String email, String hash_password, Long birth_date, Boolean active) {
}
