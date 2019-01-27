package com.example.paschalisbimpisidis.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create an array of attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("National Museum", "Museumstrasse 2", "Tu-Su 10am-5pm"));
        attractions.add(new Attraction("Kunsthaus", "Heimplatz 1", "Tu-Su 10am-8pm"));
        attractions.add(new Attraction("Fifa Museum", "Seestrasse 27", "Tu-Su 10am-7pm"));
        attractions.add(new Attraction("Tram-Museum", "Forchstrasse 20", "Sa-Mo 1pm-6pm"));
        attractions.add(new Attraction("Kulturama", "Englischviertelstrasse 9", "Tu-Su 1pm-5pm"));
        attractions.add(new Attraction("Money Museum", "Hadlaubstrasse 106", "Mo-Sa 1am–5pm"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single attraction.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.museum);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter}.
        listView.setAdapter(adapter);

        return rootView;
    }


}