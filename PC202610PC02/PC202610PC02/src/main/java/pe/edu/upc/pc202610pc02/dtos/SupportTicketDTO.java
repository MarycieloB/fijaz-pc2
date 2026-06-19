package pe.edu.upc.pc202610pc02.dtos;


import java.time.LocalDate;

public class SupportTicketDTO {
    private int idTicket;
    private String titleTicket;
    private String descriptionTicket;
    private LocalDate dateCreation;
    private LocalDate dateClose;
    private boolean statusTicket;
    private String solutionTicket;

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
