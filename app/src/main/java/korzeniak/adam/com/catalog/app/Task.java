package korzeniak.adam.com.catalog.app;

public class Task {

    private Long id;
    private String name;
    private String description;
    private Long minutesEstimation;
    private Long minutesInvested;
    private String date;
    private String deadline;
    private String status;
    private Task parentTask;

    public Task() {
    }

    public Task(String name, String description, Long minutesEstimation, Long minutesInvested, String date, String deadline, String status, Task parentTask) {
        this.name = name;
        this.description = description;
        this.minutesEstimation = minutesEstimation;
        this.minutesInvested = minutesInvested;
        this.date = date;
        this.deadline = deadline;
        this.status = status;
        this.parentTask = parentTask;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMinutesEstimation() {
        return minutesEstimation;
    }

    public void setMinutesEstimation(Long minutesEstimation) {
        this.minutesEstimation = minutesEstimation;
    }

    public Long getMinutesInvested() {
        return minutesInvested;
    }

    public void setMinutesInvested(Long minutesInvested) {
        this.minutesInvested = minutesInvested;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task getParentTask() {
        return parentTask;
    }

    public void setParentTask(Task parentTask) {
        this.parentTask = parentTask;
    }
}
