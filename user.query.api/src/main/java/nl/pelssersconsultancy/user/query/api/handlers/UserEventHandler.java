package nl.pelssersconsultancy.user.query.api.handlers;

import nl.pelssersconsultancy.user.core.events.UserRegisteredEvent;
import nl.pelssersconsultancy.user.core.events.UserRemovedEvent;
import nl.pelssersconsultancy.user.core.events.UserUpdatedEvent;

public interface UserEventHandler {
    void on(UserRegisteredEvent event);
    void on(UserUpdatedEvent event);
    void on(UserRemovedEvent event);
}
