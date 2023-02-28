package com.ppab.ppab2p1_tugas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FragmentTugas extends Fragment {
    TextView tv1;
    public FragmentTugas() {
        // Required empty public constructor
    }

    public static FragmentTugas newInstance(){
        return new FragmentTugas();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_tugas, container, false);
        tv1 = root.findViewById(R.id.isikonten);
        return root;
    }

    public void showAll(){
        tv1.setText(R.string.isikonten2);
    }

    public void close(){
        tv1.setText(R.string.isikonten);
    }

}