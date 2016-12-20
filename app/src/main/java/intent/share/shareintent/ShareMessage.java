package intent.share.shareintent;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

/**
 * Created by acer on 12/20/2016.
 */

public class ShareMessage {

    private Context context;

    public ShareMessage(Context context) {
        this.context = context;
    }

    public boolean onOptionsItemSelected() {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBodyText = "Check it out. Your message goes here";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
                context.startActivity(Intent.createChooser(sharingIntent, "Shearing Option"));
                return true;
    }
}
