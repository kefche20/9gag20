package nedyalkotenev.a9gag20;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by kefch_000 on 3/11/2018.
 */
public class CommentsViewActivity extends Activity {
  /*  @Override
    public void setContentView(View view) {
        super.setContentView(R.layout.comments_view);
    }
    */
public void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    super.setContentView(R.layout.comments_view);
}


    @BindView(R.id.txt_comment) TextView comment;
    @BindView(R.id.commentWriter) EditText commentedittext;
    @BindView(R.id.commentWrite) ImageButton post;


    @OnClick(R.id.commentWrite)
    public void OnPosted()
    {
        comment.setText(commentedittext.getText());
    }
}
