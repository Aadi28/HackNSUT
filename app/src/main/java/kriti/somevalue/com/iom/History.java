package kriti.somevalue.com.iom;


import android.app.ActionBar;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class History extends Fragment {

    private ListView listView;
    private List<String> list=new ArrayList();
    private List<String> list2=new ArrayList();
    String REF_PREF="prefs";

    public History() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_history, container, false);

//        SharedPreferences sharedPreferences=getContext().getSharedPreferences(REF_PREF, Context.MODE_PRIVATE);
//        String restoredText=sharedPreferences.getString("VendorId",null);
//
//        list.add(restoredText);
//
//        listView=view.findViewById(R.id.listView);
//        ArrayAdapter adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,list);
//        listView.setAdapter(adapter);

        listView=view.findViewById(R.id.listView);

        list.add("Rohini Sec-15 Vodafone");
        list.add("Rajesh Telecom");
        list.add("Pitampura Vodafone");
        list.add("Pitampura Vodafone");
        list.add("Telecommunications sec-3");
        list.add("Airtel sec-5");
        list.add("Airtel Rohini");
        list.add("Airtel Rohini");
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);


        if(isVisibleToUser){

//            ActionBar bar=getActivity().getActionBar();
//            TextView textView=new TextView(getContext());
//            textView.setText("My History");
//            bar.setCustomView(textView);
//            bar.show();

            SharedPreferences sharedPreferences=getContext().getSharedPreferences(REF_PREF, Context.MODE_PRIVATE);
            String restoredText=sharedPreferences.getString("VendorId",null);



//            Long tslong=System.currentTimeMillis()/1000;
//            String ts=tslong.toString();


            //list.add(restoredText);
            //list2.add(ts);


            ArrayAdapter adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,list);
            listView.setAdapter(adapter);


//            ArrayAdapter adapter=new ArrayAdapter(getContext(),android.R.layout.simple_list_item_2,android.R.id.text1,list){
//                @NonNull
//                @Override
//                public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//                    View view=super.getView(position, convertView, parent);
//                    TextView text1=(TextView) view.findViewById(android.R.id.text1);
//                    TextView text2=(TextView) view.findViewById(android.R.id.text2);
//
//                    text1.setText(list.get(position).toString());
//                    text2.setText(list2.get(position).toString());
//                    return view;
//                }
//            };
        }
    }
}
