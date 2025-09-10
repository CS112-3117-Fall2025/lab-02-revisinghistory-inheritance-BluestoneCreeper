public class HistoricalEvent {
    protected String description;
    protected Date eventDay;

    public HistoricalEvent() {
        this.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        this.eventDay = new Date();
    }

    public HistoricalEvent(String desc, Date date) {
        this.description = desc;
        this.eventDay = date;
    }

    public HistoricalEvent(HistoricalEvent copy) {
        this.description = copy.getDescription();
        this.eventDay = copy.getEventDay();
    }

    public String getDescription() {
        return this.description;
    }

    public Date getEventDay() {
        return new Date(this.eventDay);
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public void setEventDay(Date day) {
        this.eventDay = day;
    }

    @Override
    public String toString() {
        return ("On " + this.eventDay.toString()
                + ": "
                + this.description);
    }

    @Override
    public boolean equals(Object other) {
        HistoricalEvent otherEvent;
        if (other == null)
            return false;
        if (!(other instanceof HistoricalEvent))
            return false;
        otherEvent = (HistoricalEvent) other;
        return otherEvent.toString().equals(this.toString());
    }
}
