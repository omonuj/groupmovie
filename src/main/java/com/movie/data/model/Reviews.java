package com.movie.data.model;

import java.util.List;

public class Reviews {

    private String id;
    private String title;
    private String releaseDate;
    private String trailerLink;

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public List<String> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<String> genreList) {
        this.genreList = genreList;
    }

    public List<String> getBackdropsList() {
        return backdropsList;
    }

    public void setBackdropsList(List<String> backdropsList) {
        this.backdropsList = backdropsList;
    }

    private String poster;
    private List<String> genreList;
    private List<String> backdropsList;
}
