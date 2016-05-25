package me.caiying.emoji;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static TextPaint textPaint;
    EditText editText;
    String emojiStr = "\uD83D\uDE18\uD83E\uDD14\uD83D\uDE01\uD83D\uDE08\uD83D\uDE0C\uD83D\uDE08\uD83D\uDE03\uD83D\uDE18\uD83D\uDE43\uD83D\uDC40\uD83D\uDE4C\uD83D\uDE18\uD83D\uDE18\uD83E\uDD10\uD83D\uDE18\uD83D\uDE18\uD83E\uDD10\uD83D\uDE18\uD83D\uDE18\uD83D\uDE34\uD83D\uDE18\uD83D\uDC7A\uD83D\uDE4C\uD83D\uDC64\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC8B\u200D\uD83D\uDC69\uD83D\uDC56\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66\uD83D\uDC8B\uD83D\uDC8B\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66\uD83D\uDC8D\uD83D\uDC84\uD83D\uDD76\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67\uD83D\uDC5C\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66\uD83D\uDC5B\uD83D\uDC5C\uD83D\uDC8D\uD83D\uDC8B\uD83C\uDF02\uD83C\uDF02\uD83D\uDC8B\uD83D\uDC5C\uD83C\uDF02\uD83D\uDC8B\uD83C\uDF02\uD83D\uDC8D\uD83C\uDF02\uD83D\uDC54\uD83C\uDF02\uD83D\uDC56\uD83C\uDF02\uD83D\uDC56\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC67";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edittext);
        if (textPaint == null) {
            textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        }

        textPaint.setTextSize(Emoji.dp(20));
        CharSequence mess = Emoji.replaceEmoji(emojiStr, textPaint.getFontMetricsInt(), Emoji.dp(20), false);
        editText.setText(mess);

    }
}
