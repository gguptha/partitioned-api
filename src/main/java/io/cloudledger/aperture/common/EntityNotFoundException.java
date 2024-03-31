package io.cloudledger.aperture.common;

import java.util.UUID;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String entity, UUID id) {
        super("Could not find " + entity + " " + id);
    }
}
