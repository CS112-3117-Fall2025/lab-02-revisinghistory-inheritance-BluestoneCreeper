public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public RevisedHistoricalEvent() {
        this.description = "Lorum ipsum.";
        this.eventDay = new Date();
        this.revisedDescription = "Lorum ipsum Revised.";
        this.citation = "No Citation";
    }

    public RevisedHistoricalEvent(String OrigEvent, Date OrigDay, String revised, String citation) {
        this.description = OrigEvent;
        this.eventDay = OrigDay;
        this.revisedDescription = revised;
        this.citation = citation;
    }

    public RevisedHistoricalEvent(RevisedHistoricalEvent copy) {
        this.description = copy.getDescription();
        this.eventDay = copy.getEventDay();
        this.revisedDescription = copy.getRevisedDescription();
        this.citation = copy.getCitation();
    }

    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    public String getCitation() {
        return this.citation;
    }

    public void setRevisedDescription(String desc) {
        this.revisedDescription = desc;
    }

    public void setCitation(String cite) {
        this.citation = cite;
    }

    public void teach() {
        System.out.println("The following \"history\" was told for many years:\n\nOn " + this.eventDay.toString()
                + ": "
                + this.description
                + "\n\nBy correcting history, not just rewriting it, we are revising it to embark on the process of writing a wrong.\nHere is the revised history:\n"
                + this.revisedDescription + "\n\nSource: " + this.citation);
    }

    @Override
    public String toString() {
        return ("The following \"history\" was told for many years:\n\nOn " + this.eventDay.toString()
                + ": "
                + this.description
                + "\n\nBy correcting history, not just rewriting it, we are revising it to embark on the process of writing a wrong.\nHere is the revised history:\n"
                + this.revisedDescription + "\n\nSource: " + this.citation);
    }

    @Override
    public boolean equals(Object other) {
        RevisedHistoricalEvent otherEvent;
        if (other == null)
            return false;
        if (!(other instanceof RevisedHistoricalEvent))
            return false;
        otherEvent = (RevisedHistoricalEvent) other;
        return otherEvent.toString().equals(this.toString());
    }
}
