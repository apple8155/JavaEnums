import java.util.Arrays;
import java.util.Optional;

public enum WorkStatus {

    SCHEDULED("scheduled"),

    INPROGRESS("inprogress"),

    PENDING("pending"),

    CANCELLED("cancelled");
    private String status;

    public String getStatus() {
        return status;
    }

    WorkStatus(String status) {
        this.status = status;
    }

    public static WorkStatus findByValue(String value) {
        if (null ==value || value.trim().length() < 1) {
            throw  new IllegalArgumentException("please enter the value");
        }
        Optional<WorkStatus> workStatusOptional =
                Arrays.stream(WorkStatus.values()).filter(val -> val.getStatus().equals(value)).findFirst();
         if (!workStatusOptional.isPresent()) {
             throw new IllegalArgumentException("Enter valued "+ value + " not exist" );
         }
         return workStatusOptional.get();
    }

    // final static WorkStatus SCHEDULED = new WorkStatus();
    // final static WorkStatus INPROGRESS = new WorkStatus();
    // final static WorkStatus PENDING = new WorkStatus();
    // final static WorkStatus CANCELLED = new WorkStatus();
}
