package ma.emsi.servicevoiture.repository;

import ma.emsi.servicevoiture.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<Client, Long> {
}
