package nl.pelssersconsultancy.user.query.api.handlers;

import nl.pelssersconsultancy.user.core.events.UserRegisteredEvent;
import nl.pelssersconsultancy.user.core.events.UserRemovedEvent;
import nl.pelssersconsultancy.user.core.events.UserUpdatedEvent;
import nl.pelssersconsultancy.user.query.api.repositories.UserRepository;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ProcessingGroup("user-group")
public class UserEventHandlerImpl implements UserEventHandler {
    private final UserRepository userRepository;

    @Autowired
    public UserEventHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @EventHandler
    @Override
    public void on(UserRegisteredEvent event) {
        userRepository.save(event.getUser());
    }

    @EventHandler
    @Override
    public void on(UserUpdatedEvent event) {
        userRepository.save(event.getUser());
    }

    @EventHandler
    @Override
    public void on(UserRemovedEvent event) {
        userRepository.deleteById(event.getId());
    }
}
