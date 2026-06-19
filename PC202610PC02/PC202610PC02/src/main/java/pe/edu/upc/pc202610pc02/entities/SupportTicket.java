package pe.edu.upc.pc202610pc02.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "SupportTicket")
public class SupportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTicket;
    @Column(name = "titleTicket",nullable = false,length = 40)
    private String titleTicket;
    @Column(name = "descriptionTicket",nullable = false,length = 400)
    private String descriptionTicket;
    @Column(name = "dateCreation",nullable = false )
    private LocalDate dateCreation;
    @Column(name = "dateClose", nullable = false)
    private LocalDate dateClose;
    @Column(name = "statusTicket",nullable = false )
    private boolean statusTicket;
    @Column(name = "solutionTicket",nullable = false,length = 400)
    private String solutionTicket;

    public SupportTicket() {
    }

    public SupportTicket(int idTicket, String titleTicket, String descriptionTicket, LocalDate dateCreation, LocalDate dateClose, boolean statusTicket, String solutionTicket) {
        this.idTicket = idTicket;
        this.titleTicket = titleTicket;
        this.descriptionTicket = descriptionTicket;
        this.dateCreation = dateCreation;
        this.dateClose = dateClose;
        this.statusTicket = statusTicket;
        this.solutionTicket = solutionTicket;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getTitleTicket() {
        return titleTicket;
    }

    public void setTitleTicket(String titleTicket) {
        this.titleTicket = titleTicket;
    }

    public String getDescriptionTicket() {
        return descriptionTicket;
    }

    public void setDescriptionTicket(String descriptionTicket) {
        this.descriptionTicket = descriptionTicket;
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

    public boolean isStatusTicket() {
        return statusTicket;
    }

    public void setStatusTicket(boolean statusTicket) {
        this.statusTicket = statusTicket;
    }

    public String getSolutionTicket() {
        return solutionTicket;
    }

    public void setSolutionTicket(String solutionTicket) {
        this.solutionTicket = solutionTicket;
    }
}
