package ucab.ingsw.dataApis.spotifyData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)


public class SpotifyArtists implements Serializable {
    private SpotifyTracks artists;
}