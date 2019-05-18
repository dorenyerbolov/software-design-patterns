public class SessionManager {
    private static SessionManager sManager;

    private SessionManager() {
    }

    public static synchronized SessionManager getInstance() {
        if (sManager == null) {
            sManager = new SessionManager();
        }
        return sManager;
    }

    /* I'm not sure that I can provide some facts in favor of this method,
    since on the one hand - it is thread-safe and compatible, but on the other
    hand - synchronized exerts loss of processing time in each access of the sync block.
     */
}
