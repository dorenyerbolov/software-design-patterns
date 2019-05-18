public class SessionManager {
    private static final SessionManager sManager;

    private SessionManager() {
    }

    static {
        try {
            sManager = new SessionManager();
        } catch (Exception e) {
            throw e;
        }
    }

    public static SessionManager getInstance() {
        return sManager;
    }

    /* Almost everything the same as in Eagerly Initialized Singleton,
    but with static initialization block you are able to write some logic
    or handle any exceptions.
     */
}
