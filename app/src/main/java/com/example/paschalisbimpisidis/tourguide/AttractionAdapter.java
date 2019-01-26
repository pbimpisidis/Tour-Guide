package com.example.paschalisbimpisidis.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    /**Resource ID for the background color for this list of Attractions*/
    private int mColorResourceId;

    /**
     * Create a new {@link AttractionAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param attractions   is the list of {@link Attractions}s to be displayed.
     */
    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colorResourceId) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if the existing view is being used, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_title
        TextView attractionTitle = listItemView.findViewById(R.id.attraction_title);

        // Get the attraction title from the currentAttraction object and
        // set this text on the attractionTitle TextView
        attractionTitle.setText(currentAttraction.getAttractionTitle());

        // Find the TextView in the list_item.xml layout with the ID attraction_address
        TextView attractionAddress = listItemView.findViewById(R.id.attraction_address);

        // Get the attraction address from the currentAttraction object and
        // set this text on the attractionAddress TextView
        attractionAddress.setText(currentAttraction.getAttractionAddress());

        // Find the TextView in the list_item.xml layout with the ID attraction_info
        TextView attractionInfo = listItemView.findViewById(R.id.attraction_info);

        // Get the attraction information from the currentAttraction object and
        // set this text on the attractionInfo TextView
        attractionInfo.setText(currentAttraction.getAttractionInfo());

        // Find the ImageView in the list_item.xml layout with the ID default_text_view
        ImageView imageView = listItemView.findViewById(R.id.image);

        if (currentAttraction.hasImage()) {
            // set the image on the image view
            imageView.setImageResource(currentAttraction.getImageResourceId());
            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        //Set the the color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
