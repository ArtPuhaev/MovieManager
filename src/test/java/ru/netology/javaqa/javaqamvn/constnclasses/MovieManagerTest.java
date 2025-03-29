package ru.netology.javaqa.javaqamvn.constnclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager movieManager = new MovieManager();
    MovieManager movieManager1 = new MovieManager(5);

    @Test
    public void shouldCheckFindAll() {

        String[] expected = {};
        String[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldAddAndFindMovie() {

        movieManager.addMovie("Film I");

        String[] expected = {"Film I"};
        String[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddAndFindMovies() {

        movieManager.addMovie("Film I");
        movieManager.addMovie("Film II");
        movieManager.addMovie("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = movieManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLatestMovies() {

        movieManager.addMovie("Film I");
        movieManager.addMovie("Film II");
        movieManager.addMovie("Film III");

        String[] expected = {"Film III", "Film II", "Film I"};
        String[] actual = movieManager.findLatest();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLatestFromFiveLimit() {

        movieManager1.addMovie("Film I");
        movieManager1.addMovie("Film II");
        movieManager1.addMovie("Film III");
        movieManager1.addMovie("Film IV");
        movieManager1.addMovie("Film V");
        movieManager1.addMovie("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = movieManager1.findLatest();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetResultLengthToFindLatest() {


        movieManager.addMovie("Film I");
        movieManager.addMovie("Film II");
        movieManager.addMovie("Film III");
        movieManager.addMovie("Film IV");
        movieManager.addMovie("Film V");
        movieManager.addMovie("Film VI");
        movieManager.addMovie("Film VII");

        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = movieManager.findLatest();
        Assertions.assertArrayEquals(expected, actual);
    }
}