package com.cursoandroid.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);
        //esconde a statusBar e barra de navegaçao
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOpcoes);

        // esconder a ActionBar
        getSupportActionBar().hide();

        // Executar o video
        videoView.setMediaController(new MediaController((this))); // definir quais serão os controladores do video ( botoes de play, avançar e voltar)
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video); // busca o video no pacote em que se encontra pacote
        videoView.start();
    }

}
