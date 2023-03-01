import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class MovieStoreTest {

    private final Movie harryPotter1 = new Movie("Harry Tarter");
    private final Movie snitar = new Movie("Snnitar");
    private final MovieStore movieStore = new MovieStore();
    private Movie harryPotter;


    @Before
    public void setUp() throws Exception {
        movieStore.add(harryPotter1);
        movieStore.add( new Movie("Prueba otro"));
        movieStore.add(snitar);
    }
    @Test
    public void returnsResultsWhenNoTittlesPartiallyMatchSearch() throws Exception {

        List<Movie> results = movieStore.findByPartialTitle("Po");
        assertThat(results.size(), is(1));
        assertThat(results, contains(harryPotter));
    }

    @Test
    public void findsMoviesWhenNoTittlesArePartiallyMatchedCaseInsensitive() throws Exception {

        List<Movie> results = movieStore.findByPartialTitle("tar");
        assertThat(results.size(), is(2));
        assertThat(results, containsInAnyOrder(snitar, harryPotter));
    }



    @Test
    public void findsMoviesWhenDirectorExactlyMatches() throws Exception {

        List<Movie> results = movieStore.findByPartialTitle("tar");
        assertThat(results.size(), is(2));
        assertThat(results, containsInAnyOrder(snitar, harryPotter1));
    }
}
