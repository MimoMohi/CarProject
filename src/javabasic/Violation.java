package javabasic;

public class Violation {

    private int violationNumber;
    private String violationType;
    private String violationDate;
    private String owner;
    private String automobile;

    public Violation(int violationNumber, String violationType, String violationDate, String owner, String automobile) {
        this.violationNumber = violationNumber;
        this.violationType = violationType;
        this.violationDate = violationDate;
        this.owner = owner;
        this.automobile = automobile;
    }

    public int getViolationNumber() {
        return violationNumber;
    }

    public void setViolationNumber(int violationNumber) {
        this.violationNumber = violationNumber;
    }

    public String getViolationType() {
        return violationType;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public String getViolationDate() {
        return violationDate;
    }

    public void setViolationDate(String violationDate) {
        this.violationDate = violationDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAutomobile() {
        return automobile;
    }

    public void setAutomobile(String automobile) {
        this.automobile = automobile;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < violationDate.length() - 1; i++) {
            stringBuilder.append(i);
        }
        if (stringBuilder.substring(8).equals("02")){
            return violationNumber + " - " + violationNumber + " - " + violationType + " - " + violationDate + " - " + owner;

        } else {
            return "No violations in Year 2002";
        }

    }

}

