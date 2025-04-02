package com.netflex.main;

import com.netflex.abstractfactory.NetflexWebsiteSubscriptionFactory;
import com.netflex.abstractfactory.User;
import com.netflex.builder.Movie;
import com.netflex.builder.MovieBuilder;
import com.netflex.builder.MovieDirector;
import com.netflex.prototype.AbstractThumbnail;
import com.netflex.prototype.FullHdThumbnail;
import com.netflex.prototype.PrototypeCollection;
import com.netflex.prototype.UltraHdThumbnail;

public class Main {
    public static void main(String[] args) {
        User user = new User(new NetflexWebsiteSubscriptionFactory());
        user.getDetails();

        AbstractThumbnail thumbnail1 =
                new FullHdThumbnail("Interstellar", "RO");
        thumbnail1.display();
        AbstractThumbnail thumbnail2 =
                new UltraHdThumbnail("Friends", "MD");
        thumbnail2.display();
        try {
            AbstractThumbnail thumbnail3 = (AbstractThumbnail) thumbnail2.clone();
            thumbnail3.display();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        PrototypeCollection prototypeCollection = new PrototypeCollection();
        AbstractThumbnail thumbnail4 = prototypeCollection.getThumbnail(1);
        AbstractThumbnail thumbnail5 = prototypeCollection.getThumbnail(2);
        thumbnail4.display();
        thumbnail5.display();

        StringBuilder sb = new StringBuilder();
        sb.append("abc").append(2).append(true);
        String s = sb.toString();
        System.out.println(s);

        Movie.Builder builder = new Movie.Builder();
        builder.addTitle("Friends").addGenre("comedy").addReleaseYear(1994);
        Movie movie = builder.build();
        System.out.println(movie);

        MovieBuilder movieBuilder = new MovieBuilder();
        movieBuilder.addTitle("Tenet");
        movieBuilder.addReleaseYear(2020);
        movieBuilder.addMinutes(150);
        Movie movie2 = movieBuilder.build();
        System.out.println(movie2);

        MovieDirector director = new MovieDirector();
        Movie movie3 = director.create("Interstellar", 200);
        System.out.println(movie3);
    }
}
