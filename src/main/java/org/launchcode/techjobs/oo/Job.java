package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this ();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Job)) return false;
    Job job = (Job) o;
    return getId() == job.getId();
}

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String nameValue = getName().isEmpty() ? "Data not available" : getName();
        String employerValue = getEmployer().getValue().isEmpty() ? "Data not available" : getEmployer().getValue();
        String locationValue = getLocation().getValue().isEmpty() ? "Data not available" : getLocation().getValue();
        String positionTypeValue = getPositionType().getValue().isEmpty() ? "Data not available" : getPositionType().getValue();
        String coreCompetencyValue = getCoreCompetency().getValue().isEmpty() ? "Data not available" : getCoreCompetency().getValue();
        return "\nID: " + getId() +
                "\nName: " + (getName().isEmpty() ? "Data not available" : getName()) +
                "\nEmployer: " + (getEmployer().getValue().isEmpty() ? "Data not available" : getEmployer().getValue()) +
                "\nLocation: " + (getLocation().getValue().isEmpty() ? "Data not available" : getLocation().getValue()) +
                "\nPosition Type: " + (getPositionType().getValue().isEmpty() ? "Data not available" : getPositionType().getValue()) +
                "\nCore Competency: " + (getCoreCompetency().getValue().isEmpty() ? "Data not available" : getCoreCompetency().getValue()) +
                "\n";

    }

}
