package com.netflex.main;

import java.util.List;

import com.netflex.composite.AbstractMovieComposite;
import com.netflex.composite.Movie;
import com.netflex.composite.MoviePlaylist;
import com.netflex.flyweight.LogoProperties;
import com.netflex.flyweight.WebsiteLogo;
import com.netflex.flyweight.WebsiteLogoFactory;
import com.netflex.proxy.AbstractSearchService;
import com.netflex.proxy.SearchCachingProxy;
import com.netflex.proxy.SearchService;

public class Main {
    public static void main(String[] args) {
        AbstractSearchService searchService = new SearchService();
        List<String> movies = searchService.search("an");
        System.out.println(movies);

        searchService = new SearchCachingProxy(new SearchService());
        movies = searchService.search("an");
        System.out.println(movies);
        movies = searchService.search("an");
        System.out.println(movies);

        AbstractMovieComposite mainPlaylist = new MoviePlaylist();
        AbstractMovieComposite friends = new Movie("Friends");
        AbstractMovieComposite seinfeld = new Movie("Seinfeld");
        AbstractMovieComposite seriesPlaylist = new MoviePlaylist();
        seriesPlaylist.addPlaylistElement(friends);
        seriesPlaylist.addPlaylistElement(seinfeld);
        AbstractMovieComposite antman = new Movie("Antman");
        AbstractMovieComposite playlist1 = new MoviePlaylist();
        playlist1.addPlaylistElement(antman);
        playlist1.addPlaylistElement(seriesPlaylist);
        AbstractMovieComposite titanic = new Movie("Titanic");
        mainPlaylist.addPlaylistElement(playlist1);
        mainPlaylist.addPlaylistElement(titanic);
        mainPlaylist.displayPlaylist();

        System.out.println();
        MoviePlaylist newPlaylist = new MoviePlaylist();
        newPlaylist.addPlaylistElement(antman);
        newPlaylist.addPlaylistElement(new Movie("Spiderman"));
        playlist1.deletePlaylistElement(antman);
        mainPlaylist.addPlaylistElement(newPlaylist);
        mainPlaylist.displayPlaylist();

        WebsiteLogoFactory factory = new WebsiteLogoFactory();
        WebsiteLogo netflexLogo = factory.getLogo("netflex");
        LogoProperties properties = new LogoProperties();
        properties.height = 50;
        properties.width = 50;
        properties.x = 100;
        properties.y = 10;
        netflexLogo.display(properties);
    }
}
