package kriti.somevalue.com.iom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ShopkeeperHistory extends Fragment {

    private List<String> list=new ArrayList();
    private ListView listView;

    public ShopkeeperHistory() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view= inflater.inflate(R.layout.fragment_shopkeeper_history, container, false);

        listView=view.findViewById(R.id.listViewShop);
        list.add("2735974535ft8bbr6e5xejctvt");
        list.add("13548248etfyjvyt6ctrdrtcjv");
        list.add("97673416exhrtr57cewx4e56v6");
        list.add("725472225cfghcrc6r7cs5r678");
        list.add("25428689cfte56644x5768b877");
        list.add("72548248hv66r5ckn7v6crr6v6");
        list.add("53756297bgvtce57yy87bt7vv7");
        list.add("38561900vyt65657775634321c");
        ArrayAdapter adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        return view;
    }

}
