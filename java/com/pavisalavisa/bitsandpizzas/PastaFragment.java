package com.pavisalavisa.bitsandpizzas;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.pavisalavisa.bitsandpizzas.R;

/**
 * Created by krist on 24.12.2017..
 */

public class PastaFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(inflater.getContext(),
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.pasta));
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }
}
