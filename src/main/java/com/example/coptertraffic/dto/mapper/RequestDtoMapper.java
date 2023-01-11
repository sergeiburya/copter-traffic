package com.example.coptertraffic.dto.mapper;

public interface RequestDtoMapper<D, T> {
    T mapToModel(D dto);
}
