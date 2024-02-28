package nl.pelssersconsultancy.user.core.events;

import lombok.Builder;
import lombok.Data;
import nl.pelssersconsultancy.user.core.models.User;

@Data
@Builder
public class UserRegisteredEvent {
    private String id;
    private User user;
}
