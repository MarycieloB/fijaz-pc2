package pe.edu.upc.pc202610pc02.dtos;

import java.time.LocalDate;

public class TechnicalIssueDTO {
    private int idTechnicalIssue;
    private String titleTechnicalIssue;
    private String descriptionTechnicalIssue;
    private LocalDate dateCreation;
    private LocalDate dateClose;
    private String priorityTechnicalIssue;
    private boolean statutsTechnicalIssue;

    public int getIdTechnicalIssue() {
        return idTechnicalIssue;
    }

    public void setIdTechnicalIssue(int idTechnicalIssue) {
        this.idTechnicalIssue = idTechnicalIssue;
    }

    public String getTitleTechnicalIssue() {
        return titleTechnicalIssue;
    }

    public void setTitleTechnicalIssue(String titleTechnicalIssue) {
        this.titleTechnicalIssue = titleTechnicalIssue;
    }

    public String getDescriptionTechnicalIssue() {
        return descriptionTechnicalIssue;
    }

    public void setDescriptionTechnicalIssue(String descriptionTechnicalIssue) {
        this.descriptionTechnicalIssue = descriptionTechnicalIssue;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateClose() {
        return dateClose;
    }

    public void setDateClose(LocalDate dateClose) {
        this.dateClose = dateClose;
    }

    public String getPriorityTechnicalIssue() {
        return priorityTechnicalIssue;
    }

    public void setPriorityTechnicalIssue(String priorityTechnicalIssue) {
        this.priorityTechnicalIssue = priorityTechnicalIssue;
    }

    public boolean isStatutsTechnicalIssue() {
        return statutsTechnicalIssue;
    }

    public void setStatutsTechnicalIssue(boolean statutsTechnicalIssue) {
        this.statutsTechnicalIssue = statutsTechnicalIssue;
    }
}

