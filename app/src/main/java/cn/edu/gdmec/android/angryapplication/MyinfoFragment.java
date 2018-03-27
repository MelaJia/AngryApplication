package cn.edu.gdmec.android.angryapplication;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;


public class MyinfoFragment extends Fragment  {


    private TextView f3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initView(inflater.inflate(R.layout.fragment_myinfo, null));
        return inflater.inflate(R.layout.fragment_myinfo, null);
    }

    private void initView(View inflate) {

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}
