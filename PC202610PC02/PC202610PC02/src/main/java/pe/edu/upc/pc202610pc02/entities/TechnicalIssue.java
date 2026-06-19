package pe.edu.upc.pc202610pc02.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "TechnicalIssue")
public class TechnicalIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTechnicalIssue;
    @Column(name = "titleTechnicalIssue",nullable = false,length = 40)
    private String titleTechnicalIssue;
    @Column(name = "descriptionTechnicalIssue",nullable = false,length = 200)
    private String descriptionTechnicalIssue;
    @Column(name = "dateCreation",nullable = false )
    private LocalDate dateCreation;
    @Column(name = "dateClose", nullable = false)
    private LocalDate dateClose;
    @Column(name = "priorityTechnicalIssue",nullable = false,length = 35)
    private String priorityTechnicalIssue;
    @Column(name = "statutsTechnicalIssue",nullable = false)
    private boolean statutsTechnicalIssue;

    public TechnicalIssue() {
    }

    public TechnicalIssue(int idTechnicalIssue, String titleTechnicalIssue, String descriptionTechnicalIssue, LocalDate dateCreation, LocalDate dateClose, String priorityTechnicalIssue, boolean statutsTechnicalIssue) {
        this.idTechnicalIssue = idTechnicalIssue;
        this.titleTechnicalIssue = titleTechnicalIssue;
        this.descriptionTechnicalIssue = descriptionTechnicalIssue;
        this.dateCreation = dateCreation;
        this.dateClose = dateClose;
        this.priorityTechnicalIssue = priorityTechnicalIssue;
        this.statutsTechnicalIssue = statutsTechnicalIssue;
    }

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
