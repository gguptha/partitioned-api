package io.cloudledger.aperture.domain.instance;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InstanceRepository extends JpaRepository<Instance, UUID> {
}
