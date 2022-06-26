/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

import java.util.Objects;

/**
 *
 * @author leste
 */
public class infoObject {
    private String title;
    private String[] autores;
    private String summary;
    private String[] keywords;
    private int id;
    
    public infoObject(){
        title = null;
        autores = null;
        summary = null;
        keywords = null;
        id = -1;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the autores
     */
    public String[] getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the keywords
     */
    public String[] getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        if (hashCode() < 0){
            this.id = hashCode()*-1;
        }else{
            this.id = hashCode();
        }
    }
    
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.title);
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final infoObject other = (infoObject) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }
    
}
