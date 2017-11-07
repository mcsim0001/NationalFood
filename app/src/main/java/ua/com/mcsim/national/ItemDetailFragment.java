package ua.com.mcsim.national;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import ua.com.mcsim.national.content.Content;


public class ItemDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private Content.ContentItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("frag", "onCreate");

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = Content.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("frag", "onCreateView");
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        if (mItem != null) {
            ((WebView) rootView.findViewById(R.id.item_detail)).loadUrl(mItem.detailsUrl);
        }


        return rootView;
    }
}
