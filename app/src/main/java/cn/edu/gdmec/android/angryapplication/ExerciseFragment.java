package cn.edu.gdmec.android.angryapplication;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;


public class ExerciseFragment extends Fragment  {


    private TextView f1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initView(inflater.inflate(R.layout.fragment_exercise, null));
        return inflater.inflate(R.layout.fragment_exercise, null);
    }

    private void initView(View inflate) {

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}
