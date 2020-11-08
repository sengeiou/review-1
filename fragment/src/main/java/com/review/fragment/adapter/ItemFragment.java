package com.review.fragment.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.review.fragment.R;

/**
 * @author zhangquan
 */
public class ItemFragment extends Fragment {
    TextView textView;
    private static final String PARAM_TITLE = "PARAM_TITLE";

    public static Bundle getBundle(String title) {
        Bundle bundle = new Bundle();
        bundle.putString(PARAM_TITLE, title);
        return bundle;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println("onAttach--"+this);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate--"+this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("onCreateView--"+this);
        return inflater.inflate(R.layout.item_frag, container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        System.out.println("onViewCreated--"+this);
        String title = getArguments().getString(PARAM_TITLE);
        textView = view.findViewById(R.id.textView);
        textView.setText(title);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("onActivityCreated--"+this);
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("onStart--"+this);
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("onResume--"+this);
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("onPause--"+this);
    }



    @Override
    public void onStop() {
        super.onStop();
        System.out.println("onStop--"+this);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("onSaveInstanceState--"+this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy--"+this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("onDestroyView--"+this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("onDetach--"+this);
    }
}
