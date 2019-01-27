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
public class CafesFragment extends Fragment {

    public CafesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create an array of attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Roots", "Lintheschergasse 15", "7am-8pm"));
        attractions.add(new Attraction("Juicery 21", "Sihlstrasse 93", "7am–7pm"));
        attractions.add(new Attraction("Boreal", "Talacker 41", "9am–6:30pm"));
        attractions.add(new Attraction("Mame", "Josefstrasse 160", "Mo-Sa 8:30am–6pm"));
        attractions.add(new Attraction("eNDi", "Zypressenstrasse 49", "Mo-Sa 7am–10pm"));
        attractions.add(new Attraction("Coffee Shack", "Mullerstrasse 31", "Mo-Sa 8am–5:30pm"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single attraction.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.cafes);

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