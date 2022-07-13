package Camera.Nikon;

import Camera.FilmOperations;
import Logger.Logger;
public class NikonFilm implements FilmOperations {

    @Override
    public void engageFilmMechanism() {
        Logger.getInstance().log(getName() + " has engaged");

    }

    @Override
    public void rollFilm() {
        Logger.getInstance().log(getName() + " has rolled");

    }

    @Override
    public void releaseFilmMechanism() {
        Logger.getInstance().log(getName() + " has been released");

    }

    @Override
    public String getName() {
        return "Nikon Film";
    }
}
