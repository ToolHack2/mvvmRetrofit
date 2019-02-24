package com.example.mvvmretrofit.service.model;

import java.util.Date;

public class Project {

    public long id;
    public String name;
    public String full_name;
    public User owner;
    public String html_url;
    public String description;
    public String url;
    public Date created_at;
    public Date updated_at;
    public Date pushed_at;
    public String git_url;
    public String ssh_url;
    public String clone_url;
    public String svn_url;
    public String homepage;
    public int stargazers_count;
    public int watchers_count;
    public String language;
    public boolean has_issues;
    public boolean has_downloads;
    public boolean has_wiki;
    public boolean has_pages;
    public int forks_count;
    public int open_issues_count;
    public int forks;
    public int open_issues;
    public int watchers;
    public String default_branch;

    public Project() {
    }

    public Project(long id, String name, String full_name, User owner, String html_url, String description, String url, Date created_at, Date updated_at, Date pushed_at, String git_url, String ssh_url, String clone_url, String svn_url, String homepage, int stargazers_count, int watchers_count, String language, boolean has_issues, boolean has_downloads, boolean has_wiki, boolean has_pages, int forks_count, int open_issues_count, int forks, int open_issues, int watchers, String default_branch) {
        this.id = id;
        this.name = name;
        this.full_name = full_name;
        this.owner = owner;
        this.html_url = html_url;
        this.description = description;
        this.url = url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.pushed_at = pushed_at;
        this.git_url = git_url;
        this.ssh_url = ssh_url;
        this.clone_url = clone_url;
        this.svn_url = svn_url;
        this.homepage = homepage;
        this.stargazers_count = stargazers_count;
        this.watchers_count = watchers_count;
        this.language = language;
        this.has_issues = has_issues;
        this.has_downloads = has_downloads;
        this.has_wiki = has_wiki;
        this.has_pages = has_pages;
        this.forks_count = forks_count;
        this.open_issues_count = open_issues_count;
        this.forks = forks;
        this.open_issues = open_issues;
        this.watchers = watchers;
        this.default_branch = default_branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }
}
