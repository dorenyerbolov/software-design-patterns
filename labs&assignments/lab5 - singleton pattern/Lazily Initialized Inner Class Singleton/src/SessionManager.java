public class SessionManager {
    private SessionManager() {
    }

    private static class SessionManagerHelper {
        private static final SessionManager MANAGER = new SessionManager();
    }

    public static SessionManager getInstance() {
        return SessionManagerHelper.MANAGER;
    }

    /* I think that this implementation of singleton pattern is considered as
    the most efficient one in comparison to others, because it is thread-safe
    and does not require any synchronization. The idea here is that the nested
    class won't be initialized until it is called. But even this implementation
    has it's own downsides, namely it is impossible to use it with non-static fields.
     */
}
