package kodluyoruz.spring.core.utilities.results;

import kodluyoruz.spring.Entity.WorkToDo;

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data) {
        super(data, true);
    }

    public SuccessDataResult(T data, String message) {
        super(data, true, message);
    }

    public SuccessDataResult() {
        super(null, true);
    }

    public SuccessDataResult(String message) {
        super(null, true, message);
    }

    public SuccessDataResult(Iterable<WorkToDo> all) {
        super(all);
    }
}
