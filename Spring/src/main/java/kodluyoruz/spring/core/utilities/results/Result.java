package kodluyoruz.spring.core.utilities.results;

import kodluyoruz.spring.Entity.WorkToDo;

public class Result {

    private boolean success;
    private String message;

    public Result(boolean success) {
        this.success = success;
    }

    public Result(boolean success, String message) {
        this(success);
        this.message = message;
    }

    public Result(Iterable<WorkToDo> all) {

    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

}