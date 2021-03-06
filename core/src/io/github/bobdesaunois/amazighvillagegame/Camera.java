package io.github.bobdesaunois.amazighvillagegame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;

public class Camera
{

    private OrthographicCamera camera;

    public OrthographicCamera getCamera () { return camera; }

    public Camera ()
    {

        camera = new OrthographicCamera(1920, 1080 * (Gdx.graphics.getWidth () / Gdx.graphics.getHeight ()));
        camera.position.set (0 + (Player.TEXTURE_WIDTH / 2), camera.viewportHeight / 2, 0);

    }

    public void translate (Vector3 translation)
    {

        float translateX = translation.x;
        float translateY = translation.y;

        if (translateX != 0)
            translateX += Gdx.graphics.getDeltaTime();

        if (translateY != 0)
            translateY += Gdx.graphics.getDeltaTime();

        camera.translate (translateX, translateY);

    }

}
