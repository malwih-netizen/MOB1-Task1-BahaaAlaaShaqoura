package com.bahaa.task1;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/** Home screen: quick access to the 5 apps and a Light/Dark mode button. */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_theme).setOnClickListener(v -> {
            int uiMode = getResources().getConfiguration().uiMode
                    & Configuration.UI_MODE_NIGHT_MASK;
            ((Task1App) getApplication())
                    .toggleNightMode(uiMode == Configuration.UI_MODE_NIGHT_YES);
        });

        openOnClick(R.id.card_birthday, BirthdayCardActivity.class);
        openOnClick(R.id.card_task_done, TaskDoneActivity.class);
        openOnClick(R.id.card_quadrant, QuadrantActivity.class);
        openOnClick(R.id.card_article, ArticleActivity.class);
        openOnClick(R.id.card_business, BusinessCardActivity.class);
    }

    private void openOnClick(int cardId, Class<?> screen) {
        findViewById(cardId).setOnClickListener(v ->
                startActivity(new Intent(this, screen)));
    }
}
