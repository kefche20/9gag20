package nedyalkotenev.a9gag20;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static android.support.v4.content.ContextCompat.startActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Post> data = PostsDatabase.getDatabase();
        PostsAdapter adapter = new PostsAdapter(data);
        recyclerView.setAdapter(adapter);


    }
    public void goToActivity2 (View view)
    {
  //      Intent i = new Intent (this, CommentsViewActivity.class);
    //    startActivity(i);
        Intent startNewActivityOpen = new Intent(MainActivity.this, CommentsViewActivity.class);
        startActivityForResult(startNewActivityOpen, 0);
    }

  /*      public MainActivity activity;
    public void onAttach(Activity activity)
    {
        this.activity = (MainActivity) activity;
    }
public Intent i = new Intent(activity, CommentsViewActivity.class);
    @OnClick(R.id.comment)
    public void onCommentClicked() {
        startActivity(i);

    }
    */



//    public void upvoteJava(View view) {
 //   }
}
