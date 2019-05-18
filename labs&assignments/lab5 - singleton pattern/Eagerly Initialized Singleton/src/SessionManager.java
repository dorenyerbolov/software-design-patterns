public class SessionManager {
    private static SessionManager sManager = new SessionManager();

    private SessionManager() {
    }

    public static SessionManager getInstance() {
        return sManager;
    }

    /*  The big advantage of this approach is that you won't get any
    problems with threads, as the instane of the class is created at
    the time of class-loading. But at the same time it has major drawback,
    namely it is created irrespective of whether it is needed or not, this
    may exert an unnecessary burden of system performance.
     */
}
