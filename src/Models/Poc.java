package Models;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Poc {

    private UUID idPoc;
    private String title;
    private ArrayList <Student> authors;
    private String advisorName;
    private String coAdvisorName;
    private Date defenseDate;
    private ArrayList <String> keywords;
    private String summary;
    private String pocArea;
    private File pdf;

    public UUID getIdPoc() {
        return idPoc;
    }

    public void setIdPoc(UUID idPoc) {
        this.idPoc = idPoc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Student> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Student> authors) {
        this.authors = authors;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public String getCoAdvisorName() {
        return coAdvisorName;
    }

    public void setCoAdvisorName(String coAdvisorName) {
        this.coAdvisorName = coAdvisorName;
    }

    public Date getDefenseDate() {
        return defenseDate;
    }

    public void setDefenseDate(Date defenseDate) {
        this.defenseDate = defenseDate;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPocArea() {
        return pocArea;
    }

    public void setPocArea(String pocArea) {
        this.pocArea = pocArea;
    }

    public File getPdf() {
        return pdf;
    }

    public void setPdf(File pdf) {
        this.pdf = pdf;
    }

}
