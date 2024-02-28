package nl.pelssersconsultancy.user.query.api.repositories;

import nl.pelssersconsultancy.user.core.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
