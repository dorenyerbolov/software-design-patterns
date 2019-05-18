public class SessionManager {
    private static volatile SessionManager sManager;

    private SessionManager() {
    }

    public static SessionManager getInstance() {
        if (sManager == null) {
            synchronized (SessionManager.class) {
                if (sManager == null) {
                    sManager = new SessionManager();
                }
            }
        }
        return sManager;
    }

    /* This method is good in case of simultaneous access from both threads[thread-safe],
    but despite this fact, we can see that there's a clear performance drawback: each time
    we want to get instance of our SessionManager.(synchronized, as in simple lazy initialization)
     */
}
