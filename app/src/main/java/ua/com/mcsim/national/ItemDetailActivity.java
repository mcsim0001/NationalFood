package ua.com.mcsim.national;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class ItemDetailActivity extends AppCompatActivity {

    /*private AdView bannerView1, bannerView2;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(ItemDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(ItemDetailFragment.ARG_ITEM_ID));
            ItemDetailFragment fragment = new ItemDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.item_detail_container, fragment)
                    .commit();
        }
        ImageView back = findViewById(R.id.iv_back_arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ItemDetailActivity.super.onBackPressed();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            NavUtils.navigateUpTo(this, new Intent(this, ItemListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResume() {
        Log.d("frag", "onResume");
        super.onResume();
        /*if (bannerView1!=null) {
            bannerView1.resume();
        }*/
    }

    @Override
    public void onPause() {
        Log.d("frag", "onPause");
        /*if (bannerView1!=null) {
            bannerView1.pause();
        }*/
        super.onPause();
    }

    @Override
    public void onDestroy() {
        Log.d("frag", "onDestroy");
        /*if (bannerView1!=null) {
            bannerView1.destroy();
        }*/
        super.onDestroy();
    }
}
