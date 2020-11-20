package com.clubes.apiclubes.dto;

public interface BaseRepresentationBuilder<E, D, B> {

    D toRepresentation(E entity);

    E fromRepresentation(D representation, B builder);
}
