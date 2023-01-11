package com.example.coptertraffic.dto.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
