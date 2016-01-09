package com.costracrema.randomcriterion;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class RandomCriterionActivity extends ActionBarActivity {
    String[] movies = {
            "The 400 Blows - François Truffaut",
            "The Lady Vanishes - Alfred Hitchcock",
            "The Harder They Come - Perry Henzell",
            "The Seventh Seal - Ingmar Bergman",
            "The Lady Eve - Preston Sturges",
            "Big Deal on Madonna Street - Mario Monicelli",
            "My Man Godfrey - Gregory La Cava",
            "Black Orpheus - Marcel Camus",
            "Notorious - Alfred Hitchcock",
            "Children of Paradise - Marcel Carné",
            "Viridiana - Luis Bunuel",
            "La Règle du Jeu - Jean Renoir",
            "Armageddon - Michael Bay",
            "The Game - David Fincher" };

    String[] descriptions = {
            "Moving story of a young boy who, left without attention, delves into a life of petty crime.",
            "While traveling in continental Europe, a rich young playgirl realizes that an elderly lady seems to have disappeared from the train.",
            "A couple comes real hard at people",
            "A man seeks answers about life, death, and the existence of God as he plays chess against the Grim Reaper during the Black Plague.",
            "A trio of classy card sharps targets the socially awkward heir to brewery millions for his money, till one of them falls in love with him.",
            "A motley quintet of inept small-time thieves bungle the burglary of a local pawnshop in this Italian farce.",
            "A scatterbrained socialite hires a vagrant as a family butler...but there's more to Godfrey than meets the eye.",
            "A retelling of the Orpheus and Eurydice myth, set during the time of the Carnaval in Rio de Janeiro.",
            "A woman is asked to spy on a group of Nazi friends in South America. How far will she have to go to ingratiate herself with them?",
            "The theatrical life of a beautiful courtesan and the four men who love her.",
            "Viridiana, a young nun about to take her final vows, pays a visit to her widowed uncle at the request of her Mother Superior.",
            "A bourgeois life in France at the onset of World War II, as the rich and their poor servants meet up at a French chateau.",
            "After discovering that an asteroid the size of Texas is going to impact Earth in less than a month, N.A.S.A. recruits a misfit team of deep core drillers to save the planet.",
            "Wealthy San Francisco financier Nicholas Van Orton gets a strange birthday present from wayward brother Conrad: a live-action game that consumes his life."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_criterion);

        //Declare our view variables and assign them the views from the layout file
        final TextView movieLabel = (TextView)  findViewById(R.id.movieTextView);
        final TextView descriptionLabel = (TextView) findViewById(R.id.descriptionTextView);
        Button showMovieButton = (Button) findViewById(R.id.nextMovieButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The button was clicked, so update the movie label with a new movie.
                String movie = "";
                String description = "";
                //Randomly select a movie
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(movies.length);

                movie = movies[randomNumber];
                description = descriptions[randomNumber];

                // Update the label with a dynamic movie
                movieLabel.setText(movie);
                descriptionLabel.setText(description);
            }
        };
        showMovieButton.setOnClickListener(listener);
    }
}
